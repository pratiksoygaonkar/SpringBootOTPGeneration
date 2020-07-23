package com.shri.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";
		
		String user = "springstudent";
		String password = "springstudent";
				
		
		try {
		
			System.out.println("Connecting to DB.."+jdbcUrl);
			
			Connection myConn = DriverManager.getConnection(jdbcUrl,user,password);
			
			System.out.println("Connection successfull!!");
			
			
			
		}
		catch(Exception exc) {
			exc.printStackTrace();
		}

	}

}
