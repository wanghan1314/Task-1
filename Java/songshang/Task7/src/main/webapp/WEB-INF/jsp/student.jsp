<%--
  Created by IntelliJ IDEA.
  User: lucifer
  Date: 2018/03/29
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="description" content="登录"/>
    <meta name="keywords" content="FDU fudan PT private tracker"/>
    <title>单个学生信息</title>
    <link rel="stylesheet" type="text/css"
          href="https://pt.vm.fudan.edu.cn/Themes/default/A.css,,_index.chinese-utf8.css+css,,_themes_shared.css+tracker,,_css,,_smoothness,,_jquery-ui-1.8.22.custom.css+tracker,,_css,,_jquery.atwho.min.css,Mcc.-ypKyuL-ZH.css.pagespeed.cf.ECRET79nzE.css"/>
</head>
<body>
<div id="header">
    <div class="frame">
        <div id="top_section">
            <h1 class="forumtitle">
                <a href="https://www.jnshu.com">IT修真院报名系统</a>
            </h1>
        </div>
        <div id="upper_section" class="middletext">
        </div>
        <br class="clear"/>
        <div id="main_menu">
            <ul class="dropmenu" id="menu_nav">
                <li id="button_home">
                    <a class="active firstlevel" href="/">
                        <span class="last firstlevel">首页</span>
                    </a>
                </li>
                <li id="button_login">
                    <a class="firstlevel" href="/registerP">
                        <span class="firstlevel">手机注册</span>
                    </a>
                </li>
                <li id="button_register">
                    <a class="firstlevel" href="//Email">
                        <span class="last firstlevel">邮箱注册</span>
                    </a>
                </li>
            </ul>
        </div>
        <br class="clear"/>
        <div class="navigate_section">
            <ul>
                <li class="last">
                    <%--<a href="/index"><span>PT@Platform</span></a>--%>
                </li>
            </ul>
        </div>
    </div>
</div>
<%--${student}--%>
<div id="content_section">
    <div class="frame">
        <div id="main_content_section">
            <form action="/students" method="GET" accept-charset="UTF-8" name="frmLogin">
                <div style="width: 100px;height: 100px;"><img src="${file}"></div>
                <div class="tborder login">
                    <h3 class="catbg"><span class="left"></span><span class="right"></span>
                        登录${result}
                    </h3>
                    <h3 class="catbg"><span class="left"></span><span class="right"></span>邮箱链接</h3>
                    <span class="upperframe"><span></span></span>
                    <div class="roundframe" id="trad">
                        <dl>
                            <dt>用户序号:</dt>
                            <dd><input type="text" name="id" value="${student.id}" size="40" readonly="readonly"/></dd>
                            <dt>用户姓名:</dt>
                            <dd><input type="text" name="name" value="${student.name}" size="40" readonly="readonly"/>
                            </dd>
                            <dt>用户QQ:</dt>
                            <dd><input type="text" name="qq" value="${student.qq}" size="40" readonly="readonly"/></dd>
                            <dt>用户职业:</dt>
                            <dd><input type="text" name="type" value="${student.type}" size="40" readonly="readonly"/>
                            </dd>
                            <dt>入学时间:</dt>
                            <dd><input type="text" name="enrolmenttime" value="${student.enrolmenttime}" size="40"
                                       readonly="readonly"/>
                            </dd>
                            <dt>毕业院校:</dt>
                            <dd><input type="text" name="graduated" value="${student.graduated}" size="40"
                                       readonly="readonly"/></dd>
                            <dt>用户学号:</dt>
                            <dd><input type="text" name="number" value="${student.number}" size="40"
                                       readonly="readonly"/></dd>
                            <dt>日报链接:</dt>
                            <dd><input type="text" name="daily" value="${student.daily}" size="40" readonly="readonly"/>
                            </dd>
                            <dt>学习立愿:</dt>
                            <dd><input type="text" name="ambition" value="${student.ambition}" size="40"
                                       readonly="readonly"/></dd>
                            <dt>辅导师兄:</dt>
                            <dd><input type="text" name="responsible" value="${student.responsible}" size="40"
                                       readonly="readonly"/></dd>
                            <dt>推广来源:</dt>
                            <dd><input type="text" name="wfrom" value="${student.wfrom}" size="40" readonly="readonly"/>
                            </dd>
                            <dt>手机号码:</dt>
                            <dd><input type="text" name="telipone" value="${student.telipone}" size="40"
                                       readonly="readonly"/></dd>
                            <dt>用户邮箱:</dt>
                            <dd><input type="text" name="email" value="${student.email}" size="40" readonly="readonly"/>
                            </dd>
                            <dt></dt>
                            <dd><a href="/students">所有列表</a>&nbsp;</dd>
                        </dl>
                        <hr/>
                        <dl>
                            <dd></dd>
                        </dl>
                    </div>
                    <span class="lowerframe"><span></span></span>
                </div>
            </form>
        </div>
    </div>
</div>
<div id="footer_section">
    <div class="frame">
        <ul class="reset">
        </ul>
    </div>
</div>
</body>
</html>
