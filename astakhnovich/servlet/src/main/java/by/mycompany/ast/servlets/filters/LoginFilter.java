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
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/main")
public class LoginFilter implements Filter
{
    private FilterConfig filterConfig;
    private static ArrayList<String> pages;  // хранилище страниц

    public LoginFilter()
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
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession(false);
        //URL Запроса/переадресации на Servlet входа
        String loginURI = req.getContextPath() + "/LoginServlet";
        //Если сессия ранее создана
        boolean loggedIn = session != null && session.getAttribute("login") != null && session.getAttribute("role") != null;
        boolean loginRequest = req.getRequestURI().equals(loginURI);
        //Если запрос пришел со страницы с входом или сессия не пуста даем добро следовать дальше
        //Если нет ридерект на страницу входа
        if (loggedIn || loginRequest) {
            filterChain.doFilter(req, res);
        } else {
            res.sendRedirect(loginURI);
        }
    }

    @Override
    public void destroy()
    {
        filterConfig = null;
    }
}