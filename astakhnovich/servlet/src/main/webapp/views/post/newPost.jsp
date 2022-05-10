<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>New Post</title>
    <jsp:include page="../headerIn.jsp"/>
</head>
<body>

<div class="d-flex justify-content-center" style="width:80%">
    <form action="newPost" method="post">
        <div class="d-flex flex-column " style="width:100%">
            <div class="mb-3 input-group d-flex justify-content-center flex-column" style="width:100%">

                <label for="exampleFormControlInput1" class="form-label">Header</label>

                    <input name="header" type="text" class="form-control" style="width:100%" id="exampleFormControlInput1"
                            placeholder="Your header">

            </div>
            <div class="mb-3 input-group d-flex justify-content-center">
                <label for="exampleFormControlTextarea1" class="form-label" style="width:100%">What do you want to say to world?</label>
                <textarea name="text" class="form-control" style="width:100%" id="exampleFormControlTextarea1" rows="5"
                          placeholder="Say here"></textarea>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </form>
</div>
</body>