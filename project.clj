(defproject notes-service "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 ;;[compojure "1.6.0"]
                 [metosin/compojure-api "2.0.0-alpha4"]
                 [ring/ring-jetty-adapter "1.5.0"]]
  :plugins [[lein-ring "0.12.1"]]
  :ring {:handler notes-service.core/app}
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
