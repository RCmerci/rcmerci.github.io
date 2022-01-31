(ns user
  (:require [nextjournal.clerk :as clerk]
            [utils]))

(comment
  (clerk/serve! {:browse? true :watch-paths ["notebooks/"]})
  (clerk/show! "notebooks/2022-1-31.clj")
  )
