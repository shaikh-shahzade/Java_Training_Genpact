package com.org.gen.handson;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory(); 
        
        
        Session session = factory.openSession(); 
        session.beginTransaction();
        
        
        
        Address add1=new Address();    
        add1.setCity("Mumbai");
        add1.setStreet("XYZ");
        add1.setState("Maharastra");
           
        Address add2=new Address();    
        add2.setCity("Delhi");
        add2.setStreet("Charbagh");
        add2.setState("Delhi UT");
         
        Student s1=new Student();    
        s1.setName("Ravi");
        s1.setEmail("Ravi2205@gmail.com");
        s1.setAddress(add1);
        
        Student s2=new Student();    
        s2.setName("Alan");
        s2.setEmail("Alan2022@yahoo.com");
        s2.setAddress(add2);
        
        session.save(add1);
        session.save(add2);
        
        session.save(s1);
        session.save(s2);
        
        
        //session.delete(bank);
        

        session.getTransaction().commit();
        
        
        factory.close();
		
		
	}

}
