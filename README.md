# `rosenbrock`

[![Clojars Project](https://img.shields.io/clojars/v/com.cgore/rosenbrock.svg)](https://clojars.org/com.cgore/rosenbrock)

A Clojure library for implementing the Rosenbrock function.

https://en.wikipedia.org/wiki/Rosenbrock_function

## Usage


Add the following to your `project.clj`:

```clojure
[com.cgore/rosenbrock "1.0.0"]
```

And then in your actual code:

```clojure
(ns your.cool.code
  (:require [rosenbrock.core :as rosenbrock]))

(let [x 12.2
      y 14.779]
  (rosenbrock/original x y))

(let [a 12
      b 147
      x 12.2
      y 14.779]
  (rosenbrock/original a b x y))

(let [a 12
      b 147
      x 12.2
      y 14.779
      o2 (partial rosenbrock/original a b)]
  (o2 x y))
```

## License

Copyright © 2019 Christopher Mark Gore, Soli Deo Gloria, all rights reserved.

This program and the accompanying materials are made available under the
terms of the Apache License Version 2.0 which is available at
https://www.apache.org/licenses/LICENSE-2.0.txt
