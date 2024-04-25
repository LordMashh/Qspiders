package first_module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/test";
		String user="postgres";
		String pass="root";
		String driver1="org.postgresql.Driver";
		
		try {
//			step 1
			Class.forName(driver1);
			
//			step 2
			Connection con=DriverManager.getConnection(url,user,pass);
			
//			step 3
			Statement stm=con.createStatement();
			
			String sql="Delete from student where sid=101";
//			step 4
			stm.execute(sql);
			
//			step 5
			con.close();
			
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
