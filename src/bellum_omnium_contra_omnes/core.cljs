(ns bellum-omnium-contra-omnes.core
  (:require [quil.core :as q :include-macros true]
            [quil.middleware :as m]
            [engine.core :as engine]
            [render.core :as render]
            [input.core :as input]))

(defn setup []
  (q/frame-rate 30)
  (q/cursor :cross)
  {:player {:position {:x 0
                       :y 0}
            :speed {:x 0
                    :y 0}}
   :enimies []
   })

  (defn ^:export run-sketch []
  (let [width (- (.-innerWidth js/window) 15)
        height (- (.-innerHeight js/window) 20)]
    (q/defsketch bellum-omnium-contra-omnes
      :host "bellum-omnium-contra-omnes"
      :size [width height]
      :setup setup
      :update engine/update-state
      :draw render/draw-state
      :middleware [m/fun-mode])))

(run-sketch)
