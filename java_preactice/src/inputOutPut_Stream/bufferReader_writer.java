package inputOutPut_Stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class bufferReader_writer {

	public static void main(String[] args) {
		//buffer is an intermediary between InputStream and outputStream
		// BufferedReader is a Java class to reads the text from an Input stream (like a file) by buffering 
		//characters that seamlessly reads characters, arrays or lines. 
		
		//The BufferedReader class of Java is used to read the stream of characters from the specified source (character-input stream).
		//The constructor of this class accepts an InputStream object as a parameter.

		//This class provides a method named read() and readLine() which reads and returns the character and next line from the source (respectively) and returns them.

		//Instantiate an InputStreamReader class bypassing your InputStream object as a parameter.

		//Then, create a BufferedReader, bypassing the above obtained InputStreamReader object as a parameter.

		//Now, read data from the current reader as String using the readLine() or read() method.
		
		String fileseparator= System.getProperty("file.separator");
		
		String appendTextString= "The serialVersionUID variable is used by Java's object serialization API to determine if"
				+ " a deserialized object was serialized (written) with the same version of the class, as it is now attempting to deserialize it into.\n"
				+ "\n"
				+ "Imagine that a Person object is serialized to disk. Then a change is made to the Person class. Then you try to deserialize the"
				+ " stored Person object. Now the serialized Person object may not correspond to the new version of the Person class.";
		
		//absolute file name with path, root directory: full name directory
		String absoluteFilePath = fileseparator+"Users"+fileseparator+"sandonasoro"+fileseparator+"Desktop"+fileseparator+
				"java_folder"+fileseparator+"Java_resources"+fileseparator+"firsttxtfile.txt";
		
		//get the current directory of the project
		String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" +currentDir);
        
		//relative path ,File object tries to locate files from the current directory of the project.
        String relativePath = currentDir+"relativefile.txt";
        
        
        FileReader in =null;
        FileWriter out=null;
		BufferedReader reader =null;
		BufferedWriter writer=null;
		try {
			in = new FileReader(absoluteFilePath);
			
			reader = new BufferedReader(in);
			
			//to append a text to an existing file, Pass True as second parameter of FileWriter(filename,true) class constructor
			out = new FileWriter(relativePath,true);
			writer = new BufferedWriter(out);
			
			//readcurrentline reads the current line and the Java readLine function reader.readLine() 
			//returns a string. Hence, the loop will iterate until it’s not null.
			String readcurrentline;
			while((readcurrentline=reader.readLine())!=null) {
				writer.write(readcurrentline);
				System.out.println(readcurrentline);
			}
			writer.write(appendTextString);
			// flush() method : flushing the stream 
			writer.flush(); 
            // close() method : closing BufferWriter to end operation 
			writer.close(); 
		} catch (Exception e) {
			System.out.println("File not exist");
		}finally {
			if(in!=null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(out!=null) {
				try {
					out.close();
					//writer.flush();
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		

	}

}
