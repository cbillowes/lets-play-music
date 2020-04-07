(defproject lets-play-music "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojars.beppu/clj-audio "0.3.0"]
                 [com.googlecode.soundlibs/mp3spi "1.9.5.4"]
                 [org.craigandera/dynne "0.4.1"]]
  :main ^:skip-aot lets-play-music.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
