(ns lets-play-music.converters
  (:require [dynne.sampled-sound :refer :all]))


(defn ^:private note->mp3
  [note]
  (when (not= " ")
    (str "resources/"
         (cond
           (= note "x") "hi-hat-closed"
           (= note "o") "hi-hat-open"
           (= note "S") "snare"
           (= note "B") "bass"
           (= note "C") "cymbal")
         ".mp3")))


(defn play<-mp3 [sym]
  (prn sym)
  (play (read-sound (note->mp3 sym)))
  (Thread/sleep 300))
