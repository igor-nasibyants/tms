<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 4/20/2022
  Time: 7:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="style.css">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <title>Homework23</title>
</head>
<body style="background-color: darkkhaki">
<div>
    <h1 style="color: darkred;text-align: center">
        Today's date in Minsk: <%= (new Date()).toString()%>
    </h1>
</div>
<br>
<div class="d-grid gap-3 col-2 mx-auto">
    <a href="let'sGoToTheParty.jsp">
        <button class="btn btn-info" style="font-size: 50px; color: black">
            Let's get this party started
        </button>
    </a>
    <a href="students">
        <button class="btn btn-info" style="font-size: 50px; color: black">
            SELECT * FROM MySQL
        </button>
    </a>
    <a href="count">
        <button class="btn btn-info" style="font-size: 50px; color: black">
            Count session
        </button>
    </a>
</div>
</body>
</html>
