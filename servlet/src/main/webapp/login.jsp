<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Страница авторизации</title>
    <link rel="stylesheet" href="css/servlet.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
            integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
            integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
            integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
            crossorigin="anonymous"></script>
</head>
<body>
<%--<h2>Страница авторизации</h2>--%>
<div class="wrapper">
    <div class="logo"><img
            src="https://www.freepnglogos.com/uploads/twitter-logo-png/twitter-bird-symbols-png-logo-0.png" alt="">
    </div>
    <div class="text-center mt-4 name"> Twitter</div>
    <form class="p-3 mt-3">
        <div class="form-field d-flex align-items-center"><span class="far fa-user"></span> <input type="text"
                                                                                                   name="userName"
                                                                                                   id="userName"
                                                                                                   placeholder="Username">
        </div>
        <div class="form-field d-flex align-items-center"><span class="fas fa-key"></span> <input type="password"
                                                                                                  name="password"
                                                                                                  id="pwd"
                                                                                                  placeholder="Password">
        </div>
        <button class="btn mt-3">Login</button>
    </form>
    <div class="text-center fs-6"><a href="#">Forget password?</a> or <a href="#">Sign up</a></div>
</div>
<%--    <p><input type="submit" value="ОK" --%>
<%--              onclick="window.location='main.jsp';" />--%>
</body>
</html>