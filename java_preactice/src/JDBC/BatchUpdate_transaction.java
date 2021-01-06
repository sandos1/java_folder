package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BatchUpdate_transaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
        	//Switch JDBC coneection out of Auto commit
        	connection.setAutoCommit(false);
            System.out.println("Database connection sucessful!\n");
            
		    String updateData = "update emp set name=? , age=? where id=?";

		
		    preparedStatement = connection.prepareStatement(updateData);

		    preparedStatement.setString(1, "Gary");
		    preparedStatement.setInt(2, 22);
		    preparedStatement.setInt  (3, 2);

		    preparedStatement.addBatch();
		    
		    preparedStatement.setString(1, "kole");
		    preparedStatement.setInt(2, 30);
		    preparedStatement.setString(2, "20");
		    
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
            connection.commit();
           
            connection.close();
            preparedStatement.close();
            myRs.close();
        }catch (Exception e) {
			// TODO: handle exception
        	 try {
        		 System.out.println("wrong input----");
				connection.rollback();
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
		}}
	}

}
