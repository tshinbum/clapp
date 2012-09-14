(ns clapp.core
  (:gen-class))

(load "database")

(defn more
  "I do a little more.."
  []
  (println "Although, it's not much."))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (more)
  (harmless))
