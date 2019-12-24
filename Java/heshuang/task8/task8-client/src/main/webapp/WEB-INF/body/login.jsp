<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1,minimum-scale=1.0,  maximum-scale=1">
    <link rel="stylesheet" type="text/css" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="../../static/css/task9-3.css">
<title>登录</title>
</head>
<body>
<div id="parent" style="text-align: center;overflow: hidden; background: url(/static/img/tt.jpg) no-repeat;background-size: cover;" >
<div id="child">
<h2>欢迎登陆</h2>
<form action = "/loginResult" method="post">
    账&nbsp;&nbsp;号:<input type="text"  name="userName"/><br>
    <br>
    密&nbsp;&nbsp;码:<input type="password" name="password"/><br>
    <br>
    <span style="color: red; font-size: x-small;"><i>${message}</i></span><br>
    <input type="submit" value="登录"/>
</form>
    没有账号？点击<a href="/register"><span style="color: blue; font-size: xx-small;">注册</span> </a>
</div>
</div>
</body>


