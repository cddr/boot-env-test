(ns database-url-test
  (:require
   [clojure.test :refer :all]
   [environ.core :refer [env]]))

(deftest test-database-uri
  (is (= "jdbc:postgres://localhost/test"
         (env :database-uri))))
