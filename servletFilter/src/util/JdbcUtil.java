package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	private  static String url = "jdbc:mysql://localhost:3306/test";
	
	private static String driverClassName = "com.mysql.jdbc.Driver";
	private static String username = "root";
	
	private static String password = "123456";
	
	private static Connection conn = null;
	
	public static Connection getConnection()  {
		try {
			if(conn == null) {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
