(ns reverse
  (:refer-clojure :exclude [reverse]))

(defn build-rev
	[lst accum]
  (if (empty? lst)
  	accum
    (build-rev (rest lst) (cons (first lst) accum))))

(defn reverse
  "Reverse a list"
  [lst]
  (build-rev lst []))
