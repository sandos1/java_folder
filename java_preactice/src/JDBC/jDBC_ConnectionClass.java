package JDBC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import config_propertieFile.PropertiesFile;


//Step to Connect JDBC API
//1- Register your Driver class
//2- open a connection
public class jDBC_ConnectionClass {

	 private static final String DB_DRIVER_CLASS="driver.class.name";
	 private static final String DB_USERNAME = "db.username";
	 private static final String DB_PASSWORD="db.password";
	 private static final String DB_URL ="db.myUrl";
	 
	 private static Connection connection=null;
	 
	 private static Properties properties = null;
	 //Static Block: used for initializing statics members,
	 //it belongs to the class and only one copy
	 //and runs only once and before everything
	 
	 //here we are initializing connection and properties
	 static {
		 try {
			properties = new Properties();
		   
			properties.load(new FileInputStream("/Users/sandonasoro/Desktop/java_folder/java_preactice/src/JDBC/db.properties"));
			// Before Java 6 it was necessary to load the JDBC driver before using it. After Java 6 this should no more be necessary though.
			//you can decide to add it or not.
			Class.forName(properties.getProperty(DB_DRIVER_CLASS));
			
			connection = DriverManager.getConnection(properties.getProperty(DB_URL),properties.getProperty(DB_USERNAME),properties.getProperty(DB_PASSWORD));
		} catch (ClassNotFoundException | SQLException   | IOException e) {
			e.printStackTrace();
		} 
	 }
	 
	 public static Connection getConnection() {
		 return connection;
	 }
	
		
		//3- Create a statement 
		//4- execute a statement
		//5- ResultSet
		
		
		

	

}
