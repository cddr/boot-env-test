(ns database-url-test
  (:require
   [clojure.test :refer :all]
   [environ.core :refer [env]]))

(deftest test-database-url
  (is (= "jdbc:postgres://localhost/test"
         (env :database-url))))
