package inputOutPut_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class serializationObject {

	public static void main(String[] args) {
		
		// serialization is the process of converting a state of an object into a byte stream and
		//deserialization is the process of converting back byte stream of an object into it original state(object)
		//To make a Java object serializable we implement the java.io.Serializable interface. which has not a method or abstract method to 
		//be implement by the class which implement it. so we said, Serializable is a marker interface (has no data member and method)
		//which simply predefine our object as serializable.
		// Only non-static data members are saved via Serialization process.
		//Static data members and transient data members are not saved via Serialization process.
		//So, if you don’t want to save value of a non-static data member then make it transient.
		
		//The ObjectOutputStream class contains writeObject() method for serializing an Object.
		//The ObjectInputStream class contains readObject() method for deserializing an object.
		
		//first create a file object of FileOutputStream or FileinputStream then pass the file object as parameter
		//to ObjectOutputStream or ObjectInputStream. finally use writeObject() or readObject() method to write the object or read the 			object
		
		//the serialVersionUID is a unique identifier for serializable classes. it is a versioning between version of serialible object load
		// versus the deserialization object retrieve. When de-serializing, the load version is checked to see how the serialized data     		//matches
		//the current code. if throw it will throw an exception.
		
		//if your object does not have a serialVersionUID, and any change make after serializing the of will throw an exception
		//because the version code save and the current code with change does not match. 
		//so by declaring serialVersionUID will retrieve the old version of seriable object.
		
		// Serialization : we writing the object state to a destinate resources(file).
		
		
		Student stud1 = new Student(1,"Soro","Sandona");
		stud1.setYear(2020);
		
		 //file separator // unix / , windows \
		String fileseparator= System.getProperty("file.separator");
		
		//absolute file name with path, root directory: full name directory
		
		String absoluteFilePath = fileseparator+"Users"+fileseparator+"sandonasoro"+fileseparator+"Desktop"+fileseparator+"java_folder"
		+fileseparator+"Java_resources"+fileseparator+"serializedfile.txt";
		//create file
    	
    	File newfile= new File(absoluteFilePath);
    	
    	try {
			if(newfile.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("File already exist");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       try
        {    
        	//
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(newfile); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(stud1); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
  
  
        Student stud2 = null; 
  
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(newfile); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            stud2 = (Student)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println(stud2); 
            
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
	}

}
