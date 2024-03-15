package com.getitdone.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.getitdone.model.Blogpost;

public class BlogRepoImpl implements IBlogRepo {
	private static final String SAVE_QUERY = "insert into blogpost(title,description,content)values(?,?,?)";
	private static final String GET_QUERY = "select * from blogpost";

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public String saveBlog(Blogpost bp) {
	      Connection connection=null;
	      PreparedStatement statement=null;
	      try {
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root123");
	        statement = connection.prepareStatement(SAVE_QUERY);	
	         statement.setString(1, bp.getTitle());
	         statement.setString(2, bp.getDescription());
	         statement.setString(3, bp.getContent());
	         int result = statement.executeUpdate();
	         if(result==1) {
	        	 return "Blogpost saved successfully";
	         }
	      } catch (SQLException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		return "Error in saving blogpost try again";
	}

	@Override
	public List<Blogpost> getAllBlogposts() {
		 Connection connection=null;
	      PreparedStatement statement=null;
	      try {
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root123");
			  statement = connection.prepareStatement(GET_QUERY);
			  ResultSet rs = statement.executeQuery();
			  List<Blogpost> list=new ArrayList<>();
			  if(list!=null) {
			  while(rs.next()) {
				  
				  Blogpost post=new Blogpost(rs.getString(2),rs.getString(3),rs.getString(4));
				  list.add(post);
			  }
			  return list;
			  }
			  
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
				statement.close();
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
		}
	      
		return null;
	}

}
