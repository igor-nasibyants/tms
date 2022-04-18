<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 4/17/2022
  Time: 8:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Current Date</title>
</head>
<body>
<h1>
    Today's date: <%= (new Date()).toString()%>
</h1>
<h2>
    <a href="test">
        <button style="background-color: crimson;color: black; font-size: 50px">
            Click this please
        </button>
    </a>
</h2>
<h2>
    <a href="https://youtu.be/7iKjSCTxke8">
        <button style="background-color: chocolate; color: black; font-size: 50px" onclick="alert('Are you sure ?');">
            Dont click this please
        </button>
    </a>
</h2>
</body>
</html>
