package com.org.gen.day11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CheckBalance {

	static int getBalance( Connection con  , int accountNum)
	{
		Statement st;
		try {
			
			String query = "select available_balance from bank where account_number =  " + accountNum + ";";
			st = con.createStatement();
			ResultSet result = st.executeQuery(query);
			
			if(result.next())
			{
				return result.getInt(1);
				
				
			}
			
			System.out.println("No result Found");
			return -1;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return -1;
	}
	
}
