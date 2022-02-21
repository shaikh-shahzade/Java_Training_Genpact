package com.org.gen.day11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Transactions {

	static int minWithDrawLimit = 10000;
	static void withDraw( Connection con  , int accountNum , int amount)
	{
		if(amount<minWithDrawLimit)
		{
			System.out.println("Cannot Withdraw: Minimum Withdrwaw limit is:"+minWithDrawLimit);
			return;
		}
		Statement st;
		try {
			
			String query = "select available_balance from bank where account_number =  " + accountNum + ";";
			st = con.createStatement();
			ResultSet result = st.executeQuery(query);
			
			if(result.next())
			{
				int avBal =  result.getInt(1);
				
				if(avBal>=amount)
				{
					int changeBal = avBal-amount;
					query = "Update bank set available_balance =  "+changeBal
							+ " where account_number =  " + accountNum + ";";
					st.execute(query);
					
						System.out.println("Withdraw Succesfull ");
			
					

						System.out.println("Amount Withdrawn: "+amount);
						System.out.println("Available Balance: "+changeBal);
				
						return;
					
				}
				
			}
			
			System.out.println("Cannot Withdraw");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	static void deposit( Connection con  , int accountNum , int amount)
	{
		Statement st;
		try {
			
			String query = "select available_balance from bank where account_number =  " + accountNum + ";";
			st = con.createStatement();
			ResultSet result = st.executeQuery(query);
			
			if(result.next())
			{
				int avBal =  result.getInt(1);
				
					int changeBal = avBal+amount;
					query = "Update bank set available_balance =  "+changeBal
							+ " where account_number =  " + accountNum + ";";
					st.execute(query);
					
						System.out.println("Deposit Succesfull ");

						System.out.println("Amount Deposited: "+amount);
						System.out.println("Available Balance: "+changeBal);
				
						return;
					
					
						
				
				
			}
			
			System.out.println("Cannot Deposit");
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
