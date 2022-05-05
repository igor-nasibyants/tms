<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
        <div>
            <div>
                <div>
                    <%
                        if (request.getAttribute("exSaveDB") != null) {
                            out.println(request.getAttribute("exSaveDB"));
                        }
                    %>
                <div>
                    <h2>Registration</h2>
                </div>
                <form action = "registration" method="post">
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
        <button onclick="location.href='/servlet'">Back to index</button>
        </div>
    </body>
</html>