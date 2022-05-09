package by.mycompany.ast.servlets.filters;

import by.mycompany.ast.servlets.LoginServlet;
import by.mycompany.ast.servlets.RegistrationServlet;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//@WebFilter("/login")
public class LogoutFilter implements Filter {
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        filterConfig = fConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession session = req.getSession(false);
        boolean loggedOut = session != null && session.getAttribute("id") != null
                && session.getAttribute("role") != null;
        if (loggedOut) {
            res.sendRedirect("/servlet");
        } else {
            filterChain.doFilter(req, res);
        }
    }

    @Override
    public void destroy() {
        filterConfig = null;
    }
}

