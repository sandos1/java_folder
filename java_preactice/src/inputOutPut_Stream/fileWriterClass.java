package inputOutPut_Stream;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriterClass {

	public static void main(String[] args) {
		// FileWriter is a class of java.io.FileWriter package use to write to a specify file using
		// write() method and Note that when you are done writing to the file, you should close 
		//it with the close() method:
		
		
		//file separator // unix / , windows \
		String fileseparator= System.getProperty("file.separator");
		
		//absolute file name with path, root directory: full name directory
		
		String absoluteFilePath = fileseparator+"Users"+fileseparator+"sandonasoro"+fileseparator+"Desktop"+fileseparator+"java_folder"+fileseparator+"Java_resources"+fileseparator+"firsttxtfile.txt";
		
		try {
		      FileWriter myWriter = new FileWriter(absoluteFilePath);
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
