package school.management.system;

/**
 * 
 * @author Sandona Soro
 * this class responsible for tracking Teacher name,id and salary.
 *
 */
public class Teacher {
	
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	
	/**
	 * create a new Teacher object
	 * @param id
	 * @param name
	 * @param salary
	 */
	public Teacher(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		salaryEarned=0;
		
	}
	
	/**
	 * 
	 * @return id
	 */
	
	public int getId() {
		return this.id;
	}
	
	/**
	 * 
	 * @return name of the teacher
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * 
	 * @return salary of the teacher
	 */
	public int getSalary() {
		return this.salary;
	}
	
	/**
	 * set the salary if teacher get promoted  
	 * @param salary
	 */
	public void setsalary(int salary) {
		this.salary=salary;
	}
	
	/**
	 * 
	 * @return salary earned by the teacher
	 */
	
	public int getsalaryeaened() {
		return salaryEarned;
	}
	/**
	 * add to salary
	 * remove the total earned to school
	 * @param salary
	 */
	public void receiveSalary(int salary) {
	
		salaryEarned +=salary;
		School.updatetotalMoneySpend(salary);
		
		
	}
}
