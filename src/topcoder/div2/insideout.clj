(ns topcoder.div2.insideout)

(defn split-str [ss len]
  (split-at (/ len 2) ss))

(defn reverse-join-str [ss]
  (mapcat #(reverse %) ss))

(defn inside-out [ss]
  (let [len (count ss)]
    (clojure.string/join (reverse-join-str (split-str ss len)))))
