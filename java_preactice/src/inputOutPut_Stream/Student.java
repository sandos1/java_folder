package inputOutPut_Stream;

import java.io.Serializable;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;


public class Student implements Serializable{
	/**
	 * the serialVersionUID is a unique identifier for Serializable classes
	 * This is used during the deserialization of an object, to ensure that a loaded class is 
	 * compatible with the serialized object. If no matching class is found, an InvalidClassException is thrown.
	 */
	private static final long serialVersionUID = 1L;
	private  int studId;
	private String lastname;
	private String firstname;
	
	//Static data members and transient data members are not saved via Serialization process.
	private transient int year;
	
	public static String getGender() {
		return gender;
	}

	public static void setGender(String gender) {
		Student.gender = gender;
	}

	private static  String gender;
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Student() {
		
	}
	
	public Student(int id,String lastname,String firstname) {
		this.studId=id;
		this.lastname=lastname;
		this.firstname=firstname;
		
	}
	
	

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", lastname=" + lastname + ", firstname=" + firstname + ", year=" + year
				+ "]";
	}

	

	

	


	
	
	

}
