<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rzepecki
  Date: 25.01.2020
  Time: 16:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
    <style>
        html, body{ height:100%; margin:0; }
        /* Trick */
        body{
            display:flex;
            flex-direction:column;
        }
        footer{
            margin-top:auto;
        }
        td { border: 1px solid black; }
    </style>
</head>
<body>
<table>
    <tr>
        <th>id</th>
        <th>userName</th>
        <th>email</th>
        <th>user_group_id</th>

    </tr>

    <c:forEach items="${users}" var="user">
        <tr>
            <td><a href="/user?id=${user.id}">${user.id}</a></td>
            <td>${user.userName}</td>
            <td>${user.email}</td>
            <td>${user.user_group_id}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
