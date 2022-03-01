package com.org.gen.handson;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.org.gen.mapping.onetomany.Answers1tom;
import com.org.gen.mapping.onetomany.Question1tom;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory = cfg.buildSessionFactory(); 
	        
	        
	        Session session = factory.openSession(); 
	        session.beginTransaction();
	        
	       
	        Department d1 = new Department();
	        d1.setDep_name("IT");
	        
	        Department d2 = new Department();
	        d2.setDep_name("Consultant");
	        
	        Department d3 = new Department();
	        d3.setDep_name("Quality");
	        
	        Department d4 = new Department();
	        d4.setDep_name("CustomerSupport");
	          
	        
	        ArrayList<Department> list1=new ArrayList<Department>();    
	        list1.add(d1);    
	        list1.add(d2);    
	            
	        ArrayList<Department> list2=new ArrayList<Department>();    
	        list2.add(d3);    
	        list2.add(d4);    
	        
	        Employee e1 = new Employee();
	        e1.setName("Ravi");
	        e1.setEmail("Ravi.2k22@gmail.com");
	        e1.setDepartments(list1);
	            
	        Employee e2 = new Employee();
	        e1.setName("Alan");
	        e1.setEmail("AlanWorld@gmail.com");
	        e1.setDepartments(list1);
	        
	        session.save(d1);
	        session.save(d2);
	        session.save(d3);
	        session.save(d4);
	        
	        session.save(e1);
	        session.save(e2);
	        
	        
	        //session.delete(bank);
	        

	        session.getTransaction().commit();
	        
	        
	        factory.close();
			
			
		
		
		
	}

}
