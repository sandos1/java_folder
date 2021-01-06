package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		//An application can have more than one connection open to a database at a time. This is actually very common.
		//When you are done iterating the ResultSet you need to close both the ResultSet and the Statement 
		//object that created it (if you are done with it, that is). You do so by calling their close() methods, like this:
			//resultSet.close();
			//statement.close();
		
		
		Connection myconn=null;
        Statement mystate=null;
        //resultSet has a default behavior type ResultSet.TYPE_FORWARD_ONLY -> move only forward
        //ResultSet.TYPE_SCROLL_INSENSITIVE -> move both forward and backward
       // ResultSet.TYPE_SCROLL_SENSITIVE  -> move both forward and backward
        ResultSet myRs = null;
        String myUrl="jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pwd="D@o09712130";
        try{
            // get connection to the database
            myconn = DriverManager.getConnection(myUrl,user,pwd);
            System.out.println("Database connection sucessful!\n");
            // create a statement
            // open database connection to access data so you need to close it at the end. 
            mystate= myconn.createStatement();
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
            
            myconn.close();
            mystate.close();
            myRs.close();
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