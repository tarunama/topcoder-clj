(ns topcoder.div2.fox_and_game)

(defn count-stars [ss]
  (count (re-seq #"o" (apply str ss))))