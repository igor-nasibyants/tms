package org.superpaulscompany.pavel.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Date;

@WebFilter(urlPatterns = "/*")
public class LogFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String servletPath = req.getServletPath();
        System.out.println("LogFilterINFO " + new Date() + " - ServletPath : " + servletPath + ", URL = " + req.getRequestURL());

        chain.doFilter(request,response);
    }
}
