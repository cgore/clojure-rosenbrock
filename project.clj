(defproject com.cgore/rosenbrock "0.1.0-SNAPSHOT"
  :description "A Clojure library for implementing the Rosenbrock function."
  :url "https://github.com/cgore/clojure-rosenbrock"
  :scm {:name "git"
        :url "https://github.com/cgore/clojure-rosenbrock"}
  :license {:name "Apache License Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/math.numeric-tower "0.0.4"]]
  :repl-options {:init-ns rosenbrock.core})
