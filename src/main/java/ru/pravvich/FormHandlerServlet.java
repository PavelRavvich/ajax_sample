package ru.pravvich;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FormHandlerServlet extends HttpServlet {

    private static final String path = "/WEB-INF/views/Registration.jsp";
    private static final String answer = "/WEB-INF/views/answer.jsp";


    private final Map<String, User> cache = new ConcurrentHashMap<>();


    protected void doPost(final HttpServletRequest request,
                          final HttpServletResponse response)
            throws ServletException, IOException {


        final User user = getUserFrom(request);

        System.out.println(user.toString());

        if (formValid(user)) {

            cache.put(user.getLogin() ,user);

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

    /**
     * Check input data from registration form.
     *
     * @param user all inputs data.
     * @return true if data valid.
     */
    private boolean formValid(final User user) {
        if (user.getUsername()     == null ||
                user.getLogin()    == null ||
                user.getCountry()  == null ||
                user.getPassword() == null ||
                user.getCity()     == null) return false;

        return cache.get(user.getLogin()) == null;
    }


    private User getUserFrom(final HttpServletRequest request) {

        return new User(
                request.getParameter("username"),
                request.getParameter("login"),
                request.getParameter("password"),
                request.getParameter("country"),
                request.getParameter("city"));
    }
}
