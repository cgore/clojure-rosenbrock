(ns rosenbrock.core-test
  (:require [clojure.test :refer :all]
            [rosenbrock.core :as rosenbrock]))

(deftest original
  (testing "global minimum with default `a` and `b` should be at f(x=1,y=1)"
    (is (zero? (rosenbrock/original 1 1)))
    (is (not (zero? (rosenbrock/original 5 7)))))
  (testing "setting `a` to 0 will make the global minimum at the origin"
    (is (zero? (rosenbrock/original 0 100 0 0)))
    (is (not (zero? (rosenbrock/original 0 100 1 1))))))
