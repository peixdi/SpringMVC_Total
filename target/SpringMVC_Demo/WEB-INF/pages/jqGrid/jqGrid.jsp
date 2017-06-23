<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2017/6/22
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jqGrid</title>
    <script type="text/javascript" src="/js/seajs/sea.js"></script>
    <script type="text/javascript" src="/js/seajs/sea-config.js"></script>
    <!-- jqGrid组件基础样式包-必要 -->
    <link rel="stylesheet" type="text/css" media="screen" href="/css/jqgrid/ui.jqgrid.css"/>
    <!-- jqGrid主题包-非必要 -->
    <link rel="stylesheet" type="text/css" media="screen" href="/css/jqgrid/themes/jquery-ui-1.8.16.custom.css"/>
    <!-- jquery插件包-必要 -->
    <script src="/js/jquery/jquery.min.js" type="text/javascript"></script>
    <!-- jqGrid插件包-必要 -->
    <%--<script src="/js/jqGrid/jquery.jqGrid.js" type="text/javascript"></script>--%>

    <!-- jqGrid插件的多语言包-非必要 -->
    <%--<script src="/js/jqGrid/grid.locale-cn.js" type="text/javascript"></script>--%>
</head>

<body>
<table id="list"></table>'
<div id="pager"></div>
</body>

<script>
//    seajs.use("jqGrid/array.js");
    seajs.use("jqGrid/json.js");

</script>

</html>
