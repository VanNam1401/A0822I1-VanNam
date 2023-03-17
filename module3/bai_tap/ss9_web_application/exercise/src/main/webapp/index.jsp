<%--
  Created by IntelliJ IDEA.
  User: vanna
  Date: 14/03/2023
  Time: 11:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/DiscountServlet" method="post">
    <input placeholder="Description" type="text" name="description"> <br>
    <input placeholder="Price" type="text" name="price"><br>
    <input placeholder="Discount" type="text" name="discount"><br>
    <button>Calculate Discount</button>
</form>
</body>
</html>
