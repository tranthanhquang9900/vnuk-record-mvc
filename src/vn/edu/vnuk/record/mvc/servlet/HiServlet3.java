package vn.edu.vnuk.record.mvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/hello")
public class HiServlet3 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>First Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hi World Servlet 3 on Eclipse!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}