package first_module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/test";
		String user="postgres";
		String password="root";
		
		try {
			//step 1
			Class.forName("org.postgresql.Driver");
			
			//step 2
			Connection connection=DriverManager.getConnection(url,user,password);
			
			//step 3
			Statement stm=connection.createStatement();
			
			String sql="insert into student values(102,'dinga',11),(103,'chinga',12)";
			//step 4
			stm.execute(sql);
			
//			step 5
			connection.close();
			System.out.println("okk");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
