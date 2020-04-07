(ns lets-play-music.parsers
  (:require [clojure.string :as string]))


(defn ^:private header->meta
  [header]
  (letfn [(->field [fields]
            (map #(string/split % #":") fields))
          (->key-value-pair [metadata]
            (let [key (keyword (string/trim (first metadata)))
                  value (string/trim (second metadata))]
              {key value}))]
    (->> (->field header)
         (map #(->key-value-pair %))
         (into {}))))


(defn ^:private streams->track
  [streams]
  (let [streams (map #(string/split % #" ") (rest streams))
        beats (apply max (->> streams (map #(count %))))]
    (letfn [(ignore? [note]
              (or (nil? note)
                  (= note ".")))]
      (for [i (range beats)]
        (filter
         #(not (empty? %))
         (map (fn [stream]
                (let [note (get stream i)]
                  (if (ignore? note) " " note)))
              streams))))))


(defn ->track
  [input]
  (let [sections (string/split input #"---")]
    (letfn [(divide [section]
              (string/split section #"\n"))]
      {:meta  (header->meta
               (divide (first sections)))
       :notes (streams->track
               (divide (second sections)))})))
