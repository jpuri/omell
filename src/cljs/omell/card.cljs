(ns omell.component
  (:require [om.core :as om :include-macros true]
            [om-tools.dom :as dom :include-macros true]
            [om-tools.core :refer-macros [defcomponent]]))

(enable-console-print!)

(defcomponent card [sty :- {:style js/Object}  owner]
  (render-state [_ state]
    (dom/div
      (dom/div {:style (merge {
        :marginBottom 20
        :padding 40
        :borderRadius 2
        :background "#fff"
        :boxShadow "0 1px 1px rgba(0, 0, 0, 0.2)"
        :boxSizing "border-box"
      } (:style sty))} "This is going to be omell card !"))))
