package vn.edu.vnuk.record.mvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class HiWorld extends HttpServlet {
	
	@Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setCharacterEncoding ("UTF-8");
	    response.setContentType ("text / html; charset = UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>First Servlet</title>");
        out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hi World Servlet on Eclipse!</h1>");
        out.println("<h3>4 �?ống �?a Thuận Phước, Q. Hải Châu, �?à Nẵng 550000\n</h3>");
        out.println("</body>");
        out.println("</html>");
    }
}