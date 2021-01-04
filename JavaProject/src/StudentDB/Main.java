package StudentDB;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	
	//DataBase
	
	static ArrayList<Student> studentDBArrayList;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ask how many number of new students
		System.out.print("How many Student will be added to the database: ");
		Scanner in = new Scanner(System.in);
		int num_StudScanner= in.nextInt();
					
		studentDBArrayList = new ArrayList<>(num_StudScanner);
				
		// create a number of new student
		for(int i=0;i<num_StudScanner;i++) {
			
			Student st1 = new Student();
			studentDBArrayList.add(st1);
			st1.enroll();
	 		st1.payTuition();
			
		}
		
		
		for(int i=0;i<studentDBArrayList.size();i++) {
			System.out.println(studentDBArrayList.get(i));
			
		}
		
		

	}

}
