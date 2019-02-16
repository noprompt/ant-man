(ns antizer.macros
  (:require [clojure.string :as s]
            [ant-man.antd :as antd]))

(def antd-module 'js/antd)

(defn module-name->kebab-case
  "Converts module and sub-module names from CamelCase to kebab-case
   Examples:
     DatePicker = date-picker
     Menu.Item = menu-item"
  [input]
  (->> input
       (re-seq #"\w[a-z0-9]*")
       (map s/lower-case)
       (s/join "-")))

(defn get-module-path [module-name]
  (s/split module-name #"\."))

(def get-symbol-name (comp symbol module-name->kebab-case))

(defn define-component [antd-component]
  (let [component (name antd-component)]
    `(def ~(get-symbol-name component)
       (r/adapt-react-class
        (apply goog.object/getValueByKeys
               ~antd-module
               ~(get-module-path component))))))

(defmacro export-components []
  `(do ~@(map define-component antd/components)))
