<%@ page import="java.util.List" %>
<%@ page import="org.mycompany.han.Task" %>
<%@ page import="static org.mycompany.han.UtilsFunction.getTasks" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link rel="stylesheet" href="style.css">
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous"
    />
    <title>ToDo List</title>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body class="container">
<h2 class="header_title">
    ToDo List
</h2>
<div id="root">
    <div class="add_with_input">
        <div class="input-group mb-3" style="height: 50px; max-width: 800px; min-width: 150px">
            <input property="nameTask" type="text" class="form-control" aria-label="Text input with checkbox">
        </div>
        <form action="addTask" method="post">
            <button class="button_add" name="add">Add
            </button>
        </form>
    </div>
    <div class="buttons_div">
        <form action="showAll">
            <button class="button" name="show">Show All
            </button>
        </form>
        <form action="showCompleted">
            <button class="button" name="show">Show Completed
            </button>
        </form>
        <form action="deleteAll" method="post">
            <button class="button" name="delete">Delete All
            </button>
        </form>
        <form action="deleteLast" method="post">
            <button class="button" name="show">Delete Last
            </button>
        </form>
    </div>
    <h3 class="tasks_header">Your Tasks</h3>
    <% List<Task> tasks = getTasks();
        request.setAttribute("tasks", tasks);
        String mark = "";
    %>
    <div class="tasks_div">
        <% for (Task task : tasks) {
            if (task.isStatus()) {
                mark = " task_completed";
            } else {
                mark = "task_not_completed";
            }
            request.setAttribute("mark", mark);
        %>
        <div class="${mark}">
            <div class="">
                <%= task.getId() + ") " + task.getNameTask()%>
            </div>
            <div class="d-flex gap-2 align-items-center">
                <div class="d-flex">
                    <label>
                        <input type="checkbox" name="checkbox"
                               class="form-check-input border border-2 border-dark rounded-3 bg-warning m-0 p-0"
                               style="width: 20px; height: 20px"/>
                    </label>
                </div>
                <form action="deleteThisTask" class="m-0 p-0" method="post">
                    <button class="btn btn-close"></button>
                </form>
            </div>
        </div>
        <% } %>
    </div>
</div>
</body>
</html>