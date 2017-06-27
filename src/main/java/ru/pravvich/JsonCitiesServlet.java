package ru.pravvich;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JsonCitiesServlet extends HttpServlet {

    protected void doGet(final HttpServletRequest req,
                         final HttpServletResponse resp)
            throws ServletException, IOException {


        resp.setContentType("application/json");

        resp.getWriter()
                .write(new JsonConverter().getAllCity(
                        req.getParameter("country")));
    }
}
