<%@ page import="java.util.List" %>
<%@ page import="by.mycompany.ast.servlets.Test" %>
<%@ page import="static by.mycompany.ast.servlets.Test.getTest" %>
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
            List<Test> testList = getTest();
            int id = 0;
            String username = "";
            String password = "";
            for (Test test : testList) {
                id = test.getId();
                username = test.getUsername();
                password = test.getPassword();
                request.setAttribute("id", id);
                request.setAttribute("username", username);
                request.setAttribute("password", password);
        %>
        <div>${id} ${username} ${password}</div>
        <%}%>
    </div>
</div>

<div>
    <button onclick="location.href='/siteservlet'">Back to main</button>
</div>
</body>
</html>