<%--
  Created by IntelliJ IDEA.
  User: Lumia
  Date: 2019/1/5
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="doe.do" method="post">
    <input type="text" hidden="hidden" name="id" value="${suser.id}">
    用户名：<input type="text" name="username" value="${suser.username}" /><br>
    密码：<input type="password" name="password" value="${suser.password}"/><br>
    <input type="submit" value="修改">
</form>

</body>
</html>
