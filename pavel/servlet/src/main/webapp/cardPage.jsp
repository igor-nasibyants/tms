<%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 5/5/2022
  Time: 11:29 AM
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
    <title>Страница - визитка</title>
</head>
<body>
<%@include file="navBar.jsp" %>
<main>

    <section class="py-5 text-center container">
        <div class="row py-lg-5">
            <div class="col-lg-6 col-md-8 mx-auto">
                <h1 class="fw-light">SuperPaulsCompany.org</h1>
                <p class="lead text-muted">Наша компания может работь, а может и не работать</p>
                <p>
                    <a href="https://youtu.be/YAK0aSKdPHc" class="btn btn-primary my-2">Подать заявку в компанию</a>
                </p>
            </div>
        </div>
    </section>

    <div class="album py-5 bg-light">
        <div class="container">

            <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
                <div class="col">
                    <div class="card shadow-sm">
                        <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                             role="img" aria-label="Placeholder: Thumbnail"
                             preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#55595c"></rect>
                            <text x="50%" y="50%" fill="#eceeef" dy=".3em">GitHub</text>
                        </svg>

                        <div class="card-body">
                            <p class="card-text">Наша компания поможет каждому.</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <a href="https://github.com/igor-nasibyants/tms">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Глянуть</button>
                                    </a>
                                </div>
                                <small class="text-muted">37 sec</small>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card shadow-sm">
                        <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                             role="img" aria-label="Placeholder: Thumbnail"
                             preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#55595c"></rect>
                            <text x="50%" y="50%" fill="#eceeef" dy=".3em">Индия</text>
                        </svg>

                        <div class="card-body">
                            <p class="card-text">Мы предлагаем всякую дичь.</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <a href="https://habr.com/ru/post/664872/">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Глянуть</button>
                                    </a>
                                </div>
                                <small class="text-muted">11 sec</small>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col">
                    <div class="card shadow-sm">
                        <svg class="bd-placeholder-img card-img-top" width="100%" height="225"
                             role="img" aria-label="Placeholder: Thumbnail"
                             preserveAspectRatio="xMidYMid slice" focusable="false"><title>Placeholder</title>
                            <rect width="100%" height="100%" fill="#55595c"></rect>
                            <text x="50%" y="50%" fill="#eceeef" dy=".3em">Знание</text>
                        </svg>

                        <div class="card-body">
                            <p class="card-text">Мы обучим вас всему.</p>
                            <div class="d-flex justify-content-between align-items-center">
                                <div class="btn-group">
                                    <a href="https://youtu.be/5YLA29EybMo">
                                        <button type="button" class="btn btn-sm btn-outline-secondary">Глянуть</button>
                                    </a>
                                </div>
                                <small class="text-muted">1h 32 min 20sec</small>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</main>
<%@include file="footer.jsp" %>
</body>
</html>
