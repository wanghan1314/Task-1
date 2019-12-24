<%--
  Created by IntelliJ IDEA.
  User: WYZ
  Date: 2018/6/25
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" import="java.util.*"%>

<%@include file="footer.jsp" %>

<p style="color:#FF00FF ;font-size:32px;text-align: center;top: auto">修真院学生资料
</p>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script type="text/javascript" src="js/jquery.min.js"></script>


<div style="width:500px;margin:0px auto;text-align:center">
    <table border="1" width="120%">
        <tr>
            <td style="width:10%">id</td  >
            <td style="width:15%">name</td>
            <td style="width:20%">qq</td>
            <td style="width:15%">job</td>
            <td style="width:20%">school</td>
            <td style="width:20%">url</td>
            <td style="width:10%">更新</td>
            <td style="width:10%">删除</td>
        </tr>

        <c:forEach items="${studentList}" var="student" varStatus="st">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.qq}</td>
                <td>${student.job}</td>
                <td>${student.school}</td>
                <td>${student.url}</td>
                <td><a href="student/${student.id}/profile">更新</a> </td>
                <td><a href="student/${student.id}" onclick = 'return confirm("确认要删除吗？");'>删除</a></td>
            </tr>
        </c:forEach>
    </table>

    <table style="text-align:center">
        <a href="?start=0">首  页</a>
        <a href="?start=${page.start-page.count}">上一页</a>
        <a href="?start=${page.start+page.count}">下一页</a>
        <a href="?start=${page.last}">末  页</a>
</div>

<div style="text-align:center;margin-top:40px">
    <form method="post" action="student" accept-charset="UTF-8">
        学生名称： <input name="name" value="${student.name}" type="text"> <br><br>
        学生qq: <input name="qq" value="${student.qq}" type="text"> <br><br>
        学习类型：<input name="job" value="${student.job}" type="text"> <br><br>
        毕业学校：<input name="school" value="${student.school}" type="text"> <br><br>
        日报链接：<input name="url" value="${student.url}" type="text"> <br><br>
        <input type="submit" value="增加学生" onclick='return confirm("确认要增加么?");'>
    </form>
</div>

<div style="text-align:center;margin-top:40px">
    <form method="post" action="student/select" accept-charset="UTF-8">
        学生ID： <input name="id" value="${student.id}" type="text"> <br><br>
        <input type="submit" value="查询学生" >
    </form>
</div>
</div>


<td><a href="student/jsontest" onclick = 'return confirm("真的要点进去么");'>点这里有惊喜</a></td>