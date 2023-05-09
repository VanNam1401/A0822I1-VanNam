<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit information</title>
</head>
<body>
<center>
    <h1>Product management</h1>
    <h2>
        <a href="?action=">List All </a>
    </h2>
</center>
<div align="center">
    <form method="post">
        <table border="1" cellpadding="5">
            <caption>
                <h2>
                    Edit product
                </h2>
            </caption>
            <c:if test="${list != null}">
                <input type="hidden" name="id" value="<c:out value="${list.id}"/>">
            </c:if>
            <tr>
                <th>Product Name:</th>
                <td>
                    <input type="text" name="name" size="45" value="<c:out value="${list.name}"/>">
                </td>
            </tr>
            <tr>
                <th>Price:</th>
                <td>
                    <input type="text" name="price" size="15" value="<c:out value="${list.price}"/>">
                </td>
            </tr>
            <tr>
                <th>Quantity:</th>
                <td>
                    <input type="text" name="quantity" size="15" value="<c:out value="${list.quantity}"/>">
                </td>
            </tr>
            <tr>
                <th>Color:</th>
                <td>
                    <input type="text" name="color" size="45" value="<c:out value="${list.color}"/>">
                </td>
            </tr>
            <tr>
                <th>Description</th>
                <td>
                    <input type="text" name="description" size="45" value="<c:out value="${list.describe}"/>">
                </td>
            </tr>
            <th>Category:</th>
            <td>
                <label>
                    <select name="category">
                        <c:forEach items="${listCategory}" var="e">
                            <option value="${e.id_product}"><c:out value="${e.name_product}"/></option>
                        </c:forEach>
                    </select>
                </label>
            </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input onclick="alert('Chỉnh sửa thành công')" type="submit" value="Update">
                </td>
            </tr>
        </table>
    </form>
</div>
</body>
</html>
