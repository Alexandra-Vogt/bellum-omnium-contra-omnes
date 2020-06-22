(ns render.core
  "The render module serves to translate the engine units into units that can be
  rendered by the browser and then proceeds to use the rendering.

  The game assumes that the screen is at least 512 x 512 units tall and wide,
  thus the game will always render at least 512 x 512 units. The scaling of all
  entities is done based upon this assumption."
  (:require [quil.core :as q :include-macros true]))


(def min-disp-dim 1024)

(defn to-pixels
  "This converts the engine units to pixels."
  [engine-unit scaling-factor]
  (* engine-unit scaling-factor))

(defn calculate-scaling
  "This calculates the scaling factor for the engine."
  []
  (/ (min (q/height)
          (q/width)) min-disp-dim))

(defn calculate-internal-dimensions
  "This calculates the dimensions in engine units of the display."
  []
  (if (< (q/height) (q/width))
    {:heigh  min-disp-dim
     :width  (/ (q/width) min-disp-dim)}
    {:height (/ (q/with) min-disp-dim)
     :width  min-disp-dim}))

(defn draw-state [state]
  ; Clear the sketch by filling it with light-grey color.
  (q/background 0)
  ; Set circle color.
  (q/fill (:color state) 255 255)
  ; Calculate x and y coordinates of the circle.
  (let [angle (:angle state)
        x (+ 300 (* 150 (q/cos angle)))
        y (+ 300(* 150 (q/sin angle)))]
    (q/ellipse x y 100 100)))
