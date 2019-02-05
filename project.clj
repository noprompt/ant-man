(defproject com.hypaer/ant-man "0.1.1"
  :description "Simple wrapper for Ant Design"
  :url "https://github.com/hypaer/ant-man.git"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :min-lein-qversion "2.7.3"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.516"]
                 [cljsjs/antd "3.13.0-0"]
                 [reagent "0.8.1"]]
  :plugins [[lein-cljsbuild "1.1.7" :exclusions [org.clojure/clojure]]]
  :source-paths ["src"]
  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]
                :figwheel {:on-jsload "ant-man.core/on-js-reload"}
                :compiler {:main ant-man.core
                           :asset-path "js/compiled/out"
                           :output-to "resources/public/js/compiled/ant_man.js"
                           :output-dir "resources/public/js/compiled/out"
                           :source-map-timestamp true}}
               {:id "min"
                :source-paths ["src"]
                :compiler {:output-to "resources/public/js/compiled/ant_man.js"
                           :main ant-man.core
                           :optimizations :advanced
                           :pretty-print false}}]}
  :profiles {:dev {:source-paths ["src"]
                   :clean-targets ^{:protect false} ["resources/public/js/compiled"
                                                     :target-path]}})
