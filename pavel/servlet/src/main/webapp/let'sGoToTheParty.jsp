<%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 5/01/2022
  Time: 10:04 PM
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
    <title>Let's go to the party</title>
</head>
<body>
<%@include file="navBar.jsp" %>
<div class="container col-xl-10 col-xxl-8 px-4 py-5 bg-light">
    <main>
        <div class="py-5 text-center">
            <img class="d-block mx-auto mb-4" src="WebContent/images/icons/BigP.jpg" alt="" width="80"
                 height="80">
            <h2>Регаемся на вечеринку</h2>
            <p class="lead">Пишем имя, фамилию, возраст, ориентацию, страну проживания, национальность, свои
                предпочтения по бухлу и
                пожелания</p>
        </div>
        <div>
            <h4 class="mb-3">Здравствуй друг!</h4>
            <hr class="my-4 bg-success">
            <form action="party" method="POST">
                <div class="row g-3">
                    <div class="col-sm-6">
                        <label for="firstName" class="form-label">First name</label>
                        <input name="userName" type="text" class="form-control" id="firstName" placeholder="Имя"
                               value="" required="">
                    </div>

                    <div class="col-sm-6">
                        <label for="lastName" class="form-label">Last name</label>
                        <input name="userSurname" type="text" class="form-control" id="lastName" placeholder="Фамилия"
                               value=""
                               required="">
                    </div>

                    <hr class="my-4 bg-success">

                    <div class="col-md-6">
                        <label for="age" class="form-label">Age</label>
                        <div class="input-group has-validation">
                            <span class="input-group-text"> От 18 лет </span>
                            <input name="userAge" type="number" min="18" class="form-control" id="age"
                                   placeholder="Возраст"
                                   required="">
                        </div>
                    </div>

                    <div class="col-md-6">
                        <label for="email" class="form-label">Email</label>
                        <div class="input-group has-validation">
                            <span class="input-group-text">@</span>
                            <input name="userEmail" type="email" class="form-control" id="email" placeholder="Email"
                                   required="">
                        </div>
                    </div>

                    <hr class="my-4 bg-success">

                    <div class="col-md-12 py-4 btn-group btn-group-lg" role="group">
                        <input type="radio" name="gender" class="btn-check" id="female" value="Женщина"
                               autocomplete="off"/>
                        <label class="btn btn-outline-danger" for="female">Женщина</label>

                        <input type="radio" name="gender" class="btn-check" id="male" value="Мужчина"
                               autocomplete="off"/>
                        <label class="btn btn-outline-danger" for="male">Мужчина</label>

                        <input type="radio" name="gender" class="btn-check" id="trans" value="Трансгендер"
                               autocomplete="off"/>
                        <label class="btn btn-outline-danger" for="trans">Трансгендер</label>
                    </div>

                    <hr class="my-4 bg-success">

                    <div class="col-md-6">
                        <label for="country" class="form-label">Country</label>
                        <select name="country" class="form-select" id="country" required="">
                            <option selected>Беларусь</option>
                            <option>Турция</option>
                            <option>Индонезия</option>
                            <option>Бирма</option>
                            <option>Мексика</option>
                            <option>Вьетнам</option>
                        </select>
                    </div>

                    <div class="col-md-6">
                        <label for="nationality" class="form-label">Nationality</label>
                        <select name="nationality" class="form-select" id="nationality" required="">
                            <option selected>беларус</option>
                            <option>турок</option>
                            <option>индеец</option>
                            <option>индус</option>
                            <option>мексиканец</option>
                            <option>вьетнамец</option>
                        </select>
                    </div>
                </div>

                <hr class="my-4 bg-success">

                <div class="w-100 btn-group btn-group-lg" role="group">
                    <input type="checkbox" name="provisions" class="btn-check" id="beer" value="Пиво"
                           autocomplete="off"/>
                    <label class="btn btn-outline-danger" for="beer">Пиво</label>

                    <input type="checkbox" name="provisions" class="btn-check" id="vodka" value="Водка"
                           autocomplete="off"/>
                    <label class="btn btn-outline-danger" for="vodka">Водка</label>

                    <input type="checkbox" name="provisions" class="btn-check" id="whiskey" value="Виски"
                           autocomplete="off"/>
                    <label class="btn btn-outline-danger" for="whiskey">Виски</label>

                    <input type="checkbox" name="provisions" class="btn-check" id="cola" value="Кола"
                           autocomplete="off"/>
                    <label class="btn btn-outline-danger" for="cola">Кола</label>

                    <input type="checkbox" name="provisions" class="btn-check" id="jean" value="Джин"
                           autocomplete="off"/>
                    <label class="btn btn-outline-danger" for="jean">Джин</label>

                    <input type="checkbox" name="provisions" class="btn-check" id="tonic" value="Тоник"
                           autocomplete="off"/>
                    <label class="btn btn-outline-danger" for="tonic">Тоник</label>
                </div>

                <hr class="my-4 bg-success">

                <h4 class="mb-3">Пожелания: </h4>

                <div class="row gy-3">
                    <div class="col-md-12">
                        <label for="wishes" class="form-label">К примеру: "Не навижу веганов"</label>
                        <input name="comments" type="text" class="form-control" id="wishes" placeholder="" required="">
                        <small class="text-muted">Ну всё ты попал</small>
                    </div>
                </div>

                <hr class="my-4 bg-success">

                <div class="form-floating mb-3">
                    <button class="w-100 btn btn-success btn-lg" type="submit">Потверждаю</button>
                </div>
                <div class="form-floating mb-3">
                    <button class="w-100 btn btn-dark btn-lg" type="reset">Ну нахер такую пати</button>
                </div>
            </form>
        </div>
    </main>

</div>
<%@include file="footer.jsp" %>
</body>
</html>
