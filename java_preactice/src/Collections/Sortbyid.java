package Collections;

import java.util.Comparator;

public class Sortbyid implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		
		int studid = student1.getStudId()-student2.getStudId();
		if(studid>0) {
			return 1;
		}else if(studid<0) {
			return -1;
		}
		return 0;
	}

}
