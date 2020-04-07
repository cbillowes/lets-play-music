(ns lets-play-music.core
  (:require [lets-play-music.players :as p])
  (:gen-class))

(defn -main
  [& args]
  (loop []
    (p/start (nth args 0))
    (recur)))
