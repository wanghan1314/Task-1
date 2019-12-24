<%@page contentType="text/html;charset=utf8" language="java" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>技能树首页</title>
    <link rel="stylesheet/less" type="text/css" href="less/task15.less">
    <script src="../less.js-2.5.3/dist/less.min.js" type="text/javascript"></script>
    <meta name="viewport" content="width=device-width,initial-scale=1,user-scalable=no">
    <style type="text/css">
        label{
            /*文字大小是周围文字大小的两倍*/
            font-size: 500%;
        }
    </style>
</head>
<body>
<div class="header">
    <!--1联系方式-->
    <div class="header-1">
        <div class="col-md-6  col-lg-4">
            <div class="top1">客服热线：010-594-78634</div>
        </div>
        <div class="col-md-6 col-lg-4">
            <div class="topright">
                <button class="button1" type="button"></button>
                <button class="button2" type="button"></button>
                <button class="button3" type="button"></button>

                <a href="/login/login">登录</a>|
                <a href="/logout/logout">登出</a>&nbsp&nbsp${message}
            </div>
        </div>
    </div>
    <!--title-->
    <div class=" row2">
        <div class="col-md-6 col-lg-4 col-lg-offset-2">
            <div class="logo">
                <img class="img-logo" src="${pageContext.request.contextPath}/img/技能树.png">
            </div>
        </div>
        <div class="col-md-6 col-lg-4">
            <button type="button" class="page2-button"></button>
            <div class="newbutton">
                <button class="row2-button1 row2-button1:hover" type="button"><a href="/home1" style="color:#fff !important;text-decoration: none;">首页</a></button>
                <button class="row2-button2 row2-button2:hover" type="button"><a href="/home3" style="color:#fff !important;text-decoration: none;">职业</a></button>
                <button class="row2-button3 row2-button3:hover" type="button"><a href="/u/home2" style="color:#fff !important;text-decoration: none;">推荐</a></button>
                <button class="row2-button4 row2-button4:hover" type="button">关于</button>
            </div>
        </div>
    </div>
</div>
<div>
    <p style="color: #131313" align="center"><label>欢迎</label></p>
</div>
</body>
</html>
