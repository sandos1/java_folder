package school.management.system;

/**
 * 
 * @author Sandona Soro
 * this class is responsible for keeping track of 
 * student fees,name, grade and fees paid
 *
 */

public class Student {
	
	private int id;
	private String name;
	private int grade;
	private int feespaid;
	private int feesTotal; 
	
	/**
	 * to create a new student by initializing.
	 * initialize the fields inside the constructor.
	 * Fees for every student is $30000
	 * fees paid initially is 0
	 * @param id for the student unique
	 * @param name of the student
	 * @param grade of the student
	 */
	public Student(int id,String name,int grade) {
		feespaid=0;
		feesTotal=30000;
		this.id=id;
		this.name=name;
		this.grade=grade;
	}
	
	//not going to alter student's name and id
	
	/**
	 * used to upgrade the student's grade
	 *
	 * @param grade new grade of the student.
	 */
	public void setGrade(int grade) {
		this.grade=grade;
		
	}
	
	/**
	 * keep adding the fees to feesPaid field
	 * add the fees to the fees paid
	 * the school is going receive the funds
	 * @param fees
	 */
	public void payfees(int fees) {
		
		feespaid +=fees;
		School.updateTotalMoneyEarned(feespaid);
	}

	/**
	 * 
	 * @return id of the student
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * 
	 * @return name of the student
	 */

	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return grade of the student
	 */
	public int getGrade() {
		return grade;
	}

	/**
	 * 
	 * @return feesPaid of the student
	 */
	public int getFeespaid() {
		return feespaid;
	}

	/**
	 * 
	 * @return total fees paid
	 */
	public int getFeesTotal() {
		return feesTotal;
	}
	
	/**
	 * 
	 * @return the remaining fees
	 */
	
	public int getRemainingFees() {
		
		return this.feesTotal -feespaid;
	}
	
	
	

}
