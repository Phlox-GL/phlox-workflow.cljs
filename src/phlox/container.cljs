
(ns phlox.container
  (:require [phlox.core :refer [defcomp rect circle text container graphics create-list]]
            [phlox.util :refer [hslx]]))

(defcomp
 comp-container
 (store)
 (container
  {}
  (text {:text "DEMO", :style {:fill (hslx 240 80 80), :font-family "Josefin Sans"}})))
