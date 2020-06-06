package com.johnjohn21121.HibernateTelusko.Demo1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Philosopher {
	
	@Id
	private int id;
	private String name;
	private String branch;
	private Quotes quotes;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Quotes getQuotes() {
		return quotes;
	}
	public void setQuotes(Quotes quotes) {
		this.quotes = quotes;
	}
	
	
	@Override
	public String toString() {
		return "Philosopher [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	
	

}
