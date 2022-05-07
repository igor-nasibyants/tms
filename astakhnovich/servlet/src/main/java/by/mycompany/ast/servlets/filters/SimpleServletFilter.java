package by.mycompany.ast.servlets.filters;

import by.mycompany.ast.entity.Role;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletException;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter("/SimpleServletFilter")
public class SimpleServletFilter implements Filter
{
    private FilterConfig filterConfig;
    private static ArrayList<String> pages;  // хранилище страниц

    public SimpleServletFilter()
    {
        if (pages == null)
            pages = new ArrayList<String>();
    }

    @Override
    public void init(FilterConfig fConfig) throws ServletException
    {
        filterConfig = fConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException
    {
        if (filterConfig.getInitParameter("active").equalsIgnoreCase("true")) {
            HttpServletRequest req = (HttpServletRequest)request;
            HttpSession session = req.getSession();
            String[] list = req.getRequestURI().split("/");
            String page = null;
            if (list[list.length - 1].indexOf(".jsp") > 0) {
                page = list[list.length - 1];
            }
            if ((page != null) && page.equalsIgnoreCase("main.jsp")) {
                if (session.getAttribute("role").equals(Role.USER)) {
                    filterChain.doFilter(request, response);
                    return;
                } else {
                    ServletContext ctx = filterConfig.getServletContext();
                    RequestDispatcher dispatcher = ctx.getRequestDispatcher("/login.jsp");
                    dispatcher.forward(request, response);
                    return;
                }
            } else if (page != null) {
                if (!pages.contains(page))
                    pages.add(page);
            }
        }
        filterChain.doFilter(request, response);
    }

    @Override
    public void destroy()
    {
        filterConfig = null;
    }
}