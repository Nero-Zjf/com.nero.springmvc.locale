<%--
  Created by IntelliJ IDEA.
  User: nero
  Date: 2020/5/18
  Time: 17:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>$Title$</title>
</head>
<div class="login">
    <h1><spring:message code="welcome"  arguments="${requestScope.user.username}"/> </h1>
</div>
</html>
