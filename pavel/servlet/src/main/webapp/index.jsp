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
    <link rel="stylesheet" type="text/css" href="CSS/style.css">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <title>Pauls Site</title>
</head>
<body style="background-color: darkkhaki">
<div>
    <h1 style="color: darkred">
        Today's date in Minsk: <%= (new Date()).toString()%>
    </h1>
</div>
<br>
<div class="d-grid gap-3 col-2 mx-auto">
    <a href="homework22.jsp">
        <button class="btn btn-primary" style="font-size: 50px; color: black">
            Homework22
        </button>
    </a>
    <a href="homework23.jsp">
        <button class="btn btn-primary" style="font-size: 50px; color: black">
            Homework23
        </button>
    </a>
    <a href="https://youtu.be/1sMGoClxv8w">
        <button class="btn btn-primary" style="font-size: 50px; color: black" onclick="alert('Are you sure ?');">
            Dont click this please
        </button>
    </a>
    <a href="WebContent/images/1639741489_sticker.jpg" download="Take this motivation">
        <button class="btn btn-primary" style="font-size: 50px; color: black">
            Download Cat
        </button>
    </a>
</div>
<br>
<div>
    <h1>
        Внимание Filter пишет логи<br>
        Логи сохраняются в <br><u> "LogsList.json" </u><br>
        который будет находиться<br> в папке Tomcat 9.0/bin .
    </h1>
</div>
</body>
</html>
