<%@ page import="java.util.List" %>
<%@ page import="by.mycompany.ast.repos.UserRepo" %>
<%@ page import="static by.mycompany.ast.repos.UserRepo.select" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users</title>
</head>

<body>
<div>
    <div>
        <div>
            <h2>Users</h2>
        </div>
        <%
            List<Test> testList = select();
            String username = "";
            String password = "";
            for (Test test : testList) {
                login = test.getLogin();
                password = test.getPassword();
                request.setAttribute("login", login);
                request.setAttribute("password", password);
        %>
        <div>${login} ${password}</div>
        <%}%>
    </div>
</div>

<div>
    <button onclick="location.href='/servlet'">Back to main</button>
</div>
</body>
</html>