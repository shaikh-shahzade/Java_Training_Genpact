package com.org.gen.mapping.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory(); 
        
        
        Session session = factory.openSession(); 
        session.beginTransaction();
        
        
        
        Answers ans1=new Answers();    
        ans1.setAnswer("Java is a programming language");    
            
           
        Answers ans2=new Answers();    
        ans2.setAnswer("Servlet is an Interface");   
        
        Question question1=new Question();    
        question1.setQuestion("What is Java?");    
        question1.setAnswer(ans1);    
            
        Question question2=new Question();    
        question2.setQuestion("What is Servlet?");    
        question2.setAnswer(ans2);    
            
        
        session.save(ans1);
        session.save(ans2);
        
        session.save(question1);
        session.save(question2);
        
        
        //session.delete(bank);
        

        session.getTransaction().commit();
        
        
        factory.close();
		
		
	}

}
