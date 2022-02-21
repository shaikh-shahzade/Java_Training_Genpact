package com.org.gen.day11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddCustomer {
	static void addCustomer( Connection con  , int accNum , String name , int bal , String phn)
	{
		
		Statement st;
		try {
			
			String query = "INSERT INTO bank VALUES ("+accNum+", "
					+ "\""+name+"\","
					+ bal+","
					+ phn+");";
			System.out.println(query);
			 st = con.createStatement();
			st.execute(query);
			
			
			
			System.out.println("User Added");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
}
