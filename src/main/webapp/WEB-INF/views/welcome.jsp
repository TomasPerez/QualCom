<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome! (welcome.jsp)</title>
</head>
<body>
<h1>${title}</h1>

<h2>${message}</h2>
<p>
    <strong><cite>${bob}</cite></strong>
</p>
<form action="/home" method="post">
<input type="text" name="PhoneNumber"><br>
<input type="submit" name="submit" value="Submit">
</form>

</body>
</html>