(ns lets-play-music.readers
  (:require [clojure.java.io :as io]))


(defn ^:private filename
  [track]
  (str "resources/" track ".txt"))


(defn ^:private readable?
  [filename]
  (.exists (io/as-file filename)))


(defn read-track
  [input]
  (let [filename (filename input)
        read? (readable? filename)]
    (if read?
      (slurp filename)
      '())))
