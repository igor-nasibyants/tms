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
    <title>Let's go to the party</title>
</head>
<body style="background-color: darkkhaki; text-align: center">
<h1>
    Quickly register for a party!
</h1>
<form action="hello" method="POST" style="color: crimson;font-size: 30px">
    Name: <label>
    <input name="userName" style="color: black;font-size: 30px"/>
</label>
    <br><br>
    Surname: <label>
    <input name="userSurname" style="color: black;font-size: 30px"/>
</label>
    <br><br>
    Age: <label>
    <input name="userAge" style="color: black;font-size: 30px"/>
</label>
    <br><br>
    Gender: <label>
    <input type="radio" name="gender" value="Female" style="font-size: 30px"/>
</label>Female
    <label>
        <input type="radio" name="gender" value="Male" style="font-size: 30px"/>
    </label>Male
    <label>
        <input type="radio" name="gender" value="Transgender" style="font-size: 30px"/>
    </label>Transgender
    <br><br>
    Country: <label>
    <select name="country" style="font-size: 30px">
        <option style="color: green;font-size: 30px">Belarus</option>
        <option style="color: gold;font-size: 30px">Indonesia</option>
        <option style="color: black;font-size: 30px">Burma</option>
        <option style="color: orangered;font-size: 30px">Mexico</option>
        <option style="color: rebeccapurple; font-size: 30px">Vietnam</option>
    </select>
</label>
    <br><br>
    Provisions:
    <label>
        <input type="checkbox" name="provisions" value="Beer" style="color: black;font-size: 30px"/>
    </label>Beer
    <label>
        <input type="checkbox" name="provisions" value="Vodka" style="color: black;font-size: 30px"/>
    </label>Vodka
    <label>
        <input type="checkbox" name="provisions" value="Whiskey" style="color: black;font-size: 30px"/>
    </label>Whiskey
    <label>
        <input type="checkbox" name="provisions" value="Cola" style="color: black;font-size: 30px"/>
    </label>Cola
    <label>
        <input type="checkbox" name="provisions" value="Jean" style="color: black;font-size: 30px"/>
    </label>Jean
    <label>
        <input type="checkbox" name="provisions" value="Tonic" style="color: black;font-size: 30px"/>
    </label>Tonic
    <br><br>
    <input type="submit" value="Submit" style="font-size: 30px"/>
</form>
</body>
</html>
