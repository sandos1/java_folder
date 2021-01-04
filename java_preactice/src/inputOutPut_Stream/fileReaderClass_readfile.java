package inputOutPut_Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class fileReaderClass_readfile {

	public static void main(String[] args) {
		// This method returns the next byte of data, or -1 if the end of the stream is reached.
		/*
		 * The Java FileReader class, java.io.FileReader makes it possible to read the contents 
		 * of a file as a stream of characters. It works much like the FileInputStream except the 
		 * FileInputStream reads bytes, whereas the FileReader reads characters. The FileReader is intended to 
		 * read text, in other words. One character may correspond to one or more bytes depending on 
		 * the character encoding scheme.The Java FileReader is a subclass of the Java Reader class,
		 *  so it has many of the same methods.
		 * 
		 * 
		 */
		
		//file separator // unix / , windows \
		String fileseparator= System.getProperty("file.separator");
				
		//absolute file name with path, root directory: full name directory
				
		String absoluteFilePath = fileseparator+"Users"+fileseparator+"sandonasoro"+fileseparator+"Desktop"+fileseparator+"java_folder"+fileseparator+"Java_resources"+fileseparator+"firsttxtfile.txt";
				
		try(FileReader fileReader = new FileReader(absoluteFilePath)){
			//read first byte of data 
			int data =fileReader.read();
			while(data!=-1) {
				System.out.print((char)data); 
				//update date with the next byte of date
				data = fileReader.read();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
