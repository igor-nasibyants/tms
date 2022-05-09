<%@ page import="java.util.List" %>
<%@ page import="by.mycompany.ast.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Main</title>
        <jsp:include page="headerIn.jsp"/>
    </head>
<body>
    <div>
        <div>
            <div class="fs-3 text-center"> Users </div>
                <div class = " mt-4 d-flex justify-content-center align-items-center">
                    <table class="table table-hover" style="width:50%">
                          <thead class="table-light">
                              <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Name</th>
                                <th scope="col">Login</th>
                                <th scope="col">Password</th>
                                <th scope="col">Role</th>
                              </tr>
                          </thead>

                          <tbody>
                                <%
                                    List<User> users = (List<User>) request.getAttribute("userList");
                                    if (users != null && !users.isEmpty()) {
                                        for (User s : users) {
                                        out.println("<tr>");
                                        out.println("<td>" + s.getId() + "</td>");
                                        out.println("<td>" + s.getName() + "</td>");
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
            </div>
        </div>
    </body>
</html>