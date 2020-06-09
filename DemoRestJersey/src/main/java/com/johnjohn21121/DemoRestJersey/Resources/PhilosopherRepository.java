package com.johnjohn21121.DemoRestJersey.Resources;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.johnjohn21121.DemoRestJersey.Philosopher;

public class PhilosopherRepository {
	
	Connection con = null;
	String url = "jdbc:mysql://localhost:3306/hb_student_tracker";
	String user= "root";
	String password= "root";
	
	public PhilosopherRepository(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user,password);	
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public List<Philosopher> getPhilosophers(){
		
		List<Philosopher> philosophers = new ArrayList<>();
		try {
			String query = "select * from philosopher";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
		
			while(rs.next()) {
				Philosopher ph = new Philosopher();
				ph.setId(rs.getInt(1));
				ph.setName(rs.getString(2));
				ph.setBranch(rs.getString(3));
				philosophers.add(ph);
			}
		}catch(Exception e){
			System.out.println(e);
		}
		return philosophers;
	}
	
	public Philosopher getPhilosopherById(int id){
		Philosopher ph = new Philosopher();
		try {
			String query = "select * from philosopher where id="+ id;
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			if(rs.next()) {
				ph.setId(rs.getInt(1));
				ph.setName(rs.getString(2));
				ph.setBranch(rs.getString(3));
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		return ph;
	}

	
	public void create(Philosopher ph1) {
		String query = "insert into philosopher values(?,?,?)";
		
		try {
			PreparedStatement st = con.prepareStatement(query);
			
			st.setInt(1,ph1.getId());
			st.setString(2,ph1.getName());
			st.setString(3, ph1.getBranch());

			st.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void update(Philosopher ph1) {
		String query = "update philosopher set name=?, branch=? where id=?";
		
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(3,ph1.getId());
			st.setString(1,ph1.getName());
			st.setString(2, ph1.getBranch());

			st.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	public void delete(int id) {
		String query = "delete from philosopher where id=?";
		
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1,id);
			st.executeUpdate();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
}
	




