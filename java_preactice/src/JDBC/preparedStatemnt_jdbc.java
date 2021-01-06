package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class preparedStatemnt_jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection connection=null;
		PreparedStatement preparedStatement = null;
       
        ResultSet myRs = null;
        String myUrl="jdbc:mysql://localhost:3306/student";
        String user = "root";
        String pwd="root";
        try{
            // get connection to the database
        	try {
				connection = DriverManager.getConnection(myUrl,user,pwd);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            System.out.println("Database connection sucessful!\n");
            
		    String sql = "update emp set name=? , age=? where id=?";

		
		    preparedStatement = connection.prepareStatement(sql);

		    preparedStatement.setString(1, "Gary");
		    preparedStatement.setInt(2, 22);
		    preparedStatement.setInt  (3, 2);


		    preparedStatement.setString(1, "Stan");
		    preparedStatement.setInt(2, 30);
		    preparedStatement.setInt  (3, 1);

		    preparedStatement.executeUpdate();
		    
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
