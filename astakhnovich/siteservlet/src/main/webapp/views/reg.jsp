<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
        <div>
                    <%
                        if (request.getAttribute("valid") != null) {
                            out.println("<p>User '" + request.getAttribute("valid") + "' added!</p>");
                        }
                        if (request.getAttribute("notValid") != null) {
                            out.println("password must contain a capital letter," +
                                                            " a number, be at least 6 characters long");
                        }
                    %>
                    <div>
                        <div>
                            <h2>Registration</h2>
                        </div>
                        <form action = "reg" method="post">
                            <label>Name:
                                <input type="text" name="name" ><br />
                            </label>

                            <label>Login:
                                <input type="text" name="login"><br />
                            </label>

                            <label>Password:
                                <input type="password" name="password"><br />
                            </label>
                            <button type="submit" >Submit</button>
                        </form>
                    </div>
        </div>
        <div>
        <button onclick="location.href='/siteservlet'">Back to main</button>
        </div>
    </body>
</html>