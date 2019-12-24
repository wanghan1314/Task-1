<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<head>
    <title><tiles:insertAttribute name="title"/></title>
    <tiles:insertAttribute name="head"/>
</head>
<body>
    <tiles:insertAttribute name="top"/>
    <tiles:insertAttribute name="nav"/>
    <tiles:insertAttribute name="body"/>
    <tiles:insertAttribute name="footer"/>
</body>
