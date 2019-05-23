<%--
  Created by IntelliJ IDEA.
  User: sxm
  Date: 2019/5/23
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form class="form-horizontal" style="width: 500px; margin: auto" action="fb2.do" >
    <div class="form-group">
        <label for="inputEmail3" class="col-sm-2 control-label">用户名</label>
        <div class="col-sm-10">
            <input type="hidden" value="${user.id}" name="id"/>
            <input type="text" class="form-control" id="inputEmail3" value="${user.username}" name="username"/>
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
        <div class="col-sm-10">
            <input type="password" class="form-control" id="inputPassword3" value="${user.password}" name="password"/>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">确认修改</button>
        </div>
    </div>
</form>
</body>
</html>
