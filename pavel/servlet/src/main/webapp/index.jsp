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
    <title>Pauls Site</title>
</head>
<body style="background-color: darkkhaki">
<h1 style="color: darkred;text-align: center">
    Today's date in Minsk: <%= (new Date()).toString()%>
</h1>
<h2 style="text-align: center">
    <a href="date">
        <button style="background-color: crimson;color: black; font-size: 50px;">
            Local time in other Towns
        </button>
    </a>
</h2>
<h2 style="text-align: center">
    <a href="homework23.jsp">
        <button style="background-color: darkblue; color: white; font-size: 50px">
            Homework23
        </button>
    </a>
</h2>
<h2 style="text-align: center">
    <a href="https://youtu.be/1sMGoClxv8w">
        <button style="background-color: chocolate; color: black; font-size: 50px" onclick="alert('Are you sure ?');">
            Dont click this please
        </button>
    </a>
</h2>
<h2 style="text-align: center">
    <a href="orc">
        <button style="background-color: aquamarine; color: black; font-size: 50px">
            Register orcs
        </button>
    </a>
</h2>
<h2 style="text-align: center">
    <a href="forward">
        <button style="background-color: darkmagenta; color: black; font-size: 50px">
            forward() to date
        </button>
    </a>
</h2>
<h2 style="text-align: center">
    <a href="1639741489_sticker.jpg" download="Take this motivation">
        <button style="background-color: orange;color: black; font-size: 50px">
            Download Cat
        </button>
    </a>
</h2>
</body>
</html>
