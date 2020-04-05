# Let's play music

We want to play the drums!

## Understanding all the things

### The drum kit
The drum kit consists of multiple parts which include parts like the hi-hat, snare, crash, rider, bass, floor tom, hanging/rack toms etc.
* Each part makes a particular sound.
* Each part has a different notation in sheet music.

### Notes
A note is played on a single beat.
A note can be whole, half, quarter, eighth and sixteenth.
A note defines the loudness, pitch and timbre (quality).

### Music
* Music is organized through time using time signatures. Let's stick to 4/4 for now.
* Multiple parts can be played in a single beat (eg. hi-hat & snare/bass)

## Possible data structures

* **Drum kit**: a map of parts with associated `sound` and `notation` properties. Eg. `{:hi-hat {:sound "TS" :notation "x"}}`

* **Note**: a map of properties. Eg. `{:loudness 1 :pitch 1 :timbre 1 :length 1}` where length denotes the type of note it is (1 for hole, 1/2 for half, 1/4 for quarter, 1/8 for eighth and 1/16 for sixteenth).

* **Music:** ...

## Resources

[Understanding Time Signatures and Meters: A Musical Guide](https://www.libertyparkmusic.com/musical-time-signatures/)
