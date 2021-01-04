package Exception_Handling;

public class NestedTryBlock {

	public static void main(String[] args) {
		try {
			      try {
			        System.out.println("Division by zero");
			        int b = 42 / 0;
			      }
			      catch(ArithmeticException e) {
			        System.out.println(e);
			      }
	
			      try {
			        System.out.println("Trying to access elements not in the array");
			        int a[] = new int[10];
			        a[21]++;
			      }
			      catch(ArrayIndexOutOfBoundsException e) {
			        System.out.println(e);
			      }
		    } catch(Exception e) {
		      System.out.println("Outer try block exception is. " + e);
		    }

	}

}
