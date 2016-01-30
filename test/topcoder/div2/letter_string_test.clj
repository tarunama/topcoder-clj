(ns topcoder.div2.letter-string-test
  (:require [topcoder.div2.letter-string :refer :all]
            [clojure.test :refer :all]))

(deftest test-sum
  (is (= (sum "-") 0))
  (is (= (sum "A") 1))
  (is (= (sum "-----Abc") 3))
  (is (= (sum "-A-B-C-D", "--------EFGHI", "JKLMNOPQR", "---STU-VW-XYZ") 26))
  )
