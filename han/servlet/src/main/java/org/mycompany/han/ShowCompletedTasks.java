package org.mycompany.han;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import static org.mycompany.han.UtilsFunction.addTaskToHTML;
import static org.mycompany.han.UtilsFunction.getTasks;

@WebServlet("/showCompleted")
public class ShowCompletedTasks extends HttpServlet {
    //Разобраться с путями
    String HTMLString = """
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
                       <div class="d-flex gap-2 py-2 mt-2 flex-wrap justify-content-around">
                           <form action="addTask">
                               <button class="d-flex justify-content-center badge bg-info
                               text-decoration-none text fs-3" name="add">Add
                               </button>
                           </form>
                           <form action="deleteAll">
                               <button class="d-flex justify-content-center badge bg-white
                               text-decoration-none text fs-3 text-info" name="delete">Delete All
                               </button>
                           </form>
                           <div class="input-group mb-3" style="height: 50px; max-width: 1000px; min-width: 150px">
                               <input property="nameTask" type="text" class="form-control" aria-label="Text input with checkbox">
                           </div>
                       </div>
                       <div class="d-flex gap-3">
                           <form action="showAll">
                               <button class="d-flex justify-content-center badge bg-white text-wrap
                               text-decoration-none text fs-3 text-info" name="show">Show All
                               </button>
                           </form>
                   
                           <form action="showCompleted">
                               <button class="d-flex justify-content-center badge bg-info
                               text-decoration-none text fs-3" name="show">Show Completed
                               </button>
                           </form>
                           <form action="deleteLast">
                               <button class="d-flex justify-content-center badge bg-white text-wrap
                               text-decoration-none text fs-3 text-info" name="show">Delete Last
                               </button>
                           </form>
                       </div>
                       <h3 class="d-flex justify-content-center text-danger">Your Tasks</h3>
                       <form id="tasks"></form>
                   </div>
                   </body>
                   </html>""";

    Document html = Jsoup.parseBodyFragment(HTMLString);
    Element element = html.getElementById("tasks");

    public void doGet(HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse) {
        httpServletResponse.setContentType("text/html;charset=UTF-8");
        List<Task> tasks = getTasks().stream().filter(Task::isStatus).toList();
        addTaskToHTML(httpServletResponse, HTMLString, tasks, element);
    }
}
