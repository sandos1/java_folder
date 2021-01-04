package school.management.system;

import java.util.List;

/**
 * the school can have many teacher and many students.
 * implement teacher and student using an ArrayList
 * @author sandona soro
 *
 */
public class School {
	
	private List<Teacher> teacher;
	private List<Student> student;
	private static int totalMoneyEarned;
	private static int totalMoneySpend;
	
	/**
	 * new school object is created
	 * @param teacher list of teacher in the school
	 * @param studentlist of student in the school
	 */
	public School(List<Teacher> teacher, List<Student> student) {
		this.teacher = teacher;
		this.student = student;
		
		totalMoneyEarned=0;
		totalMoneySpend=0;
	}

	/**
	 * 
	 * @return the list of teacher in the school.
	 */
	public List<Teacher> getTeacher() {
		return teacher;
	}
	
	/**
	 * Add a teacher to the school
	 * @param teacher to be added
	 */

	public void addTeacher(Teacher teacher) {
		this.teacher.add(teacher);
	}

	/**
	 * 
	 * @return the list of students in the school
	 */
	public List<Student> getStudent() {
		return student;
	}

	/**
	 * add a student to the school
	 * @param student to be added
	 */
	public void addStudent(Student student) {
		this.student.add(student);
	}

	/**
	 * 
	 * @return the total money earned by school
	 */
	public  int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * adds the total money earned by the school
	 * @param totalMoneyEarned
	 */
	public  static void updateTotalMoneyEarned(int MoneyEarned) {
		
		totalMoneyEarned += MoneyEarned;
	}

	/**
	 * 
	 * @return total money spend by the school
	 */
	public int getTotalMoneySpend() {
		return totalMoneySpend;
	}

	/**
	 * update the money that is spend by the school
	 * which is the salary given by the school to his teacher.
	 * @param totalMoneySpend
	 */
	public static  void updatetotalMoneySpend(int MoneySpend) {
		
		totalMoneyEarned -=MoneySpend;
		totalMoneySpend +=MoneySpend;
	}
	
	
	

}
