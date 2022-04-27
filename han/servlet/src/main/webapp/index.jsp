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
<body class="container d-flex justify-content-center flex-column
    bg-white bg-gradient mb-5">
<h2 class="d-flex flex-column align-items-center gap-3
        py-4 mt-4 border border-3 border-danger text-danger rounded-pill">
    ToDo List
</h2>
<div id="root">
    <div class="d-flex gap-2 py-2 mt-2 flex-wrap justify-content-center">
        <div class="input-group mb-3" style="height: 50px; max-width: 800px; min-width: 150px">
            <input property="nameTask" type="text" class="form-control" aria-label="Text input with checkbox">
        </div>
        <form action="addTask" method="post">
            <button class="d-flex justify-content-center badge bg-info
            text-decoration-none text fs-3" name="add">Add
            </button>
        </form>
    </div>
    <div class="d-flex gap-3 justify-content-center flex-wrap">
        <form action="showAll">
            <button class="d-flex justify-content-center badge bg-white text-wrap
            text-decoration-none text fs-3 text-info" name="show">Show All
            </button>
        </form>
        <form action="showCompleted">
            <button class="d-flex justify-content-center badge bg-white text-wrap
            text-decoration-none text fs-3 text-info" name="show">Show Completed
            </button>
        </form>
        <form action="deleteAll" method="post">
            <button class="d-flex justify-content-center badge bg-white
            text-decoration-none text fs-3 text-info" name="delete">Delete All
            </button>
        </form>
        <form action="deleteLast" method="post">
            <button class="d-flex justify-content-center badge bg-white text-wrap
            text-decoration-none text fs-3 text-info" name="show">Delete Last
            </button>
        </form>
    </div>
    <h3 class="d-flex justify-content-center text-danger">Your Tasks</h3>
    <% List<Task> tasks = (List<Task>) request.getAttribute("tasks");
        if (tasks == null) {
            tasks = getTasks();
        }
        String mark = "";
    %>
    <div class="d-flex flex-column gap-3">
        <% for (Task task : tasks) {
            if (task.isStatus()) {
                mark = "d-flex justify-content-between bg-danger gap-1" +
                        " border border-dark py-2 px-4 rounded-3 text-break text-white fs-4";
            } else {
                mark = "d-flex justify-content-between bg-info gap-1" +
                        " border border-danger py-2 px-4 rounded-3 text-break fs-4";
            }
            request.setAttribute("mark", mark);
        %>
        <div class="${mark}" style="min-width: 150px">
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