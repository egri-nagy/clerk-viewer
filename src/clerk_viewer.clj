(ns clerk-viewer
  (:require [nextjournal.clerk :as clerk]))

(defn -main [& args]
  (clerk/serve! {:browse? true})
  (clerk/show! (first args)))