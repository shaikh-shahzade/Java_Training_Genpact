package com.org.gen.mapping.onetomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class OnetoMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory(); 
        
        
        Session session = factory.openSession(); 
        session.beginTransaction();
        
        
        
        Answers1tom ans1=new Answers1tom();    
        ans1.setAnswer("Java is a programming language");    
            
           
        Answers1tom ans2=new Answers1tom();    
        ans2.setAnswer("Servlet is an Interface");   
        
           
            
        Answers1tom ans3=new Answers1tom();    
        ans3.setAnswer("Java is a platform");    
           
        Answers1tom ans4=new Answers1tom();    
        ans4.setAnswer("Servlet is an API");    
        
        ArrayList<Answers1tom> list1=new ArrayList<Answers1tom>();    
        list1.add(ans1);    
        list1.add(ans2);    
            
        ArrayList<Answers1tom> list2=new ArrayList<Answers1tom>();    
        list2.add(ans3);    
        list2.add(ans4);    
        
        Question1tom question1=new Question1tom();    
        question1.setQuestion("What is Java?");    
        question1.setAnswer(list1);    
            
        Question1tom question2=new Question1tom();    
        question2.setQuestion("What is Servlet?");    
        question2.setAnswer(list2);    
            
        
        session.save(ans1);
        session.save(ans2);
        session.save(ans3);
        session.save(ans4);
        
        session.save(question1);
        session.save(question2);
        
        
        //session.delete(bank);
        

        session.getTransaction().commit();
        
        
        factory.close();
		
		
	}

}
