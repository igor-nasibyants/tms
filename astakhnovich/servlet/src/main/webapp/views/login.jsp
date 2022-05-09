<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Login</title>
    <jsp:include page="headerOut.html"/>
</head>
<body>
<div>
    <div class="fs-3 text-center">Sign-in</div>
    <div class="mt-3">
        <div class="fs-5 text-center text-danger">
        <%
        if (request.getAttribute("notContainsUser") != null) {
            out.println(request.getAttribute("notContainsUser"));
        }
        %>
        </div>
        <div class="mt-3">
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
                            <button type="submit" class="btn btn-outline-success" style="width: 10%">Sing in</button>
                            <button type="button" class="btn btn-primary" style="width: 10%"
                                    onclick="location.href='/servlet/registration'">Sign up</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>