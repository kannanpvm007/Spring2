import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
@WebServlet("/Servlet1")

public class Servlet1 extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req, resp);
        System.out.println("Servlet 1 doGet method called");
        ServletContext context = getServletContext();
        context.setInitParameter("username", "Welcome to KGiSL");
        String fn=context.getInitParameter("username");
        System.out.println(fn);
        req.setAttribute("contextparam", fn);
        RequestDispatcher rd=req.getRequestDispatcher("servlet1.jsp");
       rd.forward(req, resp);
    }
}