(ns topcoder.div2.cod-test
  (:require [clojure.test :refer :all]
            [topcoder.div2.cost_of_dancing :refer :all]))

(deftest test-cost-of-dancing
  (is (= 4 (mininum '(1 5 3 4) 2)))
  (is (= 10 (mininum '(1 5 4) 3)))
  (is (= 2 (mininum '(2, 2, 4, 5, 3) 1)))
  (is (= 20431 (mininum '(973, 793, 722, 573, 521, 568, 845, 674, 595, 310, 284, 794,
                     913, 93, 129, 758, 108, 433, 181, 163, 96, 932, 703, 989, 884, 420, 615, 991,
                     364, 657, 421, 336, 801, 142, 908, 321, 709, 752, 346, 656, 413, 629, 801)
                  39)))
  )
