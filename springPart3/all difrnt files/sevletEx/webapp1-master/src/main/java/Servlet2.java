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
 * Servlet1
 */
@WebServlet(urlPatterns = "/Servlet2", initParams = { @WebInitParam(name = "password", value = "Good Morning"),

})

public class Servlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req, resp);
        System.out.println("Servlet 2 doGet method called");
        ServletConfig config = getServletConfig();
        String ln = config.getInitParameter("password");
        System.out.println(ln); 
        req.setAttribute("configparam", ln);
        ServletContext context = getServletContext();
        String fn = context.getInitParameter("username");
        System.out.println(fn);
        
        req.setAttribute("contextparam", fn);
        RequestDispatcher rd = req.getRequestDispatcher("servlet2.jsp");
        rd.forward(req, resp);
    }
}















