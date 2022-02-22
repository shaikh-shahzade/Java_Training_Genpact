package com.org.gen.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PreparedStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is Loading");

			String JdbcURL = "jdbc:mysql://localhost:3306/jdbcTest?useSSL=false";
			String Username = "root";
			String password = "12345";
			Connection con = null;
			con = DriverManager.getConnection(JdbcURL, Username, password);
			System.out.println("Connection is successful!!!!!!");

			
			PreparedStatement pS = 	con.prepareStatement("Insert into test Values (?,?)");
			pS.setInt(1, 4);
			pS.setString(2, "Ravi");
			pS.execute();
			System.out.println("Executed " );

			con.close();
		} catch (Exception e) {
			System.out.print(e);
		}
	}

}
