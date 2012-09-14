(ns clapp.core
  (:use [clojure.java.jdbc :as sql]))

(def sqlite-db {:subprotocol "sqlite"
               :subname "bla.db"})

(sql/with-connection sqlite-db
    (sql/insert-records :fruit
        {:name "Apple" :appearance "rosy" :cost 24}
        {:name "Orange" :appearance "round" :cost 49}))

(sql/with-connection sqlite-db
    (sql/with-query-results rows
        ["SELECT * FROM fruit WHERE appearance = ?" "rosy"]
        (:cost (first rows))))

(defn harmless
  "I really do not do very mucho.."
  []
  (println "That's true."))
