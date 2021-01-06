package config_propertieFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;


public class PropertiesFile {

	public static void main(String[] args) {
		//add your file under your project source
		// create a propertie file under your Project src -> create new package-> right click on the new package-> new-> file-> give a name 
		//to your file with .properties extension.
		// now you can open your file add properties as key=value.
		

		

		//It is possible to load properties into a Java Properties from a file that is available on the classpath.
		//That file could thus be located inside the same JAR file as the application loading the properties, or inside another 
		//JAR file or directory available on the Java classpath when your Java application is executed.
		
		//To load properties from a file available on the classpath you need to obtain a Class instance first.
		//In the example below I obtain it from the class that contains the main() method of my application:


		////Load Properties From the Classpath
		Class aClass = PropertiesFile.class;
		
		//Create a object of class InputStream
		//or use InputStream fileinput = FileInputStream(path/properties file location); and load the file to the propertie object
		// propertieObject.load(fileinput)
		InputStream inputStream = aClass.getResourceAsStream("config.properties");
		
		//create object of class properties class
		Properties fromClasspath = new Properties();

		try {
		    fromClasspath.load(inputStream);
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		System.out.println("\n\nLoading propertie from file to java propertie object\n");
		//Load Properties From File
		//You can also load properties stored in a property file back into a Java Properties object via its load() method.
		
		
		@SuppressWarnings("rawtypes")
		Iterator keyIteratorLoad = fromClasspath.keySet().iterator();

		while(keyIteratorLoad.hasNext()){
		    String key   = (String) keyIteratorLoad.next();
		    //get properties from a Java Properties object you use the getProperty() method,
		    String value = fromClasspath.getProperty(key);
		    System.out.println(key + " = " + value );
		}
		
	}

}
