(ns omell.core
  (:require [om.core :as om :include-macros true]
            [om-tools.dom :as dom :include-macros true]
            [om-tools.core :refer-macros [defcomponent]]))

(enable-console-print!)

(defcomponent card [style :- {:style js/Object}  owner]
  (render-state [_ state]
    (dom/div
      (dom/div {:style {
        :marginBottom 20
        :padding 40
        :borderRadius 2
        :background "#fff"
        :boxShadow "0 1px 1px rgba(0, 0, 0, 0.2)"
        :boxSizing "border-box"
      }} "This is going to be omell card !"))))

(defn main []
  (om/root
   card {:style {:color "red"}}
   {:target (. js/document (getElementById "app"))}))
