package com.pro.assessment.database;

import java.sql.*;

public class SQLiteJDBC {

   public static void main( String args[] ) {
      Connection c = null;
      Statement stmt = null;
      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:Northwind_large.sqlite");
         System.out.println("Opened database successfully");

        stmt = c.createStatement();
       String sql = "INSERT INTO CustNickNames(CustId,NickName)" +
                    " VALUES('ALFKI','Awesome')"; 	
         stmt.executeUpdate(sql);
         stmt.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("Table created successfully");
   }
}