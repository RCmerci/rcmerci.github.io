(ns utils
  (:require [clojure.java.io :as io]
            [nextjournal.clerk :as clerk])
  (:import [java.net URL]
           [java.nio.file Paths Files]
           [javax.imageio ImageIO]))

(defn load-image-local! [path]
  (let [raw-image (Files/readAllBytes (Paths/get "" (into-array [path])))]
    (with-open [in (io/input-stream raw-image)]
      (ImageIO/read in))))

(defn load-image-url! [url]
  (clerk/html [:img {:src url}]))
