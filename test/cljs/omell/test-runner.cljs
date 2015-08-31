(ns omell.test-runner
  (:require
   [cljs.test :refer-macros [run-tests]]
   [omell.core-test]))

(enable-console-print!)

(defn runner []
  (if (cljs.test/successful?
       (run-tests
        'omell.core-test))
    0
    1))
