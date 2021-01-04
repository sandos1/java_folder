package Interface;

public class Msum implements School {
	
	@Override
	public void schoolName(String name) {
		
	System.out.println("the school name is: "+name);
		
	}
	@Override
	public void schoolLocation(String location) {
		System.out.println("the location is:"+location);
	}
	
	@Override
	public void schoolFondationDate(int year,int month, int day) {
		
		System.out.printf("year is: %d \nMonth: %d \nyear: %d",year,month,day);
	}

}
