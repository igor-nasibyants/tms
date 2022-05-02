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
                                <a class="nav-link animation_title_link" id="ex1-tab-1" data-mdb-toggle="tab"
                                   href="all.jsp"
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
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>

