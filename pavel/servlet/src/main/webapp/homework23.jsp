<%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 4/29/2022
  Time: 9:00 PM
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
    <title>Homework#23</title>
</head>
<body>
<%@include file="navBar.jsp"%>
<div class="container px-4 py-5" id="custom-cards">
    <h2 class="pb-2 border-bottom"><p>Основное задание: 1. <b>Создать страницу логина с формой ввода имени пользователя
        и
        пароля.</b></p>
        <p>Дополнительное задание: 2. <b>Создать сервлет для вывода всех студентов группы. Информация о
            студентах должна храниться в базе данных.</b></p>
        <p>Дополнительное задание: 3. <b>Создать сервлет для вывода количества посещений страницы.</b></p></h2>

    <div class="row row-cols-1 row-cols-lg-3 align-items-stretch g-4 py-5">
        <div class="col">
            <a href="let'sGoToTheParty.jsp" style="text-decoration: none">
                <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg"
                     style="background-image: url('WebContent/images/400x400/forhomework23/mask400x400.jpg'); width: 400px; height: 400px">
                    <div class="d-flex flex-column h-100 p-5 pb-3 text-white text-shadow-1">
                        <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">Логин на вечеринку</h2>
                        <ul class="d-flex list-unstyled mt-auto">
                            <li class="me-auto">
                                <img src="WebContent/images/icons/sql.png" alt="Bootstrap" width="32" height="32"
                                     class="rounded-circle border border-white">
                            </li>
                            <li class="d-flex align-items-center me-3">
                                <svg class="bi me-2" width="1em" height="1em"></svg>
                                <small>Основное задание</small>
                            </li>
                            <li class="d-flex align-items-center">
                                <svg class="bi me-2" width="1em" height="1em"></svg>
                                <small>№1</small>
                            </li>
                        </ul>
                    </div>
                </div>
            </a>
        </div>

        <div class="col">
            <a href="students" style="text-decoration: none">
                <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg"
                     style="background-image: url('WebContent/images/400x400/forhomework23/neonSmile400x400.jpg'); width: 400px; height: 400px">
                    <div class="d-flex flex-column h-100 p-5 pb-3 text-white text-shadow-1">
                        <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">SELECT * FROM</h2>
                        <ul class="d-flex list-unstyled mt-auto">
                            <li class="me-auto">
                                <img src="WebContent/images/icons/sql.png" alt="Bootstrap" width="32" height="32"
                                     class="rounded-circle border border-white">
                            </li>
                            <li class="d-flex align-items-center me-3">
                                <svg class="bi me-2" width="1em" height="1em"></svg>
                                <small>Дополнительное задание</small>
                            </li>
                            <li class="d-flex align-items-center">
                                <svg class="bi me-2" width="1em" height="1em"></svg>
                                <small>№2</small>
                            </li>
                        </ul>
                    </div>
                </div>
            </a>
        </div>

        <div class="col">
            <a href="count" style="text-decoration: none">
                <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg"
                     style="background-image: url('WebContent/images/400x400/forhomework23/skull1400x400.jpg'); width: 400px; height: 400px">
                    <div class="d-flex flex-column h-100 p-5 pb-3 text-shadow-1">
                        <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">Количество посещений страницы</h2>
                        <ul class="d-flex list-unstyled mt-auto">
                            <li class="me-auto">
                                <img src="WebContent/images/icons/sql.png" alt="Bootstrap" width="32" height="32"
                                     class="rounded-circle border border-white">
                            </li>
                            <li class="d-flex align-items-center me-3">
                                <svg class="bi me-2" width="1em" height="1em"></svg>
                                <small>Дополнительное задание</small>
                            </li>
                            <li class="d-flex align-items-center">
                                <svg class="bi me-2" width="1em" height="1em"></svg>
                                <small>№3</small>
                            </li>
                        </ul>
                    </div>
                </div>
            </a>
        </div>
    </div>
</div>
<%@include file="footer.jsp"%>
</body>
</html>
