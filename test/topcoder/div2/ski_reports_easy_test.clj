(ns topcoder.div2.ski-reports-easy-test
  (:require [topcoder.div2.ski-reports-easy :refer [min-cost]]
            [clojure.test :refer :all]))

(deftest test-min-cost
  (is (= (min-cost '(30 20 20 10)) 0))
  (is (= (min-cost '(5 7 3)) 2))
  (is (= (min-cost '(6 8 5 4 7 4 2 3 1)) 6))
  (is (= (min-cost '(749 560 921 166 757 818 228 584 366 88)) 2284))
  (is (= (min-cost '(712, 745, 230, 200, 648, 440, 115, 913, 627, 621, 186, 222, 741, 954, 581, 193, 266, 320, 798, 745)) 6393))
  )
