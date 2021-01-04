package Exception_Handling;


public class Main {
	
		public static void main(String[] args) throws Exception {
			
		 int i=10;
		 
		 try {
		      System.out.println(i / 0);
		      System.out.println("This statement will never get executed because the control has shifted to the catch block. ");
		    }
		    catch(Exception e) {
		      System.out.println("You are trying to divide by zero! That is not right!");
		      //e.printStackTrace();
		      e.getMessage();
		    }
		    finally {
		      System.out.println("This code is in the finally block. It does not depend on whether an exception occurs or not. ");
		    }
		  }

		
}

