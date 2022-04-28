<%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 4/24/2022
  Time: 2:36 PM
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
    <title>Day of the week</title>
</head>
<body style="background-color: darkkhaki;text-align: center">
<div>
    <h1 style="color: orangered">
        Hello dude!<br>
        <b> Enter a date, please, in pattern "dd.MM.yyyy" | example 20.05.1999 :</b>
    </h1>
</div>
<br>
<form action="week" method="POST" style="color: black;font-size: 30px">
    <label>
        <input name="userDate" class="form-control" placeholder="dd.MM.yyyy" style="color: black;font-size: 30px">
    </label>
    <input type="submit" class="btn btn-success" value="Submit" style="font-size: 30px"/>
    <input type="reset" class="btn btn-danger" value="Reset" style="font-size: 30px"/>
</form>
</body>
</html>
