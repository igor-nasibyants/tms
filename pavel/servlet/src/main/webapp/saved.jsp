<%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 5/4/2022
  Time: 8:50 PM
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
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <title>Saved</title>
</head>
<body>
<%@include file="navBar.jsp" %>
<div class="container col-xl-10 col-xxl-8 px-4 py-5 bg-light">
    <main>
        <div class="py-1 text-center">
            <br><br>
            <h3>"Заявка успешно сохранена"</h3>
            <h4>Имя: ${userName}</h4>
            <h4>Кликуха: ${userNickName}</h4>
            <h4>Возраст: ${userAge}</h4>
            <h4>Пожелание: ${userWish}</h4>
            <br><br>
        </div>
    </main>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
