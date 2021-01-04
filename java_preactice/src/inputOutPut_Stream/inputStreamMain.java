package inputOutPut_Stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class inputStreamMain {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		String fileseparator= System.getProperty("file.separator");
		
		//absolute file name with path, root directory: full name directory
		String absoluteFilePath = fileseparator+"Users"+fileseparator+"sandonasoro"+fileseparator+"Desktop"+fileseparator+
				"java_folder"+fileseparator+"Java_resources"+fileseparator+"firsttxtfile.txt";
		
		//get the current directory of the project
		String currentDir = System.getProperty("user.dir");
        System.out.println("Current dir using System:" +currentDir);
        
		//relative path ,File object tries to locate files from the current directory of the project.
        String relativePath = currentDir+"relativefile.txt";

		InputStream in =null;
		OutputStream out=null;
		
		try {
			in = new FileInputStream(absoluteFilePath);
			out = new FileOutputStream(relativePath);
			int a;
			while((a=in.read())!=-1) {
				out.write(a);
			}
		} catch (Exception e) {
			System.out.println("File not exist");
		}finally {
			if(in!=null) {
				in.close();
			}
			if(out!=null) {
				in.close();
			}
		}
	}

}
