(defproject static-site-generator "0.1.0-SNAPSHOT"
  :description "A very small static site generator written in Clojure"
  :url "https://github.com/quanticle/clojure-static-site-generator"
  :license {:name "GPL3"
            :url "https://www.gnu.org/licenses/gpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot static-site-generator.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
