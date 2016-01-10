(ns topcoder.div2.soccer-test
  (:require [clojure.test :refer :all]
            [topcoder.div2.soccer :refer :all]))

; TODO: 例外処理の追加

(deftest test-soccer
  (is (= (max-points [1,4,3,0,0] [3,1,5,3,1]) 14))
  (is (= (max-points [12,45,20,17,48,0] [48,10,53,94,0,100]) 145))
  (is (= (max-points [35,0], [0,76]) 105))
  (is (= (max-points [0,0,0,0] [0,0,0,0]) 0))
  (is (= (max-points [13,79,26,73,14,89,71,37,89,71,19,59,39],
                     [88,27,5,70,84,94,20,50,2,11,31,22,50]) 361))
  )
