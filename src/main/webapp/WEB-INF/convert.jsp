<%--
  Created by IntelliJ IDEA.
  User: rakib
  Date: 5/13/2023
  Time: 1:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Temperature Converter</title>
</head>
<body>
  <h1>Celsius to Fahrenheit converter</h1>

  <form action="/convert" method="post">
    <input type="number" name="temperature" />
    <input type="submit" value="Submit" />
  </form>
</body>
</html>
