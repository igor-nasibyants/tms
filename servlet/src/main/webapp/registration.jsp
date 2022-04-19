<%@page language="java" contentType="text/html; charset=UTF-8"
                                          pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
         "http://www.w3.org/TR/html4/loose.dtd"><html>
  <head>
    <title>Страница регистрации</title>
  </head>
  <body>
    <h2>Страница регистрации</h2>
    <p><b>Ваше имя:</b><br>
       <input type="text" id="name" size="30"></p>
    <p><b>Логин:</b><br>
       <input type="text" id="login" size="30"></p>
    <p><b>Пароль:</b><br>
       <input type="text" id="password" size="30"></p>
    <p><input type="submit" value="ОK" 
              onclick="window.location='main.jsp';" />
   </body>
</html>