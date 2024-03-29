package by.jd2.servletJspJstl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public abstract class WebUtils {
    private WebUtils() {

    }

    public static void forwardToJsp(String jspName, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/" + jspName + ".jsp").forward(request, response);
    }
}
