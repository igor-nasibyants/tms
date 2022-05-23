<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>ADMIN</title>
</head>
<body>

<h1>Hello ADMIN!</h1>
<input type="submit" value="меню"
                 onclick="window.location='view/menu.jsp';" />
<button><a  href="<c:url value="/logout"/>">Выйти</a></button>

</body>
</html>
