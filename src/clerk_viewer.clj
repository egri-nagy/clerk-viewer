(ns clerk-viewer
  (:require [nextjournal.clerk :as clerk])
  (:gen-class))

(defn -main [& args]
  (clerk/serve! {:browse? true})
  (clerk/show! (first args)))
