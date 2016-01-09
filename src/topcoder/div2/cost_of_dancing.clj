(ns topcoder.div2.cost_of_dancing)

; problem description
; https://community.topcoder.com/stat?c=problem_statement&pm=13195

(defn mininum [nums n]
  (loop [x n
         ret ()
         xs (sort nums)]
    (if (zero? x)
      (apply + ret)
      (recur
        (dec x)
        (conj ret (first xs))
        (rest xs)))))