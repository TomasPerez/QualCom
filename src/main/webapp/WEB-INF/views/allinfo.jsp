<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 8/27/2017
  Time: 5:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Load Specs</title>
</head>
<body>
  <h2>Load Specs</h2>

<!--suppress HtmlUnknownTarget -->
  <form action="/form" method="post">
    Company: <label>
    <input type="text" name='company'>
</label><br>
    Address: <input type="text" name="address"><br>
    City: <input type="text" name="city"><br>
    State: <input type="text" name="state"><br>
    Weight: <input type="text" name="weight"><br>
      <input type="submit" name="submit" value="Submit">
</form>


</body>
</html>
