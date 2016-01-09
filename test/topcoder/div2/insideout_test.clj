(ns topcoder.div2.insideout-test
  (:require [clojure.test :refer :all]
            [topcoder.div2.insideout :refer :all]))

(deftest test-inside-out
  (is (= (inside-out "I ENIL SIHTHSIREBBIG S") "THIS LINE IS GIBBERISH"))
  )
