package com.corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HsqlConnection {

	public static void main(String[] args) {
		Connection con = null;
		String db = "jdbc:hsqldb:hsql://localhost/testdb;ifexists=true";
		String user = "SA";
        String password = "";
	      
	      try {
	         //Registering the HSQLDB JDBC driver
	         Class.forName("org.hsqldb.jdbc.JDBCDriver");
	         //Creating the connection with HSQLDB
	         con = DriverManager.getConnection(db, user, password);
	         if (con!= null){
	            System.out.println("Connection created successfully");
	            
	            Statement stmt = con.createStatement();
	            ResultSet rs =  stmt.executeQuery("select id, title from temp");
	            while(rs.next()) {
	                System.out.println("Customer id: " + rs.getString("ID") + " " + rs.getString("TITLE"));
	            }
	             
	            // Clean up
	            rs.close();
	            stmt.close();
	            
	         }else{
	            System.out.println("Problem with creating connection");
	         }
	      
	      }  catch (Exception e) {
	         e.printStackTrace(System.out);
	      }

	}

}
