<%--
  Created by IntelliJ IDEA.
  User: Undeadsanta
  Date: 4/20/2022
  Time: 8:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="CSS/style.css">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
    <title>Let's go to the party</title>
</head>
<body style="background-color: darkkhaki; text-align: center">
<div>
    <h1>
        Quickly register for a party!
    </h1>
</div>
<br>
<form action="party" method="POST">
    <label>
        <input name="userName" type="text" class="form-control" placeholder="Name"
               style="color: black;font-size: 25px"/>
    </label>
    <br><br>
    <label>
        <input name="userSurname" type="text" class="form-control" placeholder="Surname"
               style="color: black;font-size: 25px"/>
    </label>
    <br><br>
    <label>
        <input name="userAge" type="number" class="form-control" placeholder="Age"
               style="color: black;font-size: 25px"/>
    </label>
    <br><br>
    <p class="btn-group btn-group-lg" role="group">
        <input type="radio" name="gender" class="btn-check" id="female" value="Female" autocomplete="off"/>
        <label class="btn btn-outline-primary" for="female">Female</label>

        <input type="radio" name="gender" class="btn-check" id="male" value="Male" autocomplete="off"/>
        <label class="btn btn-outline-primary" for="male">Male</label>

        <input type="radio" name="gender" class="btn-check" id="trans" value="Transgender" autocomplete="off"/>
        <label class="btn btn-outline-primary" for="trans">Transgender</label>
    </p>
    <br><br>
    <label>
        <select name="country" class="form-select" style="color:black;font-size: 25px">
            <option selected style="color: darkgreen">Belarus</option>
            <option style="color: green">Turkey</option>
            <option style="color: orangered">Indonesia</option>
            <option style="color: darkred">Burma</option>
            <option style="color: rebeccapurple">Mexico</option>
            <option style="color: darkmagenta">Vietnam</option>
        </select>
    </label>
    <br><br>
    <p class="btn-group btn-group-lg" role="group">
        <input type="checkbox" name="provisions" class="btn-check" id="beer" value="Beer" autocomplete="off"/>
        <label class="btn btn-outline-primary" for="beer">Beer</label>

        <input type="checkbox" name="provisions" class="btn-check" id="vodka" value="Vodka" autocomplete="off"/>
        <label class="btn btn-outline-primary" for="vodka">Vodka</label>

        <input type="checkbox" name="provisions" class="btn-check" id="whiskey" value="Whiskey" autocomplete="off"/>
        <label class="btn btn-outline-primary" for="whiskey">Whiskey</label>

        <input type="checkbox" name="provisions" class="btn-check" id="cola" value="Cola" autocomplete="off"/>
        <label class="btn btn-outline-primary" for="cola">Cola</label>

        <input type="checkbox" name="provisions" class="btn-check" id="jean" value="Jean" autocomplete="off"/>
        <label class="btn btn-outline-primary" for="jean">Jean</label>

        <input type="checkbox" name="provisions" class="btn-check" id="tonic" value="Tonic" autocomplete="off"/>
        <label class="btn btn-outline-primary" for="tonic">Tonic</label>
    </p>
    <br><br>
    <label>
        <textarea name="comments" class="form-control" placeholder="Leave your wishes here" cols="40" rows="1"
                  style="color: darkviolet;font-size: 25px"></textarea>
    </label>
    <br><br>
    <input type="submit" class="btn btn-success" value="Submit" style="font-size: 25px"/>
    <input type="reset" class="btn btn-danger" value="Reset" style="font-size: 25px"/>
</form>
<div>
    <h1>
        После регистрации вся информация сохранится в<br>
        <u>"PartyMember.json"<br></u>
        который будет находиться в папке Tomcat 9.0/bin .
    </h1>
</div>
</body>
</html>
