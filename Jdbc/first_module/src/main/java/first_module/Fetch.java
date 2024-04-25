package first_module;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;

public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/test";
		String user="postgres";
		String pass="root";
		String driver1="org.postgresql.Driver";
		
		try {
			//load the driver
			Class.forName(driver1);
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement stm=con.createStatement();
			String sql="Select * from student";
			
//			stm.execute(sql);
			
			ResultSet rs=stm.executeQuery(sql);
			
			System.out.println("id\tname\tstd");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ "\t" + rs.getString(2)+"\t"+rs.getInt(3));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
