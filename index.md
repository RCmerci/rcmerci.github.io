```clojure
^{:nextjournal.clerk/visibility #{:hide :hide-ns}}
(ns index
  (:require [clojure.string :as str]
            [nextjournal.clerk :as clerk]))
```			
``` clojure
(clerk/html
  (into
    [:div.md:grid.md:gap-8.md:grid-cols-2.pb-8]
    (map
      (fn [{:keys [path preview title]}]
        [:a.rounded-lg.shadow-lg.border.border-gray-300.relative.flex.flex-col.hover:border-indigo-600.group.mb-8.md:mb-0
         {:href path
          :style {:height 300}}
	     [:div.flex-auto.overflow-hidden.rounded-t-md.flex.items-center.px-3.py-4
          [:img {:src preview :width "100%" :style {:object-fit "contain"}}]]
         [:div.sans-serif.border-t.border-gray-300.px-4.py-2.group-hover:border-indigo-600
          [:div.font-bold.block.group-hover:text-indigo-600 title]]])
      [{:title "2021 => 2022"
	    :preview "https://raw.githubusercontent.com/RCmerci/rcmerci.github.io/yablog/docs/resources/361638002629_.pic_hd.jpg"
        :path "docs/notebooks/2022-1-31.html"}])))
```
