<%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 4/29/2022
  Time: 11:00 AM
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
    <title>PaulsSite</title>
</head>
<body>
<nav class="navbar navbar-dark bg-dark" aria-label="First navbar example">
    <div class="container-fluid">
        <a class="navbar-brand" href="index.jsp">Домой</a>
        <button class="navbar-toggler collapsed" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarsExample01" aria-controls="navbarsExample01" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="navbar-collapse collapse" id="navbarsExample01">
            <ul class="navbar-nav me-auto mb-2">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.jsp">Домой</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="https://youtu.be/1sMGoClxv8w">Техник</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="WebContent/images/1639741489_sticker.jpg" download="Take this motivation">Скачать
                        котика</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="dropdown01" data-bs-toggle="dropdown"
                       aria-expanded="false">Dropdown</a>
                    <ul class="dropdown-menu" aria-labelledby="dropdown01">
                        <li><a class="dropdown-item" href="#">Action</a></li>
                        <li><a class="dropdown-item" href="#">Another action</a></li>
                        <li><a class="dropdown-item" href="#">Something else here</a></li>
                    </ul>
                </li>
            </ul>
            <form>
                <input class="form-control" type="text" placeholder="Search" aria-label="Search">
            </form>
        </div>
    </div>
</nav>
<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
    <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active"
                aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1"
                aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2"
                aria-label="Slide 3"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="3"
                aria-label="Slide 4"></button>
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="4"
                aria-label="Slide 5"></button>
    </div>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <a href="homework22.jsp">
                <img src="WebContent/images/8hvJbQVHj3Q.jpg" class="d-block w-100" alt="...">
            </a>
            <div class="carousel-caption">
                <h2>Домашняя работа №22</h2>
            </div>
        </div>
        <div class="carousel-item">
            <a href="homework23.jsp">
                <img src="WebContent/images/151171.jpg" class="d-block w-100" alt="...">
            </a>
            <div class="carousel-caption">
                <h2>Домашняя работа №23</h2>
            </div>
        </div>
        <div class="carousel-item">
            <a href="#">
                <img src="WebContent/images/Battlefield_1_Rain_Ruins_War_523662_1920x810.jpg" class="d-block w-100"
                     alt="...">
            </a>
            <div class="carousel-caption">
                <h2>Домашняя работа №24</h2>
            </div>
        </div>
        <div class="carousel-item">
            <a href="#">
                <img src="WebContent/images/560203-anime-girl-wallpaper.jpg" class="d-block w-100" alt="...">
            </a>
            <div class="carousel-caption">
                <h2>Домашняя работа №25</h2>
            </div>
        </div>
        <div class="carousel-item">
            <a href="#">
                <img src="WebContent/images/1920x810-px-artwork-desert-digital-art-fantasy-art-planet-1021983-wallhere.com.jpg"
                     class="d-block w-100" alt="...">
            </a>
            <div class="carousel-caption">
                <h2>Домашняя работа №26</h2>
            </div>
        </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators"
            data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators"
            data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>
</div>
<footer>
    <div style="text-align:right; background:#2a2a2a; padding:1em; color: #fff;">
        © PaulsMegaCompany.by <br>2021-2022
    </div>
</footer>
</body>
</html>
