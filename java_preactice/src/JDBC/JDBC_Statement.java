package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBC_Statement {

	public static void main(String[] args) {
		//Step to Connect JDBC API
		//1- Register your Driver class
		//2- open a connection
		//3- Create a statement 
		//4- execute a statement
		//5- ResultSet
		Connection connection = jDBC_ConnectionClass.getConnection();
		
		Statement mystate=null ;
		ResultSet myRs =null;
		
		if(connection!=null) {
			System.out.println("jDBC connected.........");
		}
		
		try {
		 mystate= connection.createStatement();
         //insert a new employee
         //String query1 = "insert into employees(last_name,first_name,email,department,salary) values ('soro','sandona','sandona.soro@yahoo.fr','HR',5000.00)";
         //final int i = mystate.executeUpdate(query1);


         //update existing data
         String query2 =  "update emp  set name='Kolo' " + "where id=2";
         mystate.executeUpdate(query2);

         //delete data from database
         String query3 = "delete from emp where id=4";
         mystate.executeUpdate(query3);
          myRs= mystate.executeQuery("select* from emp");
         while (myRs.next()){
         	System.out.println(myRs.getString("name")+" "+myRs.getInt("age"));      
         	}
         
         connection.close();
     }
     catch (Exception e){
         e.printStackTrace();
     }
     finally {
     	
     		
             try {
					myRs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
         
     }

	}

}
