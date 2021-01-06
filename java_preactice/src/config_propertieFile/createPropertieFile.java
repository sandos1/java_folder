package config_propertieFile;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;

public class createPropertieFile {

	public static void main(String[] args) {
		// Propertie file used to store configurable parameter.
		//The Java Properties class, java.util.Properties, is like a Java Map of Java String key and value pairs.
		//The Java Properties class can write the key, value pairs to a properties file on disk, and read the properties back in again.
		//This is an often used mechanism for storing simple configuration properties for Java applications.
		
		//propertie file has .properties extension example: config.propertie
		
		//Create a Properties Instance
		//create an intance of Propertie object in java
		System.out.println("\ncreating a propertie object\n");
		Properties properties = new Properties();
		
		//set properties using setProperty(key, value) method
		properties.setProperty("key1", "value1");
		properties.setProperty("key2", "value2");
		properties.setProperty("key3", "value3");
		
		//You can iterate the keys of a Java Properties instance by obtaining the key set for the Properties instance,
		//and iterating this key set. 
		Iterator keyIterator = properties.keySet().iterator();

		//You can remove a property from a Java Properties instance using its remove(key) method,
		properties.remove("key2");
		
		while(keyIterator.hasNext()){
		    String key   = (String) keyIterator.next();
		    //get properties from a Java Properties object you use the getProperty() method,
		    String value = properties.getProperty(key);
		    System.out.println(key + " = " + value );
		}
		
		
		System.out.println("\n\ncreating a propertie object and store properties to a file config.properties\n");
		//Store Properties to File
		//You can store the property key, value pairs to a properties file which can be read again later on.
		//You store the contents of a Properties object via its store() method.
		
		String fileseparator= System.getProperty("file.separator");

		
		//absolute file name with path, root directory: full name directory
		String absoluteFilePath = fileseparator+"Users"+fileseparator+"sandonasoro"+fileseparator+"Desktop"+fileseparator+
				"java_folder"+fileseparator+"java_preactice"+fileseparator+"src"+fileseparator+"config_propertieFile"+fileseparator+"config.properties";
		//file object
		File myObj=null;
		try {
			myObj = new File(absoluteFilePath);
			// Create new file 
            // if it does not exist 
			//The createNewFile() method is a part of File class in Java . This function creates new empty file.
			//The function returns true if the abstract file path does not exist and a new file is created. 
			//It returns false if the filename already exists.
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		//A Java Properties property file consists of lines with one key=value pair on each line. 
		Properties propertiesStore = new Properties();

		propertiesStore.setProperty("property1", "value1");
		propertiesStore.setProperty("property2", "value2");
		propertiesStore.setProperty("property3", "value3");
		
		try( FileWriter output = new FileWriter(absoluteFilePath)){
			propertiesStore.store(output, "These are properties");
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		
		
		System.out.println("\n\nLoading propertie from file to java propertie object\n");
		//Load Properties From File
		//You can also load properties stored in a property file back into a Java Properties object via its load() method.
		
		Properties propertiesLoad = new Properties();

		try(FileReader fileReader = new FileReader(absoluteFilePath)){
			propertiesLoad.load(fileReader);
		} catch (IOException e) {
		    e.printStackTrace();
		}
		@SuppressWarnings("rawtypes")
		Iterator keyIteratorLoad = propertiesLoad.keySet().iterator();

		while(keyIteratorLoad.hasNext()){
		    String key   = (String) keyIteratorLoad.next();
		    //get properties from a Java Properties object you use the getProperty() method,
		    String value = propertiesLoad.getProperty(key);
		    System.out.println(key + " = " + value );
		}
		
		
		//Load Properties From the Classpath
	}

}
