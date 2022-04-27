<%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 4/24/2022
  Time: 3:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
    <title>Day number in the year</title>
</head>
<body style="background-color: darkkhaki;text-align: center">
<div>
    <h1 style="color: orangered">
        Hello dude again!<br>
        Do you remember what to do ?<br>
        <b> Enter a date, please, in pattern "dd.MM.yyyy" | example 20.05.1999 :</b>
    </h1>
</div>
<br>
<form action="year" method="POST" style="color: black;font-size: 30px">
    <label>
        <input name="userDate" placeholder="dd.MM.yyyy" style="color: black;font-size: 30px">
    </label>
    <input type="submit" value="Submit" style="font-size: 30px"/>
    <input type="reset" value="Reset" style="font-size: 30px"/>
</form>
</body>
</html>
