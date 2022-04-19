package org.mycompany.myname.filter;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FilterConnect implements Filter
{
    private FilterConfig config = null;
    private boolean active = false;

    public void init (FilterConfig config) throws ServletException
    {
        this.config = config;
        String act = config.getInitParameter("active");
        if (act != null)
            active = (act.toUpperCase().equals("TRUE"));
    }

    public void doFilter (ServletRequest request, ServletResponse response,
                          FilterChain chain) throws IOException, ServletException
    {
        if (active){
            System.out.println("INFO [FilterConnect] Filter activated");
        }
        chain.doFilter(request, response);
    }

    public void destroy()
    {
        config = null;
    }
}