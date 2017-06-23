/**
 * Created by Admin on 2017/6/9.
 */

/*base start*/
seajs.config({
    base: "/js",
    comboExcludes: /\/js*/
})
/*base end*/

seajs.config({
    paths: {
        "arale": "http://static.zlbaba.com/arale",
        "gallery": "http://static.zlbaba.com/gallery"
    },

    alias: {
        //arale
         autocomplete: "arale/arale-autocomplete/1.4.1/autocomplete.js",
         calendar: "arale/arale-calendar/1.1.2/array.js",
         dialog: "arale/arale-dialog/1.5.8/dialog-debug.js",
         dialog_2: "arale/arale-dialog/1.5.8/dialog",
         select: "arale/arale-select/0.11.1/index-debug.js",
         sticky: "arale/arale-sticky/1.4.0/array.js",
         switchable: "arale/arale-switchable/1.1.1/switchable-debug.js",
         tip: "arale/arale-tip/1.4.1/tip-debug.js",
         validator: "arale/arale-validator/0.11.0/array.js",
         dnd: "arale/arale-dnd/1.1.0/index-debug.js",
         cookie: "arale/arale-cookie/1.1.0/array.js",
         popup: "arale/arale-popup/1.2.0/popup.js",
         widget: "arale/arale-widget/1.2.0/widget",
         //gallery
         arttemplate: "gallery/arttemplate-native/3.0.2/index",
         store: "gallery/store/1.0.1/array.js",
         kindeditor: "gallery/kindeditor/4.1.11/array.js",
         ztree: "gallery/ztree/1.0.1/array.js",
         moment: "arale/moment/2.9.0/moment",
         paging: "gallery/bt-paging/1.0.2/index",
         uri: "gallery/uri/1.0.3/index",
         overlay: "arale/arale-overlay/1.2.0/overlay",
         regionpicker: "gallery/bt-regionpicker/1.0.9/index",
         dataRegion: "gallery/data-region/1.0.2/index",
         upload: "arale/arale-upload/1.3.0/index-debug",
         upload2: "arale/arale-upload/1.3.1/index",
         underscore: "gallery/underscore/1.6.0/underscore-debug",
         paging: "gallery/bt-paging/1.1.2/index",
         qrcode: "arale/arale-qrcode/3.0.5/index-debug",
         cpcregion:"gallery/cpc-regionpicker.0.0.4/index",
         highcharts: "gallery/highcharts/4.0.5/highcharts",
         echart:"common/echarts.common.min",
         jqueryui:"common/jquery-ui",
         jquerymigrate:"common/jquery-migrate",
         jquerytree:"common/jquery.tree",
         jquery:"http://static.zlbaba.com/jquery/1.11.1/jquery.min.js",
         vue:"https://unpkg.com/vue",
         vueres:"https://cdn.jsdelivr.net/npm/vue-resource@1.3.4"
    },
    'map': [
        [ /^(.*\/.*\.(?:css|js))(.*)$/i, '$1?' +new Date().getMilliseconds() ]
    ]
})


