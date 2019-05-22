<%--
  Created by IntelliJ IDEA.
  User: sxm
  Date: 2019/5/22
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>显示所有</title>
  </head>
  <body>
  <table border="1px" style="width: 600px;height: 80px;text-align:center">
    <c:forEach items="${users}" var="user">
        <thead>
        <th>id</th>
        <th>
            用户名
        </th>
        <th>密码</th>
        </thead>
      <tr>
        <td>${user.id}</td>
        <td>${user.username}</td>
        <td>${user.password}</td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
