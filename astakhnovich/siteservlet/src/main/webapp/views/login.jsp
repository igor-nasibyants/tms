<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <div>
            <div>
                <div>
                    <h2>Login</h2>
                </div>
                <form action = "login" method="post">
                    <div><input name="login" placeholder="Login"></div>
                    <div><input name="password" placeholder="Password"></div>
                    <div><button type="submit">Send</button></div>
                </form>
            </div>
        </div>

        <div>
            <button onclick="location.href='/siteservlet'">Back to main</button>
        </div>
    </body>
</html>