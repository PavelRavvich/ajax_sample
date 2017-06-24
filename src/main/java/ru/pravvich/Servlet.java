package ru.pravvich;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Servlet extends HttpServlet {

    private static final String path = "/WEB-INF/views/ajax-sample.jsp";
    private static final String answer = "/WEB-INF/views/answer.jsp";


    private final List<String> cache = new ArrayList<String>();


    protected void doPost(final HttpServletRequest request,
                          final HttpServletResponse response)
            throws ServletException, IOException {


        final String name = request.getParameter("username");


        if (name != null && name.length() >= 5) {

            cache.add(name);

            request.setAttribute("serverAnswer", "success");

        } else {

            request.setAttribute("serverAnswer", "fail");

        }

        request.getRequestDispatcher(answer).forward(request, response);
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        request.getRequestDispatcher(path).forward(request, response);
    }
}
