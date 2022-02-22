package com.org.gen.day11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataConnection {

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

			Statement st = con.createStatement();
			ResultSet result = st.executeQuery("select  * from bank;");

			while (result.next()) {
				System.out.println("id: " + result.getInt(1) + "  Name: " + result.getString(2));

			}

			con.close();
		} catch (Exception e) {
			System.out.print(e);
		}
	}

}
