define(function (require, exports){
    require("./jquery.jqGrid");
 require("./grid.locale-cn");

    jQuery("#list").jqGrid(
        {
            datatype: "local",//数据类型
            height: 250,
            colNames: ['Inv No', 'Date', 'Client', 'Amount', 'Tax', 'Total', 'Notes'],//列名
            colModel: [
                {name: 'id', index: 'id', width: 60, sorttype: "int"},
                {name: 'invdate', index: 'invdate', width: 90, sorttype: "date"},
                {name: 'name', index: 'name', width: 100},
                {name: 'amount', index: 'amount', width: 80, align: "right", sorttype: "float"},
                {name: 'tax', index: 'tax', width: 80, align: "right", sorttype: "float"},
                {name: 'total', index: 'total', width: 80, align: "right", sorttype: "float"},
                {name: 'note', index: 'note', width: 150, sortable: false}
            ],
            multiselect: true,//支持多项选择
            caption: "Array Data" //数组数据
        });
    var mydata = [
        {id: "1", invdate: "2007-10-01", name: "test", note: "note", amount: "200.00", tax: "10.00", total: "210.00"},
        {id: "2", invdate: "2007-10-02", name: "test2", note: "note2", amount: "300.00", tax: "20.00", total: "320.00"},
        {id: "3", invdate: "2007-09-01", name: "test3", note: "note3", amount: "400.00", tax: "30.00", total: "430.00"},
        {id: "4", invdate: "2007-10-04", name: "test", note: "note", amount: "200.00", tax: "10.00", total: "210.00"},
        {id: "5", invdate: "2007-10-05", name: "test2", note: "note2", amount: "300.00", tax: "20.00", total: "320.00"},
        {id: "6", invdate: "2007-09-06", name: "test3", note: "note3", amount: "400.00", tax: "30.00", total: "430.00"},
        {id: "7", invdate: "2007-10-04", name: "test", note: "note", amount: "200.00", tax: "10.00", total: "210.00"},
        {id: "8", invdate: "2007-10-03", name: "test2", note: "note2", amount: "300.00", tax: "20.00", total: "320.00"},
        {id: "9", invdate: "2007-09-01", name: "test3", note: "note3", amount: "400.00", tax: "30.00", total: "430.00"}
    ];
    for (var i = 0; i <= mydata.length; i++) {
        jQuery("#list").jqGrid('addRowData', i + 1, mydata[i]);/*新行的id,删除需要此id ,不经过服务器*/
    }
});
