<%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 4/29/2022
  Time: 3:08 PM
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
    <title>Homework#22</title>
</head>
<body>
<nav class="navbar navbar-dark bg-dark" aria-label="First navbar example">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Домашняя страница сайта Павлика</a>
        <button class="navbar-toggler collapsed" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarsExample01" aria-controls="navbarsExample01" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="navbar-collapse collapse" id="navbarsExample01">
            <ul class="navbar-nav me-auto mb-2">
                <li class="nav-item">
                    <a class="nav-link" aria-current="page" href="homework22.jsp">Домашняя работа №22</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="homework23.jsp">Домашняя работа №23</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Домашняя работа №24</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Домашняя работа №25</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Домашняя работа №26</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-bs-toggle="dropdown"
                       aria-expanded="false">Полезные ссылки</a>
                    <ul class="dropdown-menu" aria-labelledby="dropdown01">
                        <li><a class="dropdown-item" href="https://youtu.be/1sMGoClxv8w">Техник</a></li>
                        <li><a class="dropdown-item" href="WebContent/images/Kitty.jpg"
                               download="Take this motivation">Скачать
                            котика</a></li>
                        <li><a class="dropdown-item" href="https://google.com">Google</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div class="container px-4 py-5" id="custom-cards">
    <h2 class="pb-2 border-bottom"><p>Основное задание: 1. <b>Создать сервлет для вывода текущей даты и времени.</b></p>
        <p>Дополнительное задание : 2. <b>Создать сервлет для вывода дня недели по введенной дате.</b></p>
        <p>Дополнительное задание : 3. <b>Создать сервлет для вывода номера дня в году по введенной дате</b></p></h2>

    <div class="row row-cols-1 row-cols-lg-3 align-items-stretch g-4 py-5">
        <div class="col">
            <a href="date" style="text-decoration: none">
                <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg"
                     style="background-image: url('WebContent/images/400x400/forhomework22/car400x400.jpg'); width: 400px; height: 400px">
                    <div class="d-flex flex-column h-100 p-5 pb-3 text-white text-shadow-1">
                        <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">Локальное время в разных городах</h2>
                        <ul class="d-flex list-unstyled mt-auto">
                            <li class="me-auto">
                                <img src="WebContent/images/icons/clock.png" alt="Bootstrap" width="32" height="32"
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
            <a href="DayOfTheWeek.jsp" style="text-decoration: none">
                <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg"
                     style="background-image: url('WebContent/images/400x400/forhomework22/Lion400x400.jpg'); width: 400px; height: 400px">
                    <div class="d-flex flex-column h-100 p-5 pb-3 text-white text-shadow-1">
                        <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">День недели по введённой дате</h2>
                        <ul class="d-flex list-unstyled mt-auto">
                            <li class="me-auto">
                                <img src="WebContent/images/icons/clock.png" alt="Bootstrap" width="32" height="32"
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
            <a href="DayNumberInTheYear.jsp" style="text-decoration: none">
                <div class="card card-cover h-100 overflow-hidden text-white bg-dark rounded-5 shadow-lg"
                     style="background-image: url('WebContent/images/400x400/forhomework22/fox400x400.jpg'); width: 400px; height: 400px">
                    <div class="d-flex flex-column h-100 p-5 pb-3 text-shadow-1">
                        <h2 class="pt-5 mt-5 mb-4 display-6 lh-1 fw-bold">Номер дня в году по введённой дате</h2>
                        <ul class="d-flex list-unstyled mt-auto">
                            <li class="me-auto">
                                <img src="WebContent/images/icons/clock.png" alt="Bootstrap" width="32" height="32"
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
<footer class="footer footer-dark bg-dark">
    <div style="text-align:right; padding:1em; color: #fff;">
        © SuperPaulsCompany.org <br>2021-2022
    </div>
</footer>
</body>
</html>
