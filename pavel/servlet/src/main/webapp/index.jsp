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
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    <title>Pauls Site</title>
</head>
<body style="background-color: darkkhaki">
<h1 style="color: darkred;text-align: center">
    Today's date in Minsk: <%= (new Date()).toString()%>
</h1>
<div class="container">
<h2 style="text-align: center">
    <a href="homework22.jsp">
        <button class="btn btn-primary" style="font-size: 50px">
            Homework22
        </button>
    </a>
</h2>
</div>
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
    <a href="WebContent/images/1639741489_sticker.jpg" download="Take this motivation">
        <button style="background-color: orange;color: black; font-size: 50px">
            Download Cat
        </button>
    </a>
</h2>
<h1 style="color: rebeccapurple; text-align: center">
    Внимание Filter пишет логи<br>
    Логи сохраняются в <br><u style="color: firebrick"> "LogsList.json" </u><br>
    который будет находиться<br> в папке Tomcat 9.0/bin .
</h1>
</body>
</html>
