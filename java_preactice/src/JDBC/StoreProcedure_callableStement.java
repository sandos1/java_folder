package JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StoreProcedure_callableStement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection=null;
		
       
        
        String myUrl="jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pwd="D@o09712130";
        try{
            // get connection to the database
        	try {
				connection = DriverManager.getConnection(myUrl,user,pwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	// Execute a query
            System.out.println("Database connection sucessful!\n");
            String query = "{ call getAll_employee }";
            CallableStatement stmt=connection.prepareCall(query); 
            
          //Use execute method to run stored procedure.
            ResultSet myRs = stmt.executeQuery();
            while (myRs.next()){
            	System.out.println(myRs.getString("name")+" "+myRs.getInt("age"));      
            	}
            System.out.println("success"); 
            
		   
            connection.close();
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}

		finally {
		    	try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		
		
		 
		
		 
		  
		 
	}

}
