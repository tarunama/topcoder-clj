(ns topcoder.div2.ski-reports-easy)

(defn calc-cost [pairs-xs ret]
  (mapcat #(if (< (first %) (second %)) (conj ret (- (second %) (first %))))
       pairs-xs))

(defn min-cost [altitudes]
  (apply + (calc-cost (partition 2 1 altitudes) '[])))
