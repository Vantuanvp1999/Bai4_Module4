<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 6/19/2025
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%><%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h3>Home</h3>
<form:form action="login" method="post" modelAttribute="login">
  <fieldset>
    <legend>login</legend>
    <table>
      <tr>
        <td><form:label path="account">Account</form:label></td>
        <td><form:input path="account"/></td>
      </tr>
      <tr>
        <td><form:label path="password">Password</form:label></td>
        <td><form:input path="password"/></td>
      </tr>
      <tr>
        <td></td>
        <td><form:button>login</form:button></td>
      </tr>
    </table>
  </fieldset>
</form:form>
</body>
</html>
