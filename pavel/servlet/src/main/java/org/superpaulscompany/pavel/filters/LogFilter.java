package org.superpaulscompany.pavel.filters;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.superpaulscompany.pavel.model.LogsModel;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;

@WebFilter(urlPatterns = "/*")
public class LogFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;

        ArrayList<LogsModel> logsArrayList = new ArrayList<>();
        LogsModel logsModel = new LogsModel(new Date().toString(), req.getServletPath(), req.getRequestURL());
        logsArrayList.add(logsModel);

        ObjectMapper objectMapper = new ObjectMapper();
        String toJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(logsArrayList);

        logsArrayList.forEach(x -> {
            try (FileOutputStream fileOutputStream = new FileOutputStream("LogsList.json")) {
                fileOutputStream.write(toJson.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        logsArrayList.forEach(System.out::println);

        chain.doFilter(request, response);
    }
}
