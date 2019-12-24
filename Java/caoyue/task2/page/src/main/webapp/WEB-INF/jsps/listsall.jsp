<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body >

<center>查询结果</center>
<br>
<%-- 当前用户：${pageScope.currentUser}<!-- (只能在同一个页面中使用) --> <br>
当前用户：${requestScope.current]ser}-${roleName} 有重定向数据就访问不到<br>
当前用户：${sessionScope.currentUser}-${roleName} 可以使用<br> --%>

<c:if test="${!empty requestScope.pagemsg}">
    <table border="1" cellpadding="10" cellspacing="0" class="table1" align="center">
        <thead>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>QQ</th>
            <th>onlineNumber</th>
            <th>enrollmentTime</th>
            <th>professionType</th>
            <th>dailyLink</th>
            <th>promise</th>
            <th>brotherName</th>
            <th>mail</th>
            <th>phone</th>
        </tr>
        </thead>
        <c:forEach items="${requestScope.pagemsg.lists}" var="student">
            <tr>
                <td>${student.ID }</td>
                <td>${student.name }</td>
                <td>${student.QQ}</td>
                <td>${student.onlineNumber}</td>
                <td>${student.enrollmentTime}</td>
                <td>${student.professionType}</td>
                <td>${student.dailyLink}</td>
                <td>${student.promise}</td>
                <td>${student.brotherName}</td>
                <td>${student.mail}</td>
                <td>${student.phone}</td>
                <td><form action="/user/newstudent" method="get">
                    <input type="hidden" name="ID" value="${student.ID}">
                    <input type="submit" value="更新">
                </form> </td>
                <td><form action="/user/student/${student.ID}" method="post">
                    <input type="hidden" name="_method" value="DELETE">
                    <input type="submit" value="删除">
                </form></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<table  border="0" cellspacing="0" cellpadding="0"  width="900px" align="center">
    <tr>
        <td class="td2">
            <span>第${requestScope.pagemsg.currentPage }/ ${requestScope.pagemsg.totalPage}页</span>&nbsp;&nbsp;
            <span>总记录数：${requestScope.pagemsg.totalCount }&nbsp;&nbsp;每页显示:${requestScope.pagemsg.pageSize}</span>&nbsp;&nbsp;
            <span>
       <c:if test="${requestScope.pagemsg.currentPage != 1}">
           <a href="${pageContext.request.contextPath }/student/listall ?currentPage=1">[首页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/student/listall ?currentPage=${requestScope.pagemsg.currentPage-1}">[上一页]</a>&nbsp;&nbsp;
       </c:if>

       <c:if test="${requestScope.pagemsg.currentPage != requestScope.pagemsg.totalPage}">
           <a href="${pageContext.request.contextPath }/student/listall ?currentPage=${requestScope.pagemsg.currentPage+1}">[下一页]</a>&nbsp;&nbsp;
           <a href="${pageContext.request.contextPath }/student/listall ?currentPage=${requestScope.pagemsg.totalPage}">[尾页]</a>&nbsp;&nbsp;
       </c:if>
          <a href="/index.jsp">返回主页</a>
   </span>
        </td>
    </tr>
</table>

</body>
</html>