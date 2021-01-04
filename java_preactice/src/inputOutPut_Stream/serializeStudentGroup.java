package inputOutPut_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class serializeStudentGroup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ArrayList<Student> studentList = new ArrayList<>();
	studentList.add(new Student(1,"Soro","Sandona"));
	studentList.add(new Student(2,"Silue","kolo"));
	studentList.add(new Student(3,"sekongo","amara"));
	studentList.add(new Student(5,"kone","methan"));
	studentList.add(new Student(4,"Dao","Fatim"));
	
	
	String filenamePathString = "/Users/sandonasoro/Desktop/java_folder/Java_resources/serializedfile.txt";
	
	
	//serialization of object
	FileOutputStream fileOutputStream=null;
	
	try {
		fileOutputStream = new FileOutputStream(filenamePathString);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		for(Student stu: studentList) {
			
			objectOutputStream.writeObject(stu);
		}
		fileOutputStream.close();
		objectOutputStream.close();
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	
	
	//deserialization of the stream byte object
	
	FileInputStream fileInputStream=null;
	
	try {
		fileInputStream = new FileInputStream(filenamePathString);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		
		// Method for deserialization of object 
        ArrayList<Student> students= new ArrayList<>();
        students.add((Student)objectInputStream.readObject());
        
        for(Student stu: studentList) {
        	System.out.println(stu);
        }
		
		fileOutputStream.close();
		objectInputStream.close();
	}catch(Exception e){
		e.printStackTrace();
	}
		
	}

}
