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
    Today's date in Minsk: <%= (new Date()).toString()%>
</h1>
<h2>
    <a href="date">
        <button style="background-color: crimson;color: black; font-size: 50px">
            Local time in other Towns
        </button>
    </a>
</h2>
<h2>
    <a href="https://youtu.be/1sMGoClxv8w">
        <button style="background-color: chocolate; color: black; font-size: 50px" onclick="alert('Are you sure ?');">
            Dont click this please
        </button>
    </a>
</h2>
<h2>
    <a href="orc">
        <button style="background-color: aquamarine; color: black; font-size: 50px">
            Register orcs
        </button>
    </a>
</h2>
<h2>
    <a href="forward">
        <button style="background-color: darkmagenta; color: black; font-size: 50px">
            forward() to date
        </button>
    </a>
</h2>
<h3>My to-do-list</h3>
<ol type="1" start="1">
    <li>add Orcs to third button</li>
    <li>go workout</li>
    <li>buy a pizza</li>
</ol>
</body>
</html>
