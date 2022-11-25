(ns jamiep.repl
  (:require [nrepl.server :as nrepl-server]
            [cider.nrepl :refer (cider-nrepl-handler)])
  (:gen-class))

(defn -main [& args]
  (nrepl-server/start-server :port 54654 :handler cider-nrepl-handler))