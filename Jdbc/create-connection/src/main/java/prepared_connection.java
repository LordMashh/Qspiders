import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class prepared_connection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fin=new FileInputStream("college_db.properties");
			
			Properties properties=new Properties();
			
			properties.load(fin);
			
			String driver=properties.getProperty("driver");
			
			
			Class.forName(driver);
			
			String url=properties.getProperty("url");
			Connection con=DriverManager.getConnection(url, properties);
			
			
			
			//static query - execute only once & can't execute again and again
			//(to execute static query we use statement)
			String sql="insert into teacher values(?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setInt(1, 103);
			ps.setString(2, "kashi");
			ps.setString(3, "kashi@gmail.com");
			
			ps.execute();
			
			con.close();
			
			System.out.println("okk");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
