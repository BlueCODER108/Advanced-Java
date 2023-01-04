package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		//assignment empid, empname, empsal...insert(5 records - 10000,20000), increment the salary if sal >25000 increment 500
	     // delete the sal where sal<35000
	   	 //delete the table
	   	 
		//step-1 load the driver
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver loaded successfully.......");
		
		//step-2 Create the connection
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		System.out.println("Connection formed successfullyyy...."+connection);		
		
		//step-3 process the query
		
	    Statement statement = connection.createStatement();
		int x = statement.executeUpdate("create table emp(empid number(5), empname varchar2(30), empsal number(10))");
		System.out.println("table created  successfully......emp"+x);
		
	}

}
