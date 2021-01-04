package Exception_Handling;

public class MutipleCatch_block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      int arr[] = {1,3,5,6,7,2,45};
		       
		      System.out.println(arr[131]);
		      System.out.println(25 / 0);
		      System.out.println("This statement will never get executed because the control has shifted to the catch block. ");
		    }
		    catch(ArithmeticException e) {
		      System.out.println("You are trying to divide by zero! That is not right!");
		    }
		    catch(ArrayIndexOutOfBoundsException e) {
		      System.out.println("You are trying to access an index not in the array!");
		    }
		    finally {
		      System.out.println("This code is in the finally block. It does not depend on whether an exception occurs or not. ");
		    }
	}

}
