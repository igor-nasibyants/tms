<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.mycompany.han.Task" %>
<%@ page import="java.util.List" %>
<%@ page import="static org.mycompany.han.Task.getTasks" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Todo App</title>
    <link rel="stylesheet" href="style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</head>
<body>
<section class="vh-100 gradient-custom">
    <div class="container py-5 h-100">
        <div class="row d-flex justify-content-center align-items-center h-100">
            <div class="col col-xl-10">
                <div class="card">
                    <div class="card-body p-5">
                        <form class="d-flex mb-4" action="addTask" method="post">
                            <div class="d-flex form-outline flex-fill align-items-center">
                                <input type="text" name="form2" class="form-control" placeholder="Enter task"
                                       required=""/>
                            </div>
                            <button type="submit" class="btn btn-info ms-2">Add</button>
                        </form>
                        <ul class="nav nav-tabs mb-4 pb-2" id="ex1" role="tablist">
                            <li class="nav-item" role="presentation">
                                <a class="nav-link active" id="ex1-tab-1" data-mdb-toggle="tab" href="#all.jsp"
                                   role="tab"
                                   aria-controls="ex1-tabs-1" aria-selected="true">All</a>
                            </li>
                            <li class="nav-item" role="presentation">
                                <a class="nav-link animation_title_link" id="ex1-tab-2" data-mdb-toggle="tab"
                                   href="active.jsp" role="tab"
                                   aria-controls="ex1-tabs-2" aria-selected="false">Active</a>
                            </li>
                            <li class="nav-item" role="presentation">
                                <a class="nav-link animation_title_link" id="ex1-tab-3" data-mdb-toggle="tab"
                                   href="completed.jsp" role="tab"
                                   aria-controls="ex1-tabs-3" aria-selected="false">Completed</a>
                            </li>
                        </ul>
                        <div class="d-flex gap-2">
                            <form action="deleteAll" method="post">
                                <button type="submit" class="btn btn-info ms-2 animation_button">
                                    Delete All
                                </button>
                            </form>
                            <form action="deleteLast" method="post">
                                <button type="submit" class="btn btn-info ms-2 animation_button">
                                    Delete Last
                                </button>
                            </form>
                        </div>
                        <div class="tab-content" id="ex1-content">
                            <div class="tab-pane fade show active" id="ex1-tabs-1" role="tabpanel"
                                 aria-labelledby="ex1-tab-1">
                                <ul class="list-group mb-0">
                                    <%
                                        List<Task> tasks = getTasks();
                                        String markTask;
                                        String isDone;
                                        int id;
                                        for (Task task : tasks) {
                                            id = task.getId();
                                            if (task.isStatus()) {
                                                markTask = "text-decoration-line-through bg-info text-white";
                                                isDone = " checked";
                                            } else {
                                                markTask = "";
                                                isDone = "";
                                            }
                                            request.setAttribute("markTask", markTask);
                                            request.setAttribute("isDone", isDone);
                                            request.setAttribute("idTask", id);
                                    %>
                                    <li class="list-group-item d-flex justify-content-between border-0 mb-2 rounded ${markTask}"
                                        style="background-color: #f4f6f7;">
                                        <div class="d-flex align-items-center gap-3"
                                             style="min-width: 150px">
                                            <%--                                            <input class="form-check-input m-0" name="checkTask" type="checkbox"--%>
                                            <%--                                                   id="${idTask}"--%>
                                            <%--                                                   value="${idTask}"--%>
                                            <%--                                            ${isDone}/>--%>
                                            <form action="markCompletedTask" method="post" class="m-0 p-0">
                                                <button name="checkTask" value="${idTask}"
                                                        style="padding: 0 4px;">O
                                                </button>
                                            </form>
                                            <div><%=task.getNameTask()%>
                                            </div>
                                        </div>
                                        <form action="deleteTargetTask" method="post" class="m-0 p-0">
                                            <button class="btn btn-close close_button" name="idTask"
                                                    value="${idTask}"></button>
                                        </form>
                                    </li>
                                    <%}%>
                                </ul>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>

