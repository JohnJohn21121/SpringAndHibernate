package com.johnjohn21121.demoDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {

	Connection con = null;
	
	public void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hb_student_tracker",
					"root","root");
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
	
	
	public Student getStudent(int id) throws ClassNotFoundException, SQLException {
			try {
			String query ="select studentName from studentdao where id="+id;
			Student student = new Student();
			student.id = id;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			rs.next();
			
			String name = rs.getString(1);
			student.studentName = name;
			
			return student;
			
			}catch (Exception ex) {
				System.out.println(ex);
			}
			return null;
	}
	
	public void addStudent (Student student) throws SQLException {
		String query = "insert into studentdao values (?,?)";
		PreparedStatement preparedStatement= con.prepareStatement(query);
		preparedStatement.setInt(1,student.id);
		preparedStatement.setString(2, student.studentName);
		preparedStatement.executeUpdate();
		
	}
}
