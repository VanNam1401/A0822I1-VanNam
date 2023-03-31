<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vanna
  Date: 27/03/2023
  Time: 7:32 PM
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
    <a href="/staff?action=staff">List All Staff</a>
  </h2>
</center>
<div align="center">
  <form method="post">
    <table border="1" cellpadding="5">
      <caption>
        <h2>Add new staff</h2>
      </caption>
      <tr>
        <th>Name:</th>
        <td>
          <input type="text" name="name" id="name" size="45">
        </td>
      </tr>
      <tr>
        <th>Birthday:</th>
        <td>
          <input type="text" name="day_birth" id="day_birth" size="45">
        </td>
      </tr>
      <tr>
        <th>Address:</th>
        <td>
          <input type="text" name="address" id="address" size="45">
        </td>
      </tr>
      <tr>
        <th>Day begin:</th>
        <td>
          <input type="text" name="day_start" id="day_start" size="45">
        </td>
      </tr>
      <tr>
        <th>Day end:</th>
        <td>
          <input type="text" name="day_end" id="day_end" size="45">
        </td>
      </tr>
      <tr>
        <th>Salary:</th>
        <td>
          <input type="text" name="salary" id="salary" size="45">
        </td>
      </tr>
      <tr>
        <th>Job ID:</th>
        <td>
          <input type="text" name="job_id" id="job_id" size="45">
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="Save">
        </td>
      </tr>
    </table>
  </form>
  </div>
</body>
</html>
