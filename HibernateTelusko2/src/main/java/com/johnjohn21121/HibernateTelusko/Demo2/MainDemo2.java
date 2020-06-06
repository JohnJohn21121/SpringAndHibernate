package com.johnjohn21121.HibernateTelusko.Demo2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class MainDemo2 {

	public static void main(String[] args) {
			
		Laptop laptop = new Laptop();
		laptop.setLaptopId(102);
		laptop.setLatopModel("Dell");
		
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Juan");
		student.setGrades(95);
		
		student.getLaptop().add(laptop);
		laptop.getStudents().add(student);
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml")
    			.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
    	
    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
    			.applySettings(con.getProperties()).build();
    	
    	SessionFactory sf = con.buildSessionFactory(serviceRegistry);
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	
    	//session.save(student);
    	session.save(laptop);
    	
    	session.getTransaction().commit();
	}

}
