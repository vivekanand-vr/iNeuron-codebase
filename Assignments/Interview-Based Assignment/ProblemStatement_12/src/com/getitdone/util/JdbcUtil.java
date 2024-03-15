package com.getitdone.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	
	public static Connection connection = null;
	public static Connection getConnection() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	public static void cleanUp() {
		
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
