(ns engine.core
  "The engine follows an event loop. First user input occurs which then sets the
  various input flags. Then systems execution occurs on the data provided from
  the state for the frame. User input is provided raw to the systems. Systems
  are executed exclusively on data produced in the previous frames and provided
  by the user input stage. User input is preprocessed only by the input module
  and is not mutated by the code in the engine before being passed to systems,
  though systems may modify the data."
  (:require [quil.core :as q :include-macros true]
            [input.core :as input]))

(defn update-state
  "The update state."
  [state]
  {:color (mod (+ (:color state) 0.7) 255)
   :angle (+ (:angle state) 0.1)})
