(ns notes-service.core
  (:require
    [compojure.api.sweet :refer :all]))

(defapi app
  (context "/notes" []
    (GET "/" []
      "all notes")
    (GET "/:id" [id]
         (str "note " id))))