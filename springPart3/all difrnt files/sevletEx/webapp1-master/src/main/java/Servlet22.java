import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet22
 */

@WebServlet(urlPatterns = "/Servlet22", initParams = { @WebInitParam(name = "name22", value = "welcome back to home"),

})
public class Servlet22 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext ser1 = getServletContext();
        String f = ser1.getInitParameter("1name");
        System.out.println(f);
        req.setAttribute("confg", f);
        ServletConfig scg = getServletConfig();
        String h = scg.getInitParameter("name22");

        System.out.println(h);
        req.setAttribute("contxt", h);

        RequestDispatcher rd = req.getRequestDispatcher("servlet22.jsp");
        rd.forward(req, resp);
    }

}