(ns lets-play-music.players
  (:require [lets-play-music.readers :as r]
            [lets-play-music.parsers :as p]
            [lets-play-music.converters :as c]
            [clj-audio.core :refer :all])
  (:import [java.util.concurrent Executors]))


(defn start
  [input]
  (let [body (r/read-track input)
        track (p/->track body)
        pool (Executors/newFixedThreadPool (count (:notes track)))]
    (doseq [[k v] (:meta track)]
      (prn (str"> " (name k) ": " v)))
    (doseq [notes (:notes track)]
      (let [tasks (for [note notes] #(c/play<-mp3 note))
            futures (.invokeAll pool tasks)]
        (for [ftr futures]
          (.get ftr))))))
