import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class First extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Register Page data ");
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pwd");
		
		System.out.println("Name : " + name);
		System.out.println("Email : " + email);
		System.out.println("password : " + pass);
		
		PrintWriter pw = res.getWriter();
		pw.print("<h1> Register Page data </h1>");
		pw.print("<h1> Name : "+name+" </h1>");
		pw.print("<h1> Email : "+email+" </h1>");
		
		
	}

}
