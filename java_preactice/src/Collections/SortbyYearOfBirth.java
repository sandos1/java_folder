package Collections;

import java.util.Comparator;

public class SortbyYearOfBirth implements Comparator<Student>{
	@Override
	public int compare(Student student1, Student student2) {
		@SuppressWarnings("deprecation")
		int year = student1.getDobDate().getYear()-student2.getDobDate().getYear();
		if(year>0) {
			return 1;
		}else if(year<0) {
			return -1;
		}
		return 0;
	}
}
