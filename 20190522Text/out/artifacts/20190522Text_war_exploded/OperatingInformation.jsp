<%--
  Created by IntelliJ IDEA.
  User: sxm
  Date: 2019/5/22
  Time: 20:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>信息操作中心</title>
</head>
<body>
<%--查询所有--%>
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
<%--添加信息--%>
<form action="sxm.1" method="get">
    用户名：<input type="text" name="usm">
    密码  ：<input type="password" name="psw">
    <input type="submit" value="注册">
</form>
<%--删除信息--%>
<form action="sxm.2" method="get">
    请输入要删除的信息id：<input type="text" name="id">
    <input type="submit" value="确认删除">
</form>
<%--修改信息--%>
<form action="sxm.3" method="get">
    请输入要修改的信息id：<input type="text" name="id">
    请输入要修改信息的密码：<input type="text" name="password">
    <input type="submit" value="确认修改">
</body>
</body>
</html>
