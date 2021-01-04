package StringBuffer_StringBuilder;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder str1 = new StringBuilder("hello soro ");
		str1.append("soro sandona is back on track");
		str1.insert(6, "methan ");
		str1.delete(18, 23);
		str1.replace(0, 5, "salut");
		System.out.println(str1.length());
		System.out.println(str1.capacity());
		System.out.println(str1.toString());
		
		
		

	}

}
