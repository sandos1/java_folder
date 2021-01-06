package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BatchUpdate_JDBC {

	public static void main(String[] args) {
		// A JDBC batch update is a batch of updates grouped together, and sent to the database in one batch, rather than sending the updates one by one.

		//Sending a batch of updates to the database in one go, is faster than sending them one by one, waiting for each one to finish.
		//There is less network traffic involved in sending one batch of updates 
		//You can batch both SQL inserts, updates and deletes. It does not make sense to batch select statements.
		
		//you can only perform one (update,insert,delete) of them not all at the same time 

		//There are two ways to execute a JDBC batch update: Using a Statement and Using a PreparedStatement
		
		Connection connection=null;
		PreparedStatement preparedStatement = null;
       
        ResultSet myRs = null;
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
            System.out.println("Database connection sucessful!\n");
            
		    String updateData = "update emp set name=? , age=? where id=?";

		
		    preparedStatement = connection.prepareStatement(updateData);

		    preparedStatement.setString(1, "Gary");
		    preparedStatement.setInt(2, 22);
		    preparedStatement.setInt  (3, 2);

		    preparedStatement.addBatch();
		    
		    preparedStatement.setString(1, "Stan");
		    preparedStatement.setInt(2, 30);
		    preparedStatement.setInt  (3, 1);
		    
		    preparedStatement.addBatch();
		    
		   /* String insertData = "insert into emp (id,name,age) values(?,?,?)";
		   
		    preparedStatement.setInt(1, 5);
		    preparedStatement.setString(2, "Mohamed");
		    preparedStatement.setInt(3, 33);
		    preparedStatement.addBatch();
		    
		    String deletetData = "delete from emp where id=?";
		    preparedStatement.executeUpdate(deletetData);
		    preparedStatement.setInt(1, 6);
		    preparedStatement.addBatch();*/

		    int[] affectedRecords = preparedStatement.executeBatch();
		    
		    System.out.println("number of row affected are: "+affectedRecords.length);
		    myRs= preparedStatement.executeQuery("select* from emp");
            while (myRs.next()){
            	System.out.println(myRs.getString("name")+" "+myRs.getInt("age"));      
            	}
            
            connection.close();
            preparedStatement.close();
            myRs.close();
        }catch (Exception e) {
			// TODO: handle exception
        	e.printStackTrace();
		}

		finally {
		    if(preparedStatement != null) {
		    	try {
					preparedStatement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		    }
		}

	}

}
