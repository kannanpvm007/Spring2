import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet2
 */
public class Servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Get method Called");
        ServletContext context = getServletContext();
        String fullname = context.getInitParameter("user_name");
        ServletConfig config = getServletConfig();
        String lesson = config.getInitParameter("splesson2");
        req.setAttribute("lesson", lesson);
        req.setAttribute("fullname", fullname);
        System.out.println(fullname);
        System.out.println(lesson);
        RequestDispatcher rd = req.getRequestDispatcher("Home.jsp");
        rd.forward(req, resp);
    }

}
