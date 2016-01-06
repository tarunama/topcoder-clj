(ns topcoder.div2.writing_words-test
  (:require [clojure.test :refer :all]
            [topcoder.div2.writing_words :refer :all]))


(deftest writing-test []
  (is
    (= (write "ABC") 6)
    (= (write "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ") 1300)
    ))