<%--
  Created by IntelliJ IDEA.
  User: vanna
  Date: 17/03/2023
  Time: 10:43 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form method="post" action="/calculator">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>First operand:</td>
                <td><input name="first" type="text"/></td>
            </tr>
            <tr>
                <td>Operator:</td>
                <td>
                    <select name="operator">
                        <option value="+">Addition</option>
                        <option value="-">Subtraction</option>
                        <option value="*">Subtraction</option>
                        <option value="/">Subtraction</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Second operand:</td>
                <td><input name="second" type="text"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Calculator"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
