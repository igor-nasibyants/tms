<%@ page import="java.util.List" %>
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
            List<String> users = (List<String>) request.getAttribute("userList");
            if (users != null && !users.isEmpty()) {
                out.println("<ui>");
                for (String s : users) {
                out.println("<li>" + s + "</li>");
            }
            out.println("</ui>");
            }else{
                out.println("<p>There are no users yet!</p>");
            }
        %>
    </div>
</div>

<div>
    <button onclick="location.href='/servlet'">Back to index</button>
</div>
</body>
</html>