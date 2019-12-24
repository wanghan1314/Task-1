<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="utf-8">
    <title>职业</title>
    <meta content="width=device-width, initial-scale=1.0" name="viewport" charset="UTF-8">
    <link href="${pageContext.request.contextPath}/css/font.css" rel="stylesheet" type="text/css">
    <link href="${pageContext.request.contextPath}/css/t11.css" rel="stylesheet" type="text/css">
    <%--<link href="${pageContext.request.contextPath}/css/base.css" rel="stylesheet" type="text/css">--%>
</head>

<body>

<div class="container">

    <div class="nav-title">首页&gt;职业</div>
    <div class="nav-bar">
        <span class="">方向：</span>
        <a class="nav-bar-a a-selected" href="">全部</a>
        <a class="nav-bar-a" href="">前端开发</a>
        <a class="nav-bar-a" href="">后端开发</a>
        <a class="nav-bar-a" href="">移动开发</a>
        <a class="nav-bar-a" href="">整站开发</a>
        <a class="nav-bar-a" href="">运营维护</a>
    </div>

    <div class="caption">
        <h4>前端开发方向</h4>
    </div>

    <div class="row">
        <c:forEach var="user2" begin="0" end="${size}" items="${user_t11}">
            <div class="col-md-4 col-sm-6 col-xs-12 top-margin">
                <div class="warp-border">
                    <div class="clearfix">
                        <div class="icon-people"><img src="${user2.imges}"></div>
                        <div class="text">
                            <h4 class="">${user2.t11_Career}</h4>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">门槛 <c:forEach begin="1" end="${user2.t11_threshold}">
                                <img src="${pageContext.request.contextPath}/imges/xx.png"></c:forEach>
                            </div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">难易程度<c:forEach begin="1" end="${user2.t11_easy}">
                                <img src="${pageContext.request.contextPath}/imges/xx.png"> </c:forEach>
                            </div>
                        </div>
                    </div>
                    <div class="warp-class2">
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding">成长周期 <span class="iconfont-color"> ${user2.t11_year2}</span>年
                            </div>
                        </div>
                        <div class="warp-class2-text">
                            <div class="iconfont text-padding text-border-left">稀缺程度 <span
                                    class="iconfont-color">${user2.number}</span>家公司需要
                            </div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <div class="leftWarp">
                            薪资待遇
                        </div>
                        <div class="rightWarp">
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">${user2.t11_year1}年</div>
                                <div class="rightWarp-wages">${user2.t11_money1}/月</div>
                            </div>
                            <div class="rightWarp-class">
                                <div class="rightWarp-year">${user2.t11_year2}年</div>
                                <div class="rightWarp-wages">${user2.t11_money2}/月</div>
                            </div>
                            <div class="rightWarp-class border-bottom">
                                <div class="rightWarp-year">${user2.t11_year3}年</div>
                                <div class="rightWarp-wages">${user2.t11_money3}/月</div>
                            </div>
                        </div>
                    </div>

                    <div class="warp-class2">
                        <b class="text-b">有${user2.t11_study}人正在学</b>
                    </div>
                    <div class="warp-class2">
                        <p class="text-p">提示:在你学习之前你应该已经掌握XXXXX、XXXXX、XX等语言基础</p>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>

</div>
</body>
</html>