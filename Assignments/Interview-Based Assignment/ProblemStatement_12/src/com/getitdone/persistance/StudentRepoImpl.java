package com.getitdone.persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.getitdone.model.Student;
import com.getitdone.util.JdbcUtil;

public class StudentRepoImpl implements IStudentRepository {
	Connection connection=JdbcUtil.getConnection();
	

	@Override
	public String save(Student student) {
		try {
			String SAVE_QUERY="insert into student(name,address,age)values(?,?,?)";
			PreparedStatement prepareStatement = connection.prepareStatement(SAVE_QUERY);
			prepareStatement.setString(1, student.getName());
			prepareStatement.setString(2, student.getAddress());
			prepareStatement.setInt(3,student.getAge());
			int result = prepareStatement.executeUpdate();
			if(result==1) {
				return "Student data insert";
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return "Student data insertion failed";
	}

	@Override
	public Student getById(Integer id) {
		Student student =null;
		try {
			String SELECT_QUERY="select id,name,address,age from student where id=?";
			PreparedStatement prepareStatement = connection.prepareStatement(SELECT_QUERY);
			prepareStatement.setInt(1, id);
			ResultSet result = prepareStatement.executeQuery();
		
			if(result.next()) {
				student=new Student(result.getString(2),result.getString(3),result.getInt(4));
				student.setId(result.getInt(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return student;
	}

	@Override
	public Student update(Student student) {
		Student student2 = getById(student.getId());
		if(student2!=null) {
			String UPDATE_QUERY="UPDATE student SET name =?,address=?,age=? WHERE id= ?";
			try {
				PreparedStatement prepareStatement = connection.prepareStatement(UPDATE_QUERY);
				prepareStatement.setString(1, student.getName());
				prepareStatement.setString(2, student.getAddress());
				prepareStatement.setInt(3, student.getAge());
				prepareStatement.setInt(4, student.getId());
				int result = prepareStatement.executeUpdate();
				if(result==1) return student;
			
			} catch (SQLException e) {
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
		}
	
		return null;
	}

	@Override
	public String deleteById(Integer id) {
		String DELETE_QUERY="delete from student where id=?";
		try {
			PreparedStatement prepareStatement = connection.prepareStatement(DELETE_QUERY);
			prepareStatement.setInt(1, id);
			int result = prepareStatement.executeUpdate();
			if(result==1) {
				return "Student deleted";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "student deletion failed";
	}

}
