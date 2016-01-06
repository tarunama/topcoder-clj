(ns topcoder.div2.writing_words)

(defn A->Z []
  (range (int \A) (inc (int \Z))))

(def alpha-and-num-map
  (zipmap (A->Z) (range 1 27)))

(defn write [s]
  (let [nums (map int (seq s))]
    (apply + (map #(get alpha-and-num-map %) nums))))