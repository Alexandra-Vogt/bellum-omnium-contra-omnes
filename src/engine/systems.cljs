(ns engine.systems
  "The systems submodule contains a series of functions that define the
  various systems as well as a few macros for defining systems. Systems are
  defined as operating on a list of components with certain components. This
  allows individual systems to take a wide variety of disparate types while at
  the same time leaving quite a bit to the implementation for optimization of
  the datastructures involved.")

(defmacro defsystem
  "A macro for defining systems. `name` is the name of the system `args` is a
  list of the components whose entities it will take, `body` is the body of the
  system which is executed during every update phase and can act on the list of.
  components that contain the args provided, called \"`state`\""
  [name args & body]
  `(defn ~name [state]
     (+ state)))
