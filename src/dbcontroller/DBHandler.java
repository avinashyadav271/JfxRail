package dbcontroller;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.;
import java.sql.SQLException;

public class DBHandler {
				
	
	Connection dbconnection;
	
	public Connection getConnection(){
	
		String url="jdbc:mysql://127.0.0.1:3306/rail" + "?autoReconnect=true&useSSL=false";
		String uname="root";
		String pass="admin";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}
		
		try {
			dbconnection = DriverManager.getConnection(url,uname,pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		
		return dbconnection;
	
	
	
	}
		
		
}

