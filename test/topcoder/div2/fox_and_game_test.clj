(ns topcoder.div2.fox_and_game-test
  (:require [clojure.test :refer :all]
            [topcoder.div2.fox_and_game :refer :all]))

(deftest test-fox-and-game
  (is (= (count-stars '("ooo" "ooo")) 6))
  (is (= (count-stars '("xxo" "xxx")) 1))
  )
