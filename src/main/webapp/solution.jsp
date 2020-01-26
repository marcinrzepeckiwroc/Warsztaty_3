<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rzepecki
  Date: 25.01.2020
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Solution</title>
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
        <th>title</th>
        <th>description</th>

    </tr>
    <tr>
        <td>${exercise.id}</td>
        <td>${exercise.title}</td>
        <td>${exercise.description}</td>
    </tr>

</table>

</body>
</html>
