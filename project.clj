(defproject com.amperity/dialog "0.1.0-SNAPSHOT"
  :description "Logging library for integration with Ken and various outputs."
  :url "https://github.com/amperity/dialog"
  :license {:name "MIT License"
            :url "https://mit-license.org/"}

  :dependencies
  [[org.clojure/clojure "1.10.3"]
   [org.clojure/data.json "2.4.0"]
   [org.slf4j/slf4j-api "1.7.30"]
   [org.slf4j/jul-to-slf4j "1.7.30"]
   [org.slf4j/jcl-over-slf4j "1.7.30"]]

  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]

  :profiles
  {:dev
   {:dependencies [[org.clojure/tools.logging "1.2.2"]]}

   :repl
   {:source-paths ["dev"]
    :repl-options {:init-ns dialog.repl}
    :dependencies [[org.clojure/tools.namespace "1.1.0"]]
    :jvm-opts ["-XX:-OmitStackTraceInFastThrow"]}})
