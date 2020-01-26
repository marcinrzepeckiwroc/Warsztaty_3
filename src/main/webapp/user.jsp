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
    <title>User</title>
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
    <tr>
        <td>${user.id}</td>
        <td>${user.userName}</td>
        <td>${user.email}</td>
        <td>${user.user_group_id}</td>
    </tr>
</table>
<table
<c:if test="${!empty solutions}">
>
    <tr>
        <th>id</th>
        <th>created</th>
        <th>updated</th>
        <th>description</th>
        <th>exercise id</th>
        <th>user id</th>
        <th>Exercise</th>
    </tr>

    <c:forEach items="${solutions}" var="solution">
        <tr>
            <td>${solution.id}</td>
            <td>${solution.created}</td>
            <td>${solution.updated}</td>
            <td>${solution.description}</td>
            <td>${solution.exercise_id}</td>
            <td>${solution.users_id}</td>
            <td><a href="/servlet1?id=${solution.id}">+</a>  </td>

        </tr>
    </c:forEach>
</table>
</c:if>
</body>
</html>
