package com.johnjohn21121.HibernateTelusko.Demo2;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Laptop {
	
	@Id
	private int laptopId;
	private String latopModel;
	@ManyToMany
	private List<Student> students = new ArrayList<Student>();
	
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLatopModel() {
		return latopModel;
	}
	public void setLatopModel(String latopModel) {
		this.latopModel = latopModel;
	}
	
	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", latopModel=" + latopModel + "]";
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
