package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Teacher lizzyTeacher = new Teacher(1, "Lizzy", 500);
		Teacher mellisaTeacher = new Teacher(2, "Mellisa", 700);
		Teacher sandonaTeacher = new Teacher(3, "Sandona", 1000);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzyTeacher);
		teacherList.add(mellisaTeacher);
		teacherList.add(sandonaTeacher);
		
		Student annaStudent = new Student(1, "Jimmit", 4);
		Student amaraStudent = new Student(2, "Amara", 7);
		Student koneStudent = new Student(3, "Kone", 12);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(annaStudent);
		studentList.add(amaraStudent);
		studentList.add(koneStudent);
	
		
		School iugbSchool = new School(teacherList, studentList);
		
		
		// student pay fees
		annaStudent.payfees(3000);
		amaraStudent.payfees(4000);
		
		//school pays teacher respective salary
		lizzyTeacher.receiveSalary(lizzyTeacher.getSalary());
		
		System.out.println("lizzy earn $"+lizzyTeacher.getsalaryeaened());
		System.out.println("iugb has earned $"+ iugbSchool.getTotalMoneyEarned());
		
		
	}

}
