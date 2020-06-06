package com.johnjohn21121.demoDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoDao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		StudentDao studentDao = new StudentDao();
//		Student student1 = studentDao.getStudent(1);
//		System.out.println(student1.getStudentName());
		
		studentDao.connect();
		Student student2 = new Student();
		student2.id=4;
		student2.studentName="Sazuki";
		studentDao.addStudent(student2);
	}

}
