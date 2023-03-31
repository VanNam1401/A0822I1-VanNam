<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>List</title>
</head>
<body>
<br/>
<center>
    <h1>Employee Manager</h1>
    <h2>
        <a href="index?action=create">Add new employee</a>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of employee</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Birthday</th>
            <th>Address</th>
            <th>Start day</th>
            <th>End day</th>
            <th>Salary</th>
            <th>Job code</th>
            <th>Status</th>
        </tr>
        <c:forEach var="e" items="${employeeList}">
            <tr>
                <td><c:out value="${e.id}"/></td>
                <td><c:out value="${e.name}"/></td>
                <td><c:out value="${e.birthday}"/></td>
                <td><c:out value="${e.address}"/></td>
                <td><c:out value="${e.startDate}"/></td>
                <td><c:out value="${e.endDate}"/></td>
                <td><c:out value="${e.salary}"/></td>
                <td><c:out value="${e.jobCode}"/></td>
                <td><a href="">Edit</a></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>