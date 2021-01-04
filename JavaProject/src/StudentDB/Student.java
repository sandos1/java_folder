package StudentDB;
import java.util.Scanner;

public class Student {

	private String firstname;
	private String lastname;
	private int gradeYear;
	private  String studentID;
	private  String courses=" ";
	private int tuitionBalance=0;
	private static int costOfCourse=600;
	private  static int id=100;
	
	public Student() {
		System.out.print("Enter your firstName: ");
		Scanner fn = new Scanner(System.in);
		String Stud_fn= fn.nextLine();
		
		System.out.print("Enter your lastName: ");
		Scanner ln = new Scanner(System.in);
		String Stud_ln= ln.nextLine();
		
		System.out.print("Enter Academic Year: \n\t1 . Freshman\n\t2 . Sophmore\n\t3 . Junior"
				+ "\n\t4 . Senior\n" );
		
		System.out.print("Enter your Choice: ");
		Scanner year = new Scanner(System.in);
		
		this.firstname=Stud_fn;
		this.lastname=Stud_ln;
		this.gradeYear= year.nextInt();
		
		generateID();

	}
	
	//generate ID
		private void generateID() {
			Student.id++;
			this.studentID = gradeYear+ ""+Student.id;
		}

	

	
	
	//Enroll in courses
	 public void enroll() {
		 
		 do {
		 System.out.println("Enter Course to enroll (Q to quit)");
		 Scanner inScanner = new Scanner(System.in);
		 
		 String  course= inScanner.nextLine();
		 if(!course.equals("Q")) {
			 courses += "\n"+course;
			 tuitionBalance = tuitionBalance + costOfCourse;
		 } 
		 else {
			 break;
		 }
		 
		 }while(1 !=0);
		 
	 }
		 
	 
	
	//view Balance
	public void viewBalance() {
		
		System.out.println("Tuition Balance: "+ tuitionBalance+"\n");
	}
	//pay tuition
	
	public void payTuition() {
		viewBalance();
		System.out.print("How much you want to pay: $");
		Scanner in = new Scanner(System.in);
		int payment =in.nextInt();
		
		this.tuitionBalance -= payment;
		
		System.out.println("thank you for your payment of $"+payment+"\n");
		
	}
	
	//Show Status

	@Override
	public String toString() {
		return "Name: " + firstname +" "+ lastname + 
				"\nGrade Level: "+gradeYear+
				"\nStudent ID: "+ studentID+
				"\nCourse Enroll In: " + courses
				+ "\nBalance: " + tuitionBalance ;
	}
	
	
	
	
	
	
	
}
