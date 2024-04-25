package com.ty.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Execute_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:postgresql://localhost:5432/school?user=postgres&password=root";
		Connection con=null;
		try {
			Class.forName("org.postgresql.Driver");
			
			con=DriverManager.getConnection(url);
			
			Statement stm=con.createStatement();
			String sql="select * from student";
			
			System.out.println(stm.executeUpdate(sql));
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null) {					
				con.close();
				System.out.println("connection closed");
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
