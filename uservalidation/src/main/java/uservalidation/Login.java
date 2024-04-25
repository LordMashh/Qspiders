package uservalidation;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String passwd = req.getParameter("pwd");

        // Output for testing
        System.out.println(user);
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
            String sql = "SELECT username,passwd FROM mayank WHERE username = ? AND passwd = ? ";
            
            System.out.println(sql);
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, user);
            pstmt.setString(2, passwd);
            ResultSet rs = pstmt.executeQuery();
            String username = null;
            String password = null;
            while(rs.next()) {
                username = rs.getString("username");
                password = rs.getString("passwd");
            }
            System.out.println("database user : "+username);
            System.out.println("database password : "+password);
            System.out.println("loginpage user : "+user);
            System.out.println("loginpage password : "+passwd);
            PrintWriter pw = resp.getWriter();
            if (user.equals(username)&& passwd.equals(password)) {
                pw.print("<h1>User is validated and congrats</h1>");
                System.out.println("User is validated and congrats");
            } else {
                pw.print("<h1>User is not validated and congrats</h1>");
                System.out.println("User is not validated and congrats");
            }
            
            System.out.println("Data is inserted");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("query ended");
        // You can write response here if needed
    }
}
