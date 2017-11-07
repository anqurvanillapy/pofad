(ns pofad.minfree)

(defn minfree
  "minfree returns the smallest free number."
  [xs]
  (let [n (count xs)]
    (if-let [xs' (filter #(<= % n) xs)]
      (let [checklist
            (->> n inc range
                 (map (fn [n']
                        (->> xs' (some #(= % n')) boolean)))
                 (map-indexed vector))]
        (some #(if (false? (second %)) (first %)) checklist))
      0)))


(defn minfree-sort
  "minfree with sort."
  [coll]
  42)
