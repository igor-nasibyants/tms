
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <title>Title</title>

</head>
<body>

<h1>Добрый день</h1><br />

<h2>Все пользователи</h2><br />

<c:forEach var="user" items="${requestScope.users}">
    <ul>

        <li>Имя: <c:out value="${User.name}"/></li>

        <li>Возраст: <c:out value="${User.age}"/></li>
    </ul>
    <hr />

</c:forEach>

<h2>Создание нового пользователя</h2><br />

<form method="posts" action="">

    <label><input type="text" name="name"></label>Имя<br>

    <label><input type="number" name="age"></label>Возраст<br>


    <input type="submit" value="ok" name="Ok"><br>
</form>
<form>
<input type="button" value="Кнопка" onClick='location.href="https://www.youtube.com/watch?v=1sMGoClxv8w"'>
</form>

<head>
  <meta charset="utf-8">

 </head>
 <body>
  <p style="text-align: center"><button>Кнопка с текстом</button>
  <button><img src="images/umbrella.gif" alt="Зонтик"
          style="vertical-align: middle"> Кнопка с рисунком</button></p>
 </body>
 <div>
 <head>

         <p style="text-align: center"><button id="button-1" class="button">
           <i class="fa fa-credit-card"></i>
           <span>Получить деньги</span>
         </button>

         <p style="text-align: center"><button id="button-2" class="button" onClick = 'location.href="https://www.youtube.com/watch?v=1sMGoClxv8w"'
           <i class="fa fa-suitcase"></i>
           <span>Собрать чемодан</span>
         </button>

         <p style="text-align: center"><button id="button-3" class="button" onClick = >
           <i class="fa fa-plane"></i>
           <span>Уехать в отпуск</span>
         </button>
         </head>


<div>
         <button type="button" class="btn btn-primary">Primary</button>
         <button type="button" class="btn btn-secondary">Secondary</button>
         <button type="button" class="btn btn-success">Success</button>
         <button type="button" class="btn btn-danger">Danger</button>
         <button type="button" class="btn btn-warning">Warning</button>
         <button type="button" class="btn btn-info">Info</button>
         <button type="button" class="btn btn-light">Light</button>
         <button type="button" class="btn btn-dark">Dark</button>

         <button type="button" class="btn btn-link">Link</button>
</div>


<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Features</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Pricing</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown link
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
         <ul></ul>
         </head>
 </div>
</body>
</html>
