package ru.pravvich;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonCitiesServlet extends HttpServlet {

    protected void doGet(final HttpServletRequest req,
                         final HttpServletResponse resp)
            throws ServletException, IOException {


        String sportsName = req.getParameter("sportsName");
        List<String> list = new ArrayList<>();
        String json = null;

        if (sportsName.equals("USA")) {
            list.add("New York");
            list.add("Boston");
            list.add("Chicago");
            list.add("Dallas");
        } else if (sportsName.equals("Israel")) {
            list.add("Jerusalem");
            list.add("Tel Aviv");
            list.add("Haifa");
            list.add("Ashdod");
        } else if (sportsName.equals("Select Country")) {
            list.add("Select Country");
        }

        json = new Gson().toJson(list);
        resp.setContentType("application/json");
        resp.getWriter().write(json);
    }
}
