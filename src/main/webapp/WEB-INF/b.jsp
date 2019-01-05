<%--
  Created by IntelliJ IDEA.
  User: Lumia
  Date: 2019/1/4
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <thead>
        <tr>
            <th scope="col">编号</th>
            <th scope="col">用户名</th>
            <th scope="col">密码</th>
            <th scope="col">操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${s}" var="l">
            <tr>
                <td>${l.id}</td>
                <td>${l.username}</td>
                <td>${l.password}</td>
                <td><a href="d.do?id=${l.id}"><input type="button" value="删除"></a>&nbsp;<a href="e.do?id=${l.id}"><input type="button" value="修改"></a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="a.do">insert</a>
</body>
</html>
