<%--
  Created by IntelliJ IDEA.
  User: vanna
  Date: 12/04/2023
  Time: 11:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Electonic Mailbox</title>
    <style>
        #id {
            width: 200px;
            height: 50px;
            border: 2px solid #ccc;
            border-radius: 5px;
            padding: 5px;
            font-size: 16px;
        }
    </style>
</head>
<body>
<%--@elvariable id="mail" type=""--%>
<form:form method="post" modelAttribute="mail">
    <b>Settings</b>
    <strong>Languages</strong>
    <form:select path="language">
        <form:options items="${language}"/>
    </form:select>
    <div>
        <strong>Page Size: </strong>
        <a>Show</a><form:select path="size"> <form:options items="${size}"/></form:select><a>emails per page</a>
    </div>

    <strong>Spams filter: </strong>
    <form:radiobutton path="spam" value="Enable spams filter"/><a>Enable spams filter</a>
    <br>
    <strong>Signature: </strong>
    <label>
        <input type="text" id="id"/>
    </label>
    <br>
    <button type="submit" style="background: lightskyblue">Update</button>
</form:form>
<button type="submit" onclick="clear()">Cancel</button>
</body>
<script>
    function clear() {
        document.getElementById("id").value = "";
        document.querySelector("form").reset();
    }
</script>
</html>
