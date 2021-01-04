package Interface;

import java.time.LocalDate;
import java.util.Date;

public interface School {
	int classSize=25;
	
	void schoolName(String name);
	void schoolLocation(String location);
	
	default void schoolFondationDate(int year,int month, int day) {
		
		LocalDate localDate = LocalDate.of( year , month , day );
		System.out.println(localDate);
	}

}
