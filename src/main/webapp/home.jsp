<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
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
    <%@include file="header.jsp" %>

    <table>
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

    <%@include file="footer.jsp" %>
</body>
</html>
