<%--
  Created by IntelliJ IDEA.
  User: 磊子
  Date: 2020/12/20
  Time: 21:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<tbody>
<c:forEach items="${userList}" var="pojo">
    您的用户名是:${pojo.username}<br>
    您的密码是:${pojo.userpwd}<br>
</c:forEach>
</tbody>
</body>
</html>
