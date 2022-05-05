<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
        <title>Login</title>
        <nav class="py-2 bg-light border-bottom">
            <div class="container d-flex flex-wrap">
                <ul class="nav me-auto">
                    <span class="fs-4">Astah.inc</span>
                </ul>
                <ul class="nav">
                    <button type="button" class="btn btn-light text-dark me-2" onclick="location.href='/servlet/login'">Login</button>
                    <button type="button" class="btn btn-primary" onclick="location.href='/servlet/registration'">Sign-up</button>
                </ul>
            </div>
        </nav>
    </head>
    <body>
        <div>
            <div class="fs-3 text-center">Sign-in</div>
                <div class="mt-3">
                <%
                    if (request.getAttribute("notContainsUser") != null) {
                        out.println(request.getAttribute("notContainsUser"));
                    }
                %>
                    <div>
                        <form action="login" method="post">
                                <div class="d-flex flex-column">
                                    <div class="input-group input-group-sm mb-3 d-flex justify-content-center">
                                        <span class="input-group-text" id="inputGroup-sizing-sm">Login</span>
                                        <input name="login" type="text" class="form-control" style='min-width: 20%; max-width: 70%'
                                               aria-label="Sizing example input" aria-describedby="inputGroup-sizing-sm">
                                    </div>
                                    <div class="input-group input-group-sm mb-3 d-flex justify-content-center">
                                        <span class="input-group-text" id="inputGroup-sizing-sm">Password</span>
                                        <input name="password" type="password" class="form-control"
                                               style='min-width: 20%; max-width: 70%'>
                                    </div>
                                    <div class="text-center">
                                        <button type="submit" class="btn btn-outline-success" style="width: 10%">Submit</button>
                                    </div>
                                </div>
                        </form>
                    </div>
                </div>
        </div>
        <div class="text-center">
            <button type="button" class="btn btn-outline-dark" onclick="location.href='/servlet'">Back to index</button>
        </div>
    </body>
</html>