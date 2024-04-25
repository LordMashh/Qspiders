package uservalidation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String email = req.getParameter("email");
        String mob_no = req.getParameter("mobno");
        String passwd = req.getParameter("pwd");

        // Output for testing
        System.out.println(user);
        System.out.println(email);
        System.out.println(mob_no);
        System.out.println(passwd);

        String url = "jdbc:postgresql://localhost:5432/M2?user=postgres&password=root";
        
        System.out.println("this is loaded url line");
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("driver loaded");
        try (Connection con = DriverManager.getConnection(url)) {
            String sql = "INSERT INTO mayank VALUES (?, ?, ?, ?)";
           PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, user);
                ps.setString(2, email);
                ps.setString(3, mob_no);
                ps.setString(4, passwd);

                ps.execute();
                System.out.println("Data is inserted");
          
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("query ended");
        // You can write response here if needed
         PrintWriter pw = resp.getWriter();
         pw.print("<h1>UserName : " + user + "</h1>");
         pw.print("<h1>Email : " + email + "</h1>");
         pw.print("<h1>Mobile Number : " + mob_no + "</h1>");
    }
}
