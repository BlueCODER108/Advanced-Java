package com.tcs.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step 1: load the driver
   	 Class.forName("oracle.jdbc.driver.OracleDriver");
   	 System.out.println("driver loaded successfully");
   	 
   	 //step 2 create the connection
   	 
   	 //assignment empid, empname, empsal...insert(5 records - 10000,20000), increment the salary if sal >25000 increment 500
     // delete the sal where sal<35000
   	 //delete the table
   	 
     Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
     System.out.println("Connection created successfully "+ connection);

   	 //step 3:process the query
     
        Statement statement = connection.createStatement();
        int x = statement.executeUpdate("create table student(rollno number(5), name varchar2(30), location varchar2(30))");
        System.out.println("table created successfully"+ x);
        
        int r1 = statement.executeUpdate("insert into student values(123,'ratan','Guntur')");
        int r2 = statement.executeUpdate("insert into student values(325,'anu','Hyderabad')");
        int r3 = statement.executeUpdate("insert into student values(653,'sravya','us')");
        
        System.out.println("Data inserted..."+ r1+""+r2+""+r3);
   	 
        int y = statement.executeUpdate("update student set location='hyd' where rollno = '123'");
        System.out.println("Data successfully updated"+ y);
        
        int z = statement.executeUpdate("drop table student");
        System.out.println("Table dropped successfully" + z);
        
        //step 4: close the connection
        
        connection.close();
        System.out.println("connection released successfully");
   	 
	}

}
