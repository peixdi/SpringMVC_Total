<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 2017/6/12
  Time: 13:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--<script src="https://unpkg.com/vue"></script>--%>
    <%--<script src="https://cdn.jsdelivr.net/npm/vue-resource@1.3.4"></script>--%>
    <script type="text/javascript" src="/js/seajs/sea.js"></script>
    <script type="text/javascript" src="/js/seajs/sea-config.js"></script>
    <script type="text/javascript" src="/js/jquery/jquery.min.js"></script>
    <%--<script type="text/javascript" src="http://static.zlbaba.com/jquery/1.11.1/jquery.min.js"></script>--%>
    <script type="text/javascript" src="https://unpkg.com/vue"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/vue-resource@1.3.4"></script>
    <title>VueJS</title>
</head>
<body>
<form id="form" @submit.prevent="submit">
    <!-- text -->
    <p>
        <span>姓名：</span>
        <input type="text" v-model="username" name="username">
        {{username}}
    </p>
    <!-- radio buttons -->
    <p>
        <span>性别：</span>
        <input type="radio" value="man" v-model="gender"><span>男</span>
        <input type="radio" value="woman" v-model="gender"><span>女</span>
        {{gender}}
    </p>
     <!-- checkbox -->
     <p>
         <span>爱好：</span>
         <input type="checkbox" value="travel" v-model="hobby"><span>旅游</span>
         <input type="checkbox" value="singsongs" v-model="hobby"><span>唱歌</span>
         <input type="checkbox" value="dance" v-model="hobby"><span>跳舞</span>
         <input type="checkbox" value="reading" v-model="hobby"><span>阅读</span>
         {{hobby}}
     </p>
     <!-- select -->
     <p>
         <span>住址：</span>
         <select v-model="address">
             <option  value="JiangSu">江苏省</option>
             <option  value="ZheJiang">浙江省</option>
             <option  value="AnHui">安徽省</option>
         </select>
         {{address}}
     </p>
    <input type="submit" value="注册">
    <%--<p><pre>data: {{$data | json 2}}</pre></p>--%>

    <div id="result"></div>


</form>

<script>
    seajs.use("vue/vue.js",function () {
//        vue.vm;
    });
</script>

</body>
</html>
