package com.getitdone.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Repository {
	
	private static final String SELECT_QUERY = "select name,address,age from student";
	static {
           try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
 Connection connection=null;
	PreparedStatement prepareStatement=null;
	public  void getData()
	{
		try {
			 connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root123");
		prepareStatement = connection.prepareStatement(SELECT_QUERY);
			
			ResultSet rs = prepareStatement.executeQuery(SELECT_QUERY);
			System.out.println("name+\"\\t\"+address+\"\\t\"+age");
			while(rs.next()) {
				String name = rs.getString(1);
				String address = rs.getString(2);
				int age = rs.getInt(3);
				System.out.println(name+"\t"+address+"\t"+age);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				prepareStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
