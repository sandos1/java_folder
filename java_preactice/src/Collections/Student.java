package Collections;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;


public class Student implements Comparable<Student>{
	private int studId;
	private String lastname;
	private String firstname;
	private java.util.Date dobDate;
	
	String pattern = "yyyy-MM-dd";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
	
	public Student() {
		
	}
	
	public Student(int id,String lastname,String firstname,String dob) {
		this.studId=id;
		this.lastname=lastname;
		this.firstname=firstname;
		try {
			this.dobDate= simpleDateFormat.parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
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

	public java.util.Date getDobDate() {
		return dobDate;
	}

	public void setDobDate(Date dobDate) {
		this.dobDate = dobDate;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", lastname=" + lastname + ", firstname=" + firstname + ", dobDate="
				+ dobDate + "]";
	}



	@Override
	public int compareTo(Student other_student) {
		
				//return (this.studId-other_student.studId);
		return (this.lastname.compareTo(other_student.lastname));
	}

	public static Comparator<Student> sortbyfirstnameComparator =new Comparator<Student>() {

		@Override
		public int compare(Student stud1, Student stud2) {
			// TODO Auto-generated method stub
			return stud1.compareTo(stud2);
		}
	};
	
	
	

}
