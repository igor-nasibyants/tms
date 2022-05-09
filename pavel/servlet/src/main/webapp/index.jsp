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
<%@include file="navBar.jsp" %>
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
        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="5"
                aria-label="Slide 6"></button>
    </div>
    <div class="carousel-inner">
        <div class="carousel-item active">
            <a href="homework22.jsp">
                <img src="WebContent/images/1920x810/mainWallpaper1.jpg" class="d-block w-100" alt="...">
            </a>
            <div class="carousel-caption">
                <h2>Домашняя работа №22</h2>
            </div>
        </div>
        <div class="carousel-item">
            <a href="homework23.jsp">
                <img src="WebContent/images/1920x810/mainWallpaper2.jpg" class="d-block w-100" alt="...">
            </a>
            <div class="carousel-caption">
                <h2>Домашняя работа №23</h2>
            </div>
        </div>
        <div class="carousel-item">
            <a href="homework24.jsp">
                <img src="WebContent/images/1920x810/mainWallpaper3.jpg" class="d-block w-100"
                     alt="...">
            </a>
            <div class="carousel-caption">
                <h2>Домашняя работа №24</h2>
            </div>
        </div>
        <div class="carousel-item">
            <a href="homework25.jsp">
                <img src="WebContent/images/1920x810/mainWallpaper4.jpg" class="d-block w-100" alt="...">
            </a>
            <div class="carousel-caption">
                <h2>Домашняя работа №25</h2>
            </div>
        </div>
        <div class="carousel-item">
            <a href="homework26.jsp">
                <img src="WebContent/images/1920x810/mainWallpaper5.jpg"
                     class="d-block w-100" alt="...">
            </a>
            <div class="carousel-caption">
                <h2>Домашняя работа №26</h2>
            </div>
        </div>
        <div class="carousel-item">
            <a href="#">
                <img src="WebContent/images/1920x810/mainWallpaper6.jpg"
                     class="d-block w-100" alt="...">
            </a>
            <div class="carousel-caption">
                <h2>Домашняя работа №27</h2>
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
<%@include file="footer.jsp" %>
</body>
</html>
