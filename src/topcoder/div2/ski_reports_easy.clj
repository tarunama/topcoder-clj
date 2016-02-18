(ns topcoder.div2.ski-reports-easy)

(defn calc-pair [pair ret]
  (if (< (first pair) (second pair))
    (conj ret (- (second pair) (first pair)))))

(defn calc-cost [pairs-xs ret]
  (mapcat #(calc-pair % ret)  pairs-xs))

(defn min-cost [altitudes]
  (apply + (calc-cost (partition 2 1 altitudes) '[])))
