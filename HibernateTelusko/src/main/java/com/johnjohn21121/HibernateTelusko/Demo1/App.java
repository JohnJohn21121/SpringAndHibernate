package com.johnjohn21121.HibernateTelusko.Demo1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App 
{
    public static void main( String[] args ){
       
    	Quotes quotes = new Quotes();
        quotes.setQuote("It may see difficult at first, but everything is difficult at First");
        quotes.setYear(1643);
    	Philosopher philosopher = new Philosopher();
    	philosopher.setId(1);
    	philosopher.setName("Miyamoto Musashi");
    	philosopher.setBranch("The Way of the Void");
     	philosopher.setQuotes(quotes);
    	
    	Configuration con = new Configuration().configure("hibernate.cfg.xml")
    			.addAnnotatedClass(Philosopher.class);
    	
    	ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
    			.applySettings(con.getProperties()).build();
    	
    	SessionFactory sf = con.buildSessionFactory(serviceRegistry);
    	Session session = sf.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(philosopher);
    	
//    	philosopher = session.get(Philosopher.class, 2);
    	
    	tx.commit();
    	
//    	System.out.println(philosopher);
    }
}
