package com.org.gen.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AdminHandsOn {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is Loading");

			String JdbcURL = "jdbc:mysql://localhost:3306/jdbcTest?useSSL=false";
			String Username = "root";
			String password = "12345";
			Connection con = null;
			con = DriverManager.getConnection(JdbcURL, Username, password);
			System.out.println("Connection is successful!!!!!!");
			
			System.out.println("Enter Number of customers to add: ");
			int t = sc.nextInt();
			
			for(int i =0 ; i<t ; i++)
			{
				System.out.println("Enter Account no.: ");
				int accNum = sc.nextInt();
				System.out.println("Enter Name: ");
				String name = sc.next();
				System.out.println("Enter Balance: ");
				int bal = sc.nextInt();
				System.out.println("Enter Phone Number: ");
				String phn = sc.next();
				AddCustomer.addCustomer(con, accNum, name, bal, phn);
			}
			
			
			
			con.close();
		} catch (Exception e) {
			System.out.print(e);
		}
		
	
	
	}

}
