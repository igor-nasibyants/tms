<%@ page import="by.mycompany.ast.entity.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <meta charset="UTF-8">
    <title>Settings</title>
    <jsp:include page="../headerIn.jsp"/>
</head>
<body>
    <div class="fs-3 text-center"> User Settings</div>
        <div class = "mt-4 d-flex justify-content-center align-items-center">
            <table class="table" style="width:50%">
                <tbody>
                    <form action="settings" method="post">
                    <%
                        User user = (User) request.getAttribute("userForSettings");
                        out.println("<form action=\"name\" method=\"post\">");
                        out.println("<tr>");
                        out.println("<td>" + "Name:" + "</td>");
                        out.println("<td>" + user.getName() + "</td>");
                        out.println("<td>" + "<input type=\"text\" class=\"form-control\" name=\"name\" placeholder=\"new name\"/>" + "</td>");
                        out.println("<td>" + "<button type=\"submit\" class=\"btn btn-outline-success\">Save</button>" + "</td>");
                        out.println("</tr>");
                    %>
                    </form>
                    <form action="settings" method="post">
                    <%
                        out.println("<tr>");
                        out.println("<td>" + "Login:" + "</td>");
                        out.println("<td>" + user.getLogin() + "</td>");
                        out.println("<td>" + "<input type=\"text\" class=\"form-control\" name=\"login\" placeholder=\"new login\"/>" + "</td>");
                        out.println("<td>" + "<button type=\"submit\" class=\"btn btn-outline-success\" style=\"height:50%\">Save</button>" + "</td>");
                        out.println("</tr>");
                    %>
                    </form>
                    <form action="settings" method="post">
                    <%
                        out.println("<tr>");
                        out.println("<td>" + "Password:" + "</td>");
                        out.println("<td>" + user.getPassword() + "</td>");
                        out.println("<td>" + "<input type=\"text\" class=\"form-control\" name=\"password\" placeholder=\"new password\"/>" + "</td>");
                        out.println("<td>" + "<button type=\"submit\" class=\"btn btn-outline-success\">Save</button>" + "</td>");
                        out.println("</tr>");
                    %>
                    </form>
                </tbody>
            </table>
        </div>
        <div class="text-center">
            <div>
                <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">
                    Delete profile
                </button>
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title" id="exampleModalLabel">Delete profile?</h5>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Закрыть"></button>
                            </div>
                            <div class="modal-body">
                                Are you sure what you want to delete the profile? this action cannot be canceled
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-outline-success" data-bs-dismiss="modal">Cancel</button>
                                <button type="button" class="btn btn-danger" onclick="location.href='/servlet/delete'">Delete</button>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>