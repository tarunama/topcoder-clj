(ns topcoder.div2.letter-string)

(defn sum [& s]
  (count (apply str (mapcat #(re-seq #"[a-zA-Z]" %) s))))
