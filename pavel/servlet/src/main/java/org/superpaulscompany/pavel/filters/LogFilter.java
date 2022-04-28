package org.superpaulscompany.pavel.filters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.superpaulscompany.pavel.model.LogsModel;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;

public class LogFilter implements Filter {
    private final ArrayList<LogsModel> logsArrayList = new ArrayList<>();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;

        LogsModel logsModel = new LogsModel(new Date().toString(), req.getServletPath(), req.getRequestURL());
        logsArrayList.add(logsModel);

       // writeJson();
        System.out.println(logsModel);

        chain.doFilter(request, response);
    }

    private void writeJson() throws JsonProcessingException {
        String toJson = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(logsArrayList);
        logsArrayList.forEach(x -> {
            try (FileOutputStream fileOutputStream = new FileOutputStream("LogsList.json")) {
                fileOutputStream.write(toJson.getBytes(StandardCharsets.UTF_8));
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
