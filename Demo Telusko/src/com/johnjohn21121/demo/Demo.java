package com.johnjohn21121.demo;

import java.sql.*;

public class Demo {
	
	public static void main (String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/hb_student_tracker";
		String userName ="root";
		String password= "root";
		String query ="select * from student2 ";
		String query2 = "insert into student2 values ( 8,'Carl', 40, 30, 'c');";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,userName,password);
		
		Statement st = con.createStatement();
		
		//ResultSet rs = st.executeQuery(query);
		int count = st.executeUpdate(query2);
		
		
		//String userData = "";
		
		//while(rs.next()) {
		//userData = rs.getInt(1) + " " + rs.getString(2);
		
		System.out.println(count + " Row/s affected.");
		//}
        		
		st.close();
		con.close();
		
		
	}
}
