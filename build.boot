(set-env!
 :source-paths   #{"test"}
 :dependencies   '[[adzerk/boot-test "1.0.4" :scope "test"]
                   [boot-environ "1.0.0-RC1"]
                   [mbuczko/boot-ragtime "0.1.2"]                   
                   [environ "1.0.0"]])

(require '[adzerk.boot-test :refer :all])
(require '[mbuczko.boot-ragtime :refer :all])
(require '[environ.boot :refer [environ]])
(require '[environ.core :refer [env]])

(deftask as-test
  "Profile setup for running tests."
  []
  (environ :env {:database-url "jdbc:postgres://localhost/test"}))

(deftask as-dev
  "Profile setup for developing."
  []
  (environ :env {:database-url "jdbc:postgres://localhost/dev"}))

(deftask run-test
  []
  (comp (as-test)
        (test)))

