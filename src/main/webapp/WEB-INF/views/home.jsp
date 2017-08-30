<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/27/2017
  Time: 5:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${message}</h1>

<h2>${action}</h2>
<form action="/allinfo" method="post">
<p> <input type="radio" name="checkin" value="Checkin">Checkin
    <input type="radio" name="checkin" value="Checkout">Checkout <p/><br>
    <input type="submit" name="submit" value="Submit">
</form>

</body>
</html>
