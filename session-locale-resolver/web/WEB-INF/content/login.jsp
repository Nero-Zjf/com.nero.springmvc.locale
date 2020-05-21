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
    <h1><spring:message code="title" /> </h1>
    <form action="login" method="post">
        <input type="text" name="name" placeholder=<spring:message code="username" /> required="required" value="" />
        <input type="password" name="password" placeholder=<spring:message code="password" /> required="required" value="" />
        <button type="submit" class="btn btn-primary btn-block btn-large"><spring:message code="login" /> </button>
    </form>
</div>
</html>
