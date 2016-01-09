(ns topcoder.div2.soccer)

; problem description
; https://community.topcoder.com/stat?c=problem_statement&pm=1650

(defn calc-points [win tie]
  (apply + [(* win 3) tie]))

(defn max-points [wins ties]
  (loop [wins wins
         ties ties
         ret ()]
    (if (zero? (count wins))
      (apply max ret)
      (recur
        (rest wins)
        (rest ties)
        (conj (conj ret (calc-points (first wins) (first ties))))))))
