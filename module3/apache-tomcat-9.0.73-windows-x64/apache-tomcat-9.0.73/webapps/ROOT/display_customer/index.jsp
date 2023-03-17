<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customer List</h1>
<table style="border: 2px; solid: black">
    <thead>
    <tr>
        <th>Name</th>
        <th>Date of Birth</th>
        <th>Address</th>
        <th>Image</th>
    </tr>
    <c:forEach items="${customer}" var="c">
    <tr>
        <td>${c.name}</td>
        <td>${c.dayBirth}</td>
        <td>${c.address} </td>
        <td><img src="${c.pathImage}"></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>