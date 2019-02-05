# Ant-Man

Simple wrapper for Ant Design React components.

## Usage

Include Ant-Man in your `project.clj`

[![Clojars Project](https://img.shields.io/clojars/v/com.hypaer/ant-man.svg)](https://clojars.org/com.hypaer/ant-man)

Include Ant Design CSS and JavaScript CDNs

```
https://cdnjs.cloudflare.com/ajax/libs/antd/${antd_version}/antd.min.css
```

```
https://cdnjs.cloudflare.com/ajax/libs/antd/${antd_version}/antd.min.js
```

Require and use in your project

```clojure
(:require [ant-man.core :as ant-man)

;; Input field
[ant-man/input {:value @your-reagent-atom
                :id "your-id"
                :placeholder "your-placeholder"}]


;; Select input field
(def type (reagent.core/atom nil)
(def types [{:id 1 :label "uno"}
            {:id 2 :label "dos"}]

[ant-man/select {:on-change (fn [val] (reset! type val))
                 :value @type
                 :style {:width "100%"}}
  (for [{:keys [label id]} types]
    [ant-man/select-option {:value id} label])]
```

## License

Copyright © 2019 Hypaer

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
