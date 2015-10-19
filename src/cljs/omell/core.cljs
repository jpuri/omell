(ns omell.core
  (:require [om.core :as om :include-macros true]
            [om-tools.dom :as dom :include-macros true]
            [om-tools.core :refer-macros [defcomponent]]
            [omell.component :as component]))

(enable-console-print!)

(defn main []
  (om/root
   component/card {:style {:color "red"}}
   {:target (. js/document (getElementById "app"))}))
