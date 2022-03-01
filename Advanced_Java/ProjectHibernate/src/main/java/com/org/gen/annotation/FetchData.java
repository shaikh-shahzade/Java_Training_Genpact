package com.org.gen.annotation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory(); 
       
        
        
        Session session = factory.openSession(); 
        session.beginTransaction();
        

        Bank user = (Bank)session.get(Bank.class, 1007);
        System.out.println(user.toString());
        
        
        session.getTransaction().commit();
        
        
        
        factory.close();
        
        
	}

}
