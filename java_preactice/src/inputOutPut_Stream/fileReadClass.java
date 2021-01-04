package inputOutPut_Stream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class fileReadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read folder directory files
		 File [] listFiles = new File("/Users/sandonasoro/Desktop/java_folder/Java_resources").listFiles();
	      
	      
	      for (File file1 : listFiles) {
	    	  if(file1.isFile()) {
	    		    System.out.println(file1.getName());
	    		    }
	      }
	      
	      System.out.println("\n\n");
	    //file separator // unix / , windows \
		String fileseparator= System.getProperty("file.separator");
		
		//absolute file name with path, root directory: full name directory
		
		String absoluteFilePath = fileseparator+"Users"+fileseparator+"sandonasoro"+fileseparator+"Desktop"+fileseparator+"java_folder"
		+fileseparator+"Java_resources"+fileseparator+"firsttxtfile.txt";
		
	      try {
		      FileReader reader = new FileReader(absoluteFilePath);
		      int character;
		      while((character=reader.read())!=-1){
		    	  System.out.print((char)character);
		      }
		      reader.close();
		      System.out.println("Successfully read from the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
