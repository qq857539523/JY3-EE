<%--
  Created by IntelliJ IDEA.
  User: sxm
  Date: 2019/5/23
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="g" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询中心</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</head>
<body>
<table class="table table-hover" style="width: 600px;margin: auto">
    <thead>
    <th>id</th>
    <th>商品名</th>
    <th>售价</th>
    </thead>
    <g:forEach items="${Product}" var="Product">
        <tr>
            <td>${Product.pro_id}</td>
            <td>${Product.pro_name}</td>
            <td>${Product.pro_price}</td>
            <td><a href="zero?id=${Pruduct.id}&name=${Pruduct.name}&price=${Pruduct.price}"><button type="button" class="btn btn-primary">修改</button></a>
                <a><button type="button" class="btn btn-danger">删除</button></a></td>
        </tr>
    </g:forEach>
</table>
</body>
</html>
