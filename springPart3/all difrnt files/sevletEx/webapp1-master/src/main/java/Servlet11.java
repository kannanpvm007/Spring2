import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.spi.http.HttpContext;

@WebServlet("/Servlet11")

 public class Servlet11 extends HttpServlet {
     @Override
     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
         System.out.println("Servlet11 caled");

         ServletContext ser1 = getServletContext();
         ser1.setInitParameter("name", "welcome to kovai");
        String send = ser1.getInitParameter("name");
        req.setAttribute("name", send);

        RequestDispatcher rd= req.getRequestDispatcher("servlet11.jsp");
        rd.forward(req, resp);
     }
 
  

 }