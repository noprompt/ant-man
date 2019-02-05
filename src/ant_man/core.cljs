(ns ant-man.core
  (:require [cljsjs.antd :as antd]
            [reagent.core :as reagent]))

;; Simple utility library for the antd library
;; https://ant.design/components

;;
;; General
;;
(def button (reagent/adapt-react-class js/antd.Button))
(def button-group (reagent/adapt-react-class js/antd.Button.Group))
(def icon (reagent/adapt-react-class js/antd.Icon))
;;
;; Layout
;;
(def layout (reagent/adapt-react-class js/antd.Layout))
(def header (reagent/adapt-react-class js/antd.Layout.Header))
(def sider (reagent/adapt-react-class js/antd.Layout.Sider))
(def content (reagent/adapt-react-class js/antd.Layout.Content))
(def footer (reagent/adapt-react-class js/antd.Layout.Footer))
(def row (reagent/adapt-react-class js/antd.Row))
(def col (reagent/adapt-react-class js/antd.Col))
;;
;; Navigation
;;
(def affix (reagent/adapt-react-class js/antd.Affix))
(def backtop (reagent/adapt-react-class js/antd.BackTop))
(def breadcrumb (reagent/adapt-react-class js/antd.Breadcrumb))
(def menu (reagent/adapt-react-class js/antd.Menu))
(def menu-item (reagent/adapt-react-class js/antd.Menu.Item))
(def menu-item-group (reagent/adapt-react-class js/antd.Menu.ItemGroup))
(def menu-submenu (reagent/adapt-react-class js/antd.Menu.SubMenu))
(def dropdown (reagent/adapt-react-class js/antd.Dropdown))
(def pagination (reagent/adapt-react-class js/antd.Pagination))
(def steps (reagent/adapt-react-class js/antd.Steps))
(def step (reagent/adapt-react-class js/antd.Steps.Step))
(def tabs (reagent/adapt-react-class js/antd.Tabs))
(def tab-pane (reagent/adapt-react-class js/antd.Tabs.TabPane))
;; ;;
;; ;; Data Entry
;; ;;
;; (def autocomplete (reagent/adapt-react-class js/antd.AutoComplete))
;; (def autocomplete.option (reagent/adapt-react-class js/antd.AutoComplete.Option))
(def cascader (reagent/adapt-react-class js/antd.Cascader))
(def checkbox (reagent/adapt-react-class js/antd.Checkbox))
(def datepicker (reagent/adapt-react-class js/antd.DatePicker))
(def datepicker-monthpicker (reagent/adapt-react-class js/antd.DatePicker.MonthPicker))
(def datepicker-rangepicker (reagent/adapt-react-class js/antd.DatePicker.RangePicker))
(def form (reagent/adapt-react-class js/antd.Form))
(def form-item (reagent/adapt-react-class js/antd.Form.Item))
(def input (reagent/adapt-react-class js/antd.Input))
(def input-search (reagent/adapt-react-class js/antd.Input.Search))
(def input-group (reagent/adapt-react-class js/antd.Input.Group))
(def input-number (reagent/adapt-react-class js/antd.InputNumber))
(def mention (reagent/adapt-react-class js/antd.Mention))
(def radio (reagent/adapt-react-class js/antd.Radio))
(def radio-group (reagent/adapt-react-class js/antd.Radio.Group))
(def rate (reagent/adapt-react-class js/antd.Rate))
(def select (reagent/adapt-react-class js/antd.Select))
(def select-option (reagent/adapt-react-class js/antd.Select.Option))
(def select-opt-group (reagent/adapt-react-class js/antd.Select.OptGroup))
(def search (reagent/adapt-react-class js/antd.Input.Search))
(def slider (reagent/adapt-react-class js/antd.Slider))
(def switch (reagent/adapt-react-class js/antd.Switch))
(def timepicker (reagent/adapt-react-class js/antd.TimePicker))
(def transfer (reagent/adapt-react-class js/antd.Transfer))
(def treeselect (reagent/adapt-react-class js/antd.TreeSelect))
(def treeselect-treenode (reagent/adapt-react-class js/antd.TreeSelect.TreeNode))
(def upload (reagent/adapt-react-class js/antd.Upload))
;;
;; Data Display
;;
(def badge (reagent/adapt-react-class js/antd.Badge))
(def calendar (reagent/adapt-react-class js/antd.Calendar))
(def card (reagent/adapt-react-class js/antd.Card))
(def carousel (reagent/adapt-react-class js/antd.Carousel))
(def collapse (reagent/adapt-react-class js/antd.Collapse))
(def collapse-panel (reagent/adapt-react-class js/antd.Collapse.Panel))
(def popover (reagent/adapt-react-class js/antd.Popover))
(def table (reagent/adapt-react-class js/antd.Table))
(def tabl-column (reagent/adapt-react-class js/antd.Table.Column))
(def table-columngroup (reagent/adapt-react-class js/antd.Table.ColumnGroup))
(def tag (reagent/adapt-react-class js/antd.Tag))
(def tag-checkabletag (reagent/adapt-react-class js/antd.Tag.CheckableTag))
(def timeline (reagent/adapt-react-class js/antd.Timeline))
(def timeline-item (reagent/adapt-react-class js/antd.Timeline.Item))
(def tooltip (reagent/adapt-react-class js/antd.Tooltip))
(def tree (reagent/adapt-react-class js/antd.Tree))
(def tree-treenode (reagent/adapt-react-class js/antd.Tree.TreeNode))
;;
;; Feedback
;;
(def alert (reagent/adapt-react-class js/antd.Alert))
(def message (reagent/adapt-react-class js/antd.message))
(def modal (reagent/adapt-react-class js/antd.Modal))
(def notification (reagent/adapt-react-class js/antd.notification))
(def popconfirm (reagent/adapt-react-class js/antd.Popconfirm))
(def progress (reagent/adapt-react-class js/antd.Progress))
(def spin (reagent/adapt-react-class js/antd.Spin))
