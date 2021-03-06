<%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 4/29/2022
  Time: 10:35 PM
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
    <title>Day number in the year</title>
</head>
<body>
<%@include file="navBar.jsp"%>
<div class="container col-xl-10 col-xxl-8 px-4 py-5">
    <div class="row align-items-center g-lg-5 py-5">
        <div class="col-lg-7 text-center text-lg-start">
            <h1 class="display-4 fw-bold lh-1 mb-3">Здарова челик, опять</h1>
            <p class="col-lg-10 fs-4"> Введи дату по паттерну "dd.MM.yyyy"</p>
            <p class="col-lg-10 fs-4"> Пример: 12.07.1999 </p>
            <p class="col-lg-10 fs-4"> И ты получишь номер дня в году</p>
        </div>
        <div class="col-md-10 mx-auto col-lg-5">
            <form class="p-4 p-md-5 border rounded-3 bg-light" action="year" method="POST">
                <div class="form-floating mb-3">
                    <input name="userDate" class="form-control" id="floatingInput" placeholder="dd.MM.yyyy">
                    <label for="floatingInput">dd.MM.yyyy</label>
                </div>
                <div class="form-floating mb-3">
                    <button class="w-100 btn btn-lg btn-success" type="submit">Ввести</button>
                </div>
                <div class="form-floating mb-3">
                    <button class="w-100 btn btn-lg btn-dark" type="reset">Сброс</button>
                </div>
                <hr class="my-4">
                <small class="text-muted">Вводя дату, ты соглашаешся отдать свою квартиру.</small>
            </form>
        </div>
    </div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
