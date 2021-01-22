(ns zalka.core
  (:gen-class)
  (:require [clojure.set :refer [map-invert]]

         ))

(def codes
  {\A ".-"   \J ".---" \S "..."   \1 ".----" \. ".-.-.-" \: "---..."
   \B "-..." \K "-.-"  \T "-"     \2 "..---" \, "--..--" \; "-.-.-."
   \C "-.-." \L ".-.." \U "..-"   \3 "...--" \? "..--.." \= "-...-"
   \D "-.."  \M "--"   \V "...-"  \4 "....-" \' ".----." \+ ".-.-."
   \E "."    \N "-."   \W ".--"   \5 "....." \! "-.-.--" \- "-....-"
   \F "..-." \O "---"  \X "-..-"  \6 "-...." \/ "-..-."  \_ "..--.-"
   \G "--."  \P ".--." \Y "-.--"  \7 "--..." \( "-.--."  \" ".-..-."
   \H "...." \Q "--.-" \Z "--.."  \8 "---.." \) "-.--.-" \$ "...-..-"
   \I ".."   \R ".-."  \0 "-----" \9 "----." \& ".-..."  \@ ".--.-."
   \space " "})

(defn convert-letter [letter]
  (->> (get codes letter)))



(defn morse [s]
  (->> (.toUpperCase s)
       (map convert-letter ,)))


(defn -main
  [& args]
  (doseq [arg *command-line-args*]
    (println (morse arg) "in the morse code:" args )))

