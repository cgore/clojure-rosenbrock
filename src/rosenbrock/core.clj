(ns rosenbrock.core
  "In mathematical optimization, the Rosenbrock function is a non-convex function,
  introduced by Howard H. Rosenbrock in 1960, which is used as a performance
  test problem for optimization algorithms.

  https://en.wikipedia.org/wiki/Rosenbrock_function"
  (:require [clojure.math.numeric-tower :refer [expt]]))

(defn **2
  "Uses the numeric tower expt to square a number"
  [x]
  (expt x 2))

(defn original
  "Original 2D variant of the Rosenbrock function.  The parameters `a` and `b` are
  to be fixed, and exploration occurs on `x` and `y`.  Often these parameters
  are set such that `a` is `1` and `b` is `100`, so if no `a` or `b` is
  specified then they are defaulted to that.  Otherwise, consider using
  `partial` to construct a version with the `a` and `b` you wish."
  ([x y]
   (original 1.0 100.0 x y))
  ([a b x y]
   (+ (**2 (- a x))
      (* b (**2 (- y (**2 x)))))))
