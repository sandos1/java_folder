package Exception_Handling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class tryWithResources {

	public static void main(String[] args) {
		//syntax
		/*
		try (FileReader < objname > =new FileReader("file path")) {
			  // use thefile
			} catch() {
			  // body of catch 
			}
			}
		*/
		
		
		//Java try-without-resources
		/*FileReader fr = null;
	    try {
	      File file = new File("/Users/sandonasoro/Desktop/java_folder/fileText.txt");
	      fr = new FileReader(file);
	      char[] a = new char[50];
	      fr.read(a); // Feed the characters to the array
	      for (char c: a)
	      System.out.print(c); //prints all the characters one by one. 
	    } catch(IOException e) {
	      e.printStackTrace();
	    } finally {
	      try {
	        fr.close();
	      } catch(IOException ex) {
	        ex.printStackTrace();
	      }
	    }*/
		
		//Java try-with-resources
		//if we pass the wrong path file name it throw an exception
		try (FileReader fr = new FileReader("/Users/sandonasoro/Desktop/java_folder/fileText.txt")) {
		      char[] a = new char[50];
		      fr.read(a); // Feed the characters to the array
		      for (char c: a)
		      System.out.print(c); //prints all the characters one by one. 
		    } catch(IOException e) {
		      e.printStackTrace();
		    }
	}

}
