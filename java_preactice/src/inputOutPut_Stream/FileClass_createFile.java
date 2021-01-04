package inputOutPut_Stream;

import java.io.File;
import java.io.IOException;

public class FileClass_createFile {

	public static void main(String[] args) {
		//The File class from the java.io package, allows us to work with files.
		//To use the File class, create an object of the class, and specify the filename or directory name:
		
		//To create a file in a specific directory (requires permission), specify the path of the file and
		//use double backslashes to escape the "\" character (for Windows). On Mac and Linux you can just write 
		//the path, like: /Users/name/filename.txt

		//In Java, we can use the following three methods to get the platform-independent file path separator.

		//System.getProperty("file.separator")
		//FileSystems.getDefault().getSeparator() (Java NIO)
		//File.separator Java IO
		
		
		
		
		String fileseparator= System.getProperty("file.separator");
		
		//absolute file name with path, root directory: full name directory
		
		String absoluteFilePath = fileseparator+"Users"+fileseparator+"sandonasoro"+fileseparator+"Desktop"+fileseparator+
				"java_folder"+fileseparator+"Java_resources"+fileseparator+"firsttxtfile.txt";
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
		
		//get the current directory of the project
		String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" +currentDir);
        
        
		//relative path ,File object tries to locate files from the current directory of the project.
        String relativePath = currentDir+"relativefile.txt";
        try {
        	
        myObj = new File(relativePath);
        
        if(myObj.createNewFile()){
            System.out.println(relativePath+" File Created in Project root directory");
        }else System.out.println("File "+relativePath+" already exists in the project root directory");
        }catch (Exception e) {
        	 System.out.println("An error occurred.");
		      e.printStackTrace();
		}
    }

		
		
	

}
