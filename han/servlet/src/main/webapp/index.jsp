<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
            crossorigin="anonymous"
    />
    <title>ToDo List</title>
</head>
<body class="container d-flex justify-content-center flex-column
    bg-white bg-gradient">


<h2 class="d-flex flex-column align-items-center gap-3
        py-4 mt-4 border border-3 border-danger text-danger rounded-pill">
    ToDo List
</h2>
<div id="root">

    <div class="d-flex gap-2 py-2 mt-2">
        <form action="addTask">
            <button class="d-flex justify-content-center badge bg-info text-wrap
            text-decoration-none text fs-3" name="add"
                    style="width: 100px; height: 50px">Add
            </button>
        </form>
        <form action="delete">
            <button class="d-flex justify-content-center badge bg-white text-wrap
            text-decoration-none text fs-3 text-info" name="delete"
                    style="width: 100px; height: 50px">Delete
            </button>
        </form>
        <div class="input-group mb-3" style="height: 50px; max-width: 1050px">
            <input name="names" type="text" class="form-control" aria-label="Text input with checkbox">
        </div>
    </div>
</div>
<footer class="d-flex justify-content-end">
    Simple toDo list by Han
</footer>
</body>
</html>