<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ��Ұ
  Date: 2018/5/20
  Time: 12:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="GB18030"%>
<head>
    <title>���</title>
</head>
<body>

<table cellpadding="0" cellspacing="0" border="1"
style=" border-collapse: collapse;min-height: 300px;width: 1800px;text-align: center;">

<tr>
    <td>ѧ��</td>
    <td>����</td>
    <td>QQ</td>
    <td>��ѧʱ��</td>
    <td>����</td>
    <td>ѧУ</td>
    <td>�ձ�����</td>
    <td>��Ը</td>
    <td>ʦ��</td>
    <td>����֪��</td>
    <td>����ʱ��</td>
    <td>����ʱ��</td>
    <td>�޸�</td>
    <td>ɾ��</td>
</tr>
<c:forEach items="${students}" var="li" varStatus="i">
    <tr>
        <td>${li.s_id}</td>
        <td>${li.s_name}</td>
        <td>${li.s_qq}</td>
        <td>${li.s_time}</td>
        <td>${li.s_type}</td>
        <td>${li.s_school}</td>
        <td>${li.s_link}</td>
        <td>${li.s_words}</td>
        <td>${li.s_brother}</td>
        <td>${li.s_know}</td>
        <td>${li.create_at}</td>
        <td>${li.update_at}</td>
        <td><a type="button"  href="${path}update?id=${li.s_name}" class="btn btn-info btn-sm">
            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
            �޸�</a>
        </td>
        <td> <a type="button"  href="${path}/delete?s_id=${li.s_name}" class="btn btn-danger btn-sm">
            <span class="glyphicon glyphicon-trash" aria-hidden="true" ></span>
            ɾ��</a>
        </td>
    </tr>
</c:forEach>
</table>
</body>