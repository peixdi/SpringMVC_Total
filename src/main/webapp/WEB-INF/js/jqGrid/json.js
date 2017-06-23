define(function (require,exports) {
    require("./jquery.jqGrid");
    require("./grid.locale-cn");

    jQuery("#list").jqGrid(
        {
            url : "/test/jqgrid_json",
            datatype : "json",
            // colNames : [ 'Inv No', 'Date', 'Client', 'Amount', 'Tax','Total', 'Notes' ],//jqGrid的列显示名字
            colModel : [//jqGrid每一列的配置信息
                {name : 'id',index : 'id',width : 55},
                {name : 'invdate',index : 'invdate',width : 90},
                {name : 'name',index : 'name asc, invdate',width : 100},
                {name : 'amount',index : 'amount',width : 80,align : "right"},
                {name : 'tax',index : 'tax',width : 80,align : "right"},
                {name : 'total',index : 'total',width : 80,align : "right"},
                {name : 'note',index : 'note',width : 150,sortable : false}
            ],
            height:250,
            rowNum : 10,//每页显示记录数
            rowList : [ 10, 20, 30 ],//可供用户选择一页显示多少条
            mtype : "post",//提交方式
            // postData:{'rowlist':}, //发送数据
            viewrecords : true,//是否在浏览导航栏显示记录总数
            pager : '#pager',//表格页脚的占位符(一般是div)的id
            jsonReader : {
                root: "rows",// json中代表实际模型数据的入口
                page: "page",// json中代表当前页码的数据
                total: "total",// json中代表页码总数的数据
                records: "records" //json中代表数据行总数的数据
            },
            sortname : 'id',//初始化的时候排序的字段
            sortorder : "desc",//排序方式,可选desc,asc
            caption : "JSON Data"//Json数据
        });
    /*创建jqGrid的操作按钮容器*/
    /*可以控制界面上增删改查的按钮是否显示*/
    // jQuery("#list").jqGrid('navGrid', '#pager', {edit : false,add : false,del : false});
});