(ns static-site-generator.parser
  (:require [clojure.string :as str]))

(def indent-level (atom 0))

(def in-list (atom false))

(defn parse-blocks
  "Takes an input string, and returns a seq of block-level elements"
  [input]
  (let [lines (str/split-lines input)]
    (for [line lines]
      (println line))))
