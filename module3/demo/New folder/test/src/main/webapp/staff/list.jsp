<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vanna
  Date: 27/03/2023
  Time: 6:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Staff Information</title>
</head>
<body>
<center>
    <h1>The list of Employee</h1>
    <h2>
        <a href="/staff?action=create">Add new user</a>
    </h2>
    <h2>
        <a href="/staff?action=search">Search</a>
    </h2>
</center>
<div align="center">
    <table border="1" , cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <tr>
            <th>Mã nhân viên</th>
            <th>Họ tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ngày bắt đầu</th>
            <th>Ngày kết thúc</th>
            <th>Lương</th>
            <th>Mã công việc</th>
        </tr>
        <tr>
            <c:forEach var="staffList" items="${staffList}">
        <tr>
            <td><c:out value="${staffList.id}"/></td>
            <td><c:out value="${staffList.name}"/></td>
            <td><c:out value="${staffList.dateOfBirth}"/></td>
            <td><c:out value="${staffList.address}"/></td>
            <td><c:out value="${staffList.dayStart}"/></td>
            <td><c:out value="${staffList.dayEnd}"/></td>
            <td><c:out value="${staffList.salary}"/></td>
            <td><c:out value="${staffList.jobName}"/></td>
<%--            <td>--%>
<%--                <a href="/users?action=edit&id=${user.id}">Edit</a>--%>
<%--                <a href="/users?action=delete&id=${user.id}">Delete</a>--%>
<%--            </td>--%>
        </tr>
        </c:forEach>
        </tr>
    </table>
</div>
</body>
</html>
