package Exception_Handling;

public class Custom_Exceptions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      //code which can raise custom exception
		      throw new CustomExceptionClass("This is a custom Exception"); //You can inculde your own exception message
		    }
		    catch(Exception e) {
		      //TODO: handle exception
		      System.out.println(e);
		    }
	}

}
