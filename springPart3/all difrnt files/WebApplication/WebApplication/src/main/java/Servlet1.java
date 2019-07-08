import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet1
 */
public class Servlet1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("DoGet method Called");
        ServletContext context = getServletContext();
        String fullname = context.getInitParameter("user_name");
        ServletConfig config = getServletConfig();
        String splesson = config.getInitParameter("splesson");
        req.setAttribute("splesson", splesson);
        req.setAttribute("fullname", fullname);
        System.out.println(fullname);
        System.out.println(splesson);

        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        rd.forward(req, resp);
    }
}