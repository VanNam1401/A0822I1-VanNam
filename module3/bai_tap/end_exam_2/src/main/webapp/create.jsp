<%--
  Created by IntelliJ IDEA.
  User: vanna
  Date: 03/04/2023
  Time: 7:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
  <form method="post">
    <table border="1" cellpadding="5">
      <caption>
        <h2>Add New Product</h2>
      </caption>
      <tr>
        <th>Name:</th>
        <td>
          <input type="text" name="name" id="name" size="45">
        </td>
      </tr>
      <tr>
        <th>Price:</th>
        <td>
          <input type="text" name="price" id="price" size="45">
        </td>
      </tr>
      <tr>
        <th>Quantity</th>
        <td>
          <input type="text" name="quantity" id="quantity" size="45">
        </td>
      </tr>
      <tr>
        <th>Color</th>
        <td>
          <input type="text" name="color" id="colors" size="45">
        </td>
      </tr>
      <tr>
        <th>Description</th>
        <td>
          <input type="text" name="description" id="description" size="45">
        </td>
      </tr>
      <tr>
        <th>Category:</th>
        <td>
          <label>
            <select name="category">
              <c:forEach items="${list}" var="e">
                <option value="${e.id_product}"><c:out value="${e.name_product}"/></option>
              </c:forEach>
            </select>
          </label>
        </td>
      </tr>
      <tr>
        <td colspan="2" align="center">
          <input type="submit" value="Create">
        </td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>
