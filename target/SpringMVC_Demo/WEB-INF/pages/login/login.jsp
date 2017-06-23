<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="/css/login.css"/>
    <<script type="text/javascript" src="/js/seajs/sea.js"></script>
    <script type="text/javascript" src="/js/seajs/sea-config.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
    <title>JQuery Ajax</title>
    <script>
        seajs.use("login/ajax.js",function () {

        });
    </script>
</head>
<body>
<div id="body">
    <span>请输入用户名</span>
    <input type="text" name="username" id="username"/><br/>
    <span>请输入密码 &nbsp;&nbsp;</span>
    <input type="password" name="password" id="password"/><br/><br/>
    <input id="sub" type="submit" value="登录" />
    <div id="result"></div>
</div>

</body>
</html>
