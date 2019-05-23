<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sxm
  Date: 2019/5/23
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="g" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查看</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>
<table class="table table-hover" style="width: 600px;margin: auto">
    <thead>
    <th>id</th>
    <th>用户名</th>
    <th>密码</th>
    <th>操作</th>
    </thead>
    <g:forEach items="${users}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
        <td><a href="fb.do?id=${user.id}&username=${user.username}&password=${user.password}"><button type="button" class="btn btn-primary">修改</button></a>
            <a href="fb3.do?id=${user.id}"><button type="button" class="btn btn-danger">删除</button></a></td>
    </tr>
    </g:forEach>
</table>
</body>
</html>
