<%@ page import="java.util.List" %>
<%@ page import="by.mycompany.ast.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

        <title>Main</title>
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
        <div>
            <div class="fs-3 text-center"> Users </div>
                <div class = "d-flex justify-content-center align-items-center" style = "height:80%">
                    <table class="table" style="width:50%">
                          <thead>
                              <tr>
                                <th scope="col">#</th>
                                <th scope="col">id</th>
                                <th scope="col">Login</th>
                                <th scope="col">Password</th>
                                <th scope="col">Role</th>
                              </tr>
                          </thead>

                          <tbody>
                                <%
                                    List<User> users = (List<User>) request.getAttribute("userList");
                                    if (users != null && !users.isEmpty()) {
                                    int i = 1;
                                        for (User s : users) {
                                        out.println("<tr>");
                                        out.println("<th scope=\"row\">" + i++ + "</th>");
                                        out.println("<td>" + s.getId() + "</td>");
                                        out.println("<td>" + s.getLogin() + "</td>");
                                        out.println("<td>" + s.getPassword() + "</td>");
                                        out.println("<td>" + s.getRole() + "</td>");
                                        out.println("</tr>");

                                    }
                                    }else{
                                        out.println("<tr>");
                                        out.println("<td>There are no users yet!</td>");
                                        out.println("</tr>");
                                    }
                                %>
                        </tbody>
                    </table>
                </div>
                <div class = "d-flex justify-content-center align-items-center">
                    <div>
                        <button type="button" class="btn btn-outline-dark" onclick="location.href='/servlet'">Back to index</button>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>