(ns topcoder.div2.letter-string)

(defn get-only-string [s]
  (mapcat #(re-seq #"[a-zA-Z]" %) s))

(defn sum [& s]
  (count (apply str (get-only-string s))))
