<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>New Post</title>
    <jsp:include page="../headerIn.jsp"/>
</head>
<body>
    <div>
        <form action="newPost" method="post>
            <div class="d-flex flex-column">
            <div class="mb-3 input-group mb-3 d-flex justify-content-center">
                <label for="exampleFormControlInput1" class="form-label">Header</label>
                <input name="header" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Your header">
            </div>
            <div class="mb-3 input-group mb-3 d-flex justify-content-center">
                <label for="exampleFormControlTextarea1" class="form-label">What do you want to say to world?</label>
                <textarea name="text" class="form-control" id="exampleFormControlTextarea1" rows="5" placeholder="Say here"></textarea>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
            </div>
        </form>
    <div>
</div>
</body>