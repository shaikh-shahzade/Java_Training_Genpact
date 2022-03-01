package com.org.gen.mapping.manytomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ManytoMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory(); 
        
        
        Session session = factory.openSession(); 
        session.beginTransaction();
        
        
        
        Answersmtom ans1=new Answersmtom();    
        ans1.setAnswer("Java is a programming language");    
            
           
        Answersmtom ans2=new Answersmtom();    
        ans2.setAnswer("Servlet is an Interface");   
        
           
            
        Answersmtom ans3=new Answersmtom();    
        ans3.setAnswer("Java is a platform");    
           
        Answersmtom ans4=new Answersmtom();    
        ans4.setAnswer("Servlet is an API");    
        
        ArrayList<Answersmtom> list1=new ArrayList<Answersmtom>();    
        list1.add(ans1);    
        list1.add(ans2);    
            
        ArrayList<Answersmtom> list2=new ArrayList<Answersmtom>();    
        list2.add(ans3);    
        list2.add(ans4);    
        
        Questionmtom question1=new Questionmtom();    
        question1.setQuestion("What is Java?");    
        question1.setAnswer(list1);    
            
        Questionmtom question2=new Questionmtom();    
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
