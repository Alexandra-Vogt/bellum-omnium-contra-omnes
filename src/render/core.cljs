(ns render.core
  "The render module serves to translate the engine units into units that can be
  rendered by the browser and then proceeds to use the rendering."
  (:require [quil.core :as q :include-macros true]))


(defn draw-state [state]
  ; Clear the sketch by filling it with light-grey color.
  (q/background 0)
  ; Set circle color.
  (q/fill (:color state) 255 255)
  ; Calculate x and y coordinates of the circle.
  (let [angle (:angle state)
        x (* 150 (q/cos angle))
        y (* 150 (q/sin angle))]
    ; Move origin point to the center of the sketch.
    (q/with-translation [(/ (q/width) 2)
                         (/ (q/height) 2)]
      ; Draw the circle.
      (q/ellipse x y 100 100))))
