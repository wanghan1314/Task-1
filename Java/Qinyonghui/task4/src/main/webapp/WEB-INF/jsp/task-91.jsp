<!DOCTYPE html>
<html lang="en">
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" isELIgnored="false"
pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="date" uri="/tags" %>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta name="format-detection" content="telephone=no">
    <title>首页</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
    <link rel="stylesheet" href="/task4/css/base.css">
    <link rel="stylesheet" href="/task4/css/task-91.css">
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
    <!-- 头部 -->
    <header >
        <div class="top w">
            <div class="num">客服热线：010-594-78634</div>
            <div class="logos">
                <img src="/task4/images/wx.png" alt="">
                <img src="/task4/images/qq.png" alt="">
                <img src="/task4/images/xl.jpg" alt="">
            </div>
        </div>
        <div class="top1">
            登陆&nbsp<span>|</span>&nbsp注册
        </div>
        <nav>
            <ul class=" nav1 w">
                    <img src="/task4/images/logo.png" alt="">
                <li><a href="task-91">首页</a></li>
                <li><a href="task-93">职业</a></li>
                <li><a href="task-92">推荐</a></li>
                <li><a href="">关于</a></li>
            </ul>
            <div class="dropdown">
                    <img  class="ji" src="/task4/images/logo.png" alt="">
                <button class="btn dropdown-toggle clearfix" type="button" id="dropdownMenu1" data-toggle="dropdown"
                    aria-haspopup="true" aria-expanded="true">
                    <span>
                        <img src="/task4/images/btn1.png" alt="">
                    </span>
                </button>
                <ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
                    <li><a href="task-91">首页</a></li>
                    <li><a href="task-93">职业</a></li>
                    <li><a href="task-92">推荐</a></li>
                    <li><a href="#">关于</a></li>
                </ul>
            </div>
        </nav>
    </header>
    <!-- banner部分 -->
    <div id="myCarousel" class="carousel slide">
        <!-- 轮播（Carousel）指标 -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <!-- 轮播（Carousel）项目 -->
        <div class="carousel-inner">
            <div class="item active">
                <img src="/task4/images/banner.png" alt="First slide">
            </div>
            <div class="item">
                <img src="/task4/images/banner.png" alt="Second slide">
            </div>
            <div class="item">
                <img src="/task4/images/banner.png" alt="Third slide">
            </div>
        </div>
        <!-- 轮播（Carousel）导航 -->
        <a class="carousel-control left" href="#myCarousel" data-slide="prev"> <span _ngcontent-c3="" aria-hidden="true"
                class="glyphicon glyphicon-chevron-left"></span></a>
        <a class="carousel-control right" href="#myCarousel" data-slide="next"><span _ngcontent-c3="" aria-hidden="true"
                class="glyphicon glyphicon-chevron-right"></span></a>
    </div>
    <!-- 中间第一部分 -->
    <div class="section1 w">
        <div class="left">
            <div class="row">
                <div class="mock col-xs-12 col-sm-12 col-md-3">
                    <div class="image">
                        <img class="gx" src="/task4/images/rocket.png" alt="">
                    </div>
                    <p>高效</p>
                    <span class="txt">将五到七年的成长时间，缩短到一年到三年。</span>
                </div>
                <div class="mock col-xs-12 col-sm-12 col-md-3">
                    <div class="image">
                        <img class="gf" src="/task4/images/archive.png" alt="">
                    </div>
                    <p>规范</p>
                    <span>标准的实战教程，不会走弯路 </span>
                </div>
                <div class="mock col-xs-12 col-sm-12 col-md-3">
                    <div class="image">
                        <img class="rm" src="/task4/images/Shape.png" alt="">
                    </div>
                    <p>人脉</p>
                    <span>同班好友，同院学长，技术大师，入学就混入职脉圈，为以后铺平道路。</span>
                </div>
            </div>
        </div>
        <div class="right hidden-sm hidden-xs">
            <div class="content">
                <div class="num">
                    <img src="/task4/images/user.jpg" alt="">
                    <p>结业人数：<span>${graduateCount}</span></p>
                    <p>结业时间：<date:date value = "123214325435"/></p>
                </div>
                <div class="num">
                    <img src="/task4/images/user.jpg" alt="">
                    <p>在学人数：<span>${onlinCount}</span></p>
                </div>
            </div>
        </div>
    </div>
    <!-- 中间第二部分 -->
    <div class="section2 w hidden-sm hidden-xs">
            <p>如何学习</p>
            <div class="list">
                <div class="step">
                    <div class="circle">
                        <div class="num">1</div>
                    </div>
                    <span class="txt">匹配你现在的个人情况，寻找适合的岗位</span>
                </div>
                <img src="/task4/images/arrow.png" alt="">
                <div class="step">
                    <div class="circle">
                        <div class="num">2</div>
                    </div>
                    <span class="txt">了解职业前景薪金待遇、竞争压力等</span>
                </div>
                <img src="/task4/images/arrow.png" alt="">
                <div class="step">
                    <div class="circle">
                        <div class="num">3</div>
                    </div>
                    <span class="txt">掌握行内顶级技能</span>
                </div>
                <img src="/task4/images/arrow.png" alt="">
                <div class="step">
                    <div class="circle">
                        <div class="num">4</div>
                    </div>
                    <span class="txt">查看职业目标任务</span>
                </div>
            </div>
            <div class="list">
                    <div class="step">
                        <div class="circle">
                            <div class="num">5</div>
                        </div>
                        <span class="txt">参考学习资源，掌握技能点，逐个完成任务</span>
                    </div>
                    <img src="/task4/images/arrow.png" alt="">
                    <div class="step">
                        <div class="circle">
                            <div class="num">6</div>
                        </div>
                        <span class="txt">加入班级，和小伙伴们互帮互助，一块学习</span>
                    </div>
                    <img src="/task4/images/arrow.png" alt="">
                    <div class="step">
                        <div class="circle">
                            <div class="num">7</div>
                        </div>
                        <span class="txt">选择导师，一路引导,加速自己成长</span>
                    </div>
                    <img src="/task4/images/arrow.png" alt="">
                    <div class="step">
                        <div class="circle">
                            <div class="num">8</div>
                        </div>
                        <span class="txt">完成职业技能，升级业界大牛</span>
                    </div>
                </div>
        </div>
        <!-- 中间第三部分 -->
    <div class="section3 w container">
            <p>优秀学员显示</p>
            <div class="row xueyuan">
                <c:forEach items = "${student4List}" var = "stuList">
                    <!-- 通过jsp:userBean标签引入java.util.Date日期类 -->
                    <jsp:useBean id="dateValue" class="java.util.Date"/>

                <div class="people col-xs-12 col-sm-12 col-md-3">

                    <div class="touxiang">
                        <img src=/task4${stuList.img} alt="">
                    </div>
                    <p class="intro">${stuList.position}：${stuList.name}</p><br>
                    <span>${stuList.resume}</span>
                    <!-- 通过jsp:userBean标签引入java.util.Date日期类 -->
                    <jsp:setProperty name="dateValue" property="time" value="${stuList.graduateAt}"/>
                    <!-- 转换格式 -->
                    <br>结业时间：</br><br><fmt:formatDate value="${dateValue}" pattern="yyyy-MM-dd"/>
                </div>
                </c:forEach>
            </div>

            <div class="dot hidden-sm hidden-xs">
                <ol>
                    <li class="active"></li>
                    <li></li>
                    <li></li>
                    <li></li>
                </ol>
            </div>
        </div>
         <!-- 中间第四部分 -->
    <div class="section4 w container">
            <p><a href="task-92.jsp">战略合作企业</a></p>
            <ul class="com row">
               <li class="col-xs-12 col-sm-12 col-md-2"> <img class="i1" src="/task4/images/alibaba.jpg" alt=""></li>
               <li class="col-xs-12 col-sm-12 col-md-2"><img style="width:2rem" src="/task4/images/jsy.jpg" alt=""></li>
               <li class="col-xs-12 col-sm-12 col-md-2"><img src="/task4/images/hx.jpg" alt=""></li>
               <li class="col-xs-12 col-sm-12 col-md-2"> <img class="i1" src="/task4/images/rl.jpg" alt=""></li>
               <li class="col-xs-12 col-sm-12 col-md-2"> <img src="/task4/images/7n.jpg" alt=""></li>
            </ul>
        </div>
         <!-- 中间第五部分 -->
    <div class="section5  hidden-sm hidden-xs">
            <p>友情链接</p>
            <ul class="w">
                <li><span></span><a href="">手机软件</a></li>
                <li><span></span><a href="">教师招聘</a></li>
                <li><span></span><a href="">找工作</a></li>
                <li><span></span><a href="">手机软件</a></li>
                <li><span></span><a href="">教师招聘</a></li>
                <li><span></span><a href="">找工作</a></li>
                <li><span></span><a href="">手机软件</a></li>
                <li><span></span><a href="">教师招聘</a></li>
                <li><span></span><a href="">找工作</a></li>
                <li><span></span><a href="">找工作</a></li>
            </ul>
            <ul>
                <li><a href="">手机软件</a></li>
                <li><a href="">教师招聘</a></li>
                <li><a href="">找工作</a></li>
                <li><a href="">手机软件</a></li>
                <li><a href="">教师招聘</a></li>
                <li><a href="">找工作</a></li>
                <li><a href="">手机软件</a></li>
                <li><a href="">教师招聘</a></li>
                <li><a href="">找工作</a></li>
                <li><a href="">找工作</a></li>
            </ul>
        </div>
    <!-- 脚部 -->
    <footer>
        <div class="box">
            <div class="top w">
                <div class="container">
                    <div class="row">
                        <div class="first col-xs-12 col-md-4">
                            <div class="up">技能树&nbsp——&nbsp改变你我</div>
                            <div class="down">
                                <a href="">关于我们</a>&nbsp|&nbsp
                                <a href="">联系我们</a>&nbsp|&nbsp
                                <a href="">合作企业</a>
                            </div>
                        </div>
                        <div class="second col-xs-12 col-md-5">
                            <div class="up">旗下网站</div>
                            <div class="down">
                                <p>
                                    <a href="">草船云孵化器</a>&#12288
                                    <a href="">最强IT特训营</a>
                                </p>
                                <p>
                                    <a href="">葡萄藤轻游戏</a>&#12288
                                    <a href="">桌游游戏</a>
                                </p>
                            </div>
                        </div>
                        <div class="third col-xs-12 col-md-3">
                            <p>微信公众号</p>
                            <img src="/task4/images/qcode.jpg" alt="">
                        </div>
                    </div>
                </div>

            </div>
        </div>

        <div class="container">
            <div>
                <div class="bottom w">
                    Copyright © 2015技能树 www.jnshu.com All Rights Reserved <span>|</span>京ICP备
                </div>
            </div>
        </div>

    </footer>
</body>

</html>