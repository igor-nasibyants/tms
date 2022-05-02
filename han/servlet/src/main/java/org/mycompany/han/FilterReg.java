package org.mycompany.han;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class FilterReg extends HttpServlet implements Filter {

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        String userName = request.getParameter("form1");
        response.getWriter().println(userName);
    }
}
