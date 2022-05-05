<%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 5/5/2022
  Time: 10:35 AM
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
    <title>save-request-withSQL</title>
</head>
<body>
<%@include file="navBar.jsp" %>
<div class="container col-xl-10 col-xxl-8 px-4 py-5">
    <div class="row align-items-center g-lg-5 py-5">
        <div class="col-lg-7 text-center text-lg-start">
            <h1 class="display-4 fw-bold lh-1 mb-3">Здарова чувачок</h1>
            <p class="col-lg-10 fs-4"> Введи , что нибудь</p>
            <p class="col-lg-10 fs-4"> пожалуйста </p>
            <p class="col-lg-10 fs-4"> И ты получишь респект, уважение и сохранение в базу данных MySQL</p>
        </div>
        <div class="col-md-10 mx-auto col-lg-5">
            <form class="p-4 p-md-5 border rounded-3 bg-light" action="saveWithSQL" method="POST">
                <div class="form-floating mb-3">
                    <input name="userName" class="form-control" id="name">
                    <label for="name">Имя</label>
                </div>
                <div class="form-floating mb-3">
                    <input name="userNickName" class="form-control" id="nick">
                    <label for="nick">Кликуха</label>
                </div>
                <div class="form-floating mb-3">
                    <input name="userAge" type="number" min="1" class="form-control" id="age">
                    <label for="age">Возраст</label>
                </div>
                <div class="form-floating mb-3">
                    <input name="userWish" class="form-control" id="wish">
                    <label for="wish">Пожелание</label>
                </div>
                <div class="form-floating mb-3">
                    <button class="w-100 btn btn-lg btn-success" type="submit">POST</button>
                </div>
                <div class="form-floating mb-3">
                    <button class="w-100 btn btn-lg btn-dark" type="reset">Сброс</button>
                </div>
                <hr class="my-4">
                <small class="text-muted">Вводя сюда данные, ты соглашаешся отдать свою квартиру.</small>
            </form>
        </div>
    </div>
</div>
<%@include file="footer.jsp" %>
</body>
</html>
