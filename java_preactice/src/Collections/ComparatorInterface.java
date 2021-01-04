package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class ComparatorInterface {

	public static void main(String[] args) {
		//Java Comparator interface is used to order the objects of a user-defined class.
		//This interface is found in java.util package and contains 2 methods compare(Object obj1,Object obj2) 
		//and equals(Object element).
		//A comparable interface is used for sorting object according to the natural ordering.
		//Comparator interface is used to sort individual attributes of various objects which mean we can sort the same object
		//on different attribute like studId, lastname,firstname and date in different classes while comparable can only 
		//implement the compareTo method just on the current object.
		//public void sort(List list, Comparator c): is used to sort the elements of List by the given Comparator.
		//java.util.Collections.sort() method is present in java.util.Collections class. It is used to sort the elements
		//present in the specified list of Collection in ascending order.
		//Collection.sort(collectionObject,comparator class Object) see line 42 and 45 we actually create a separate class
		//to implement the Comparator interface and override its method Compare(obj1,obj2).
		
		System.out.println("sorting object using Comparable Interface");
		List<Student> stud_CollectionObjectList = new ArrayList<>();
		
		stud_CollectionObjectList.add(new Student(3, "Soro", "Sandona", "2018-09-09"));
		stud_CollectionObjectList.add(new Student(1, "Silue", "Amara", "1995-09-09"));
		stud_CollectionObjectList.add(new Student(10, "Kone", "Ismael", "2002-09-09"));
		stud_CollectionObjectList.add(new Student(9, "Dao", "Fatim", "1997-09-09"));
		
		Collections.sort(stud_CollectionObjectList);
		
		stud_CollectionObjectList.forEach(s -> System.out.println(s)); 
		
		System.out.println("\n\n");
		
		System.out.println("sorting object using Comparator Interface");
		List<Student> stud_CollectionObjectList2 = new ArrayList<>();
		
		stud_CollectionObjectList2.add(new Student(3, "Soro", "Sandona", "2018-09-09"));
		stud_CollectionObjectList2.add(new Student(1, "Silue", "Amara", "1995-09-09"));
		stud_CollectionObjectList2.add(new Student(10, "Kone", "Ismael", "2002-09-09"));
		stud_CollectionObjectList2.add(new Student(9, "Dao", "Fatim", "1997-09-09"));
		
		Sortbyid sortidSortbyid=new Sortbyid();
		Collections.sort(stud_CollectionObjectList2, sortidSortbyid);
		
		stud_CollectionObjectList2.forEach(s -> System.out.println(s)); 
		
		System.out.println("\n\n");
		
		System.out.println("sorting object using Comparator Interface");
		List<Student> stud_CollectionObjectList3 = new LinkedList<>();
		
		stud_CollectionObjectList3.add(new Student(3, "Soro", "Sandona", "2018-09-09"));
		stud_CollectionObjectList3.add(new Student(1, "Silue", "Amara", "1995-09-09"));
		stud_CollectionObjectList3.add(new Student(10, "Kone", "Ismael", "2002-09-09"));
		stud_CollectionObjectList3.add(new Student(9, "Dao", "Fatim", "1997-09-09"));
		
		SortbyYearOfBirth sortyear=new SortbyYearOfBirth();
		Collections.sort(stud_CollectionObjectList3, sortyear);
		
		stud_CollectionObjectList3.forEach(s -> System.out.println(s)); 
		
		System.out.println("\nsorting object using Comparator Interface\n");
		List<Student> stud_CollectionObjectList4 = new LinkedList<>();
		
		stud_CollectionObjectList4.add(new Student(3, "Soro", "Sandona", "2018-09-09"));
		stud_CollectionObjectList4.add(new Student(1, "Silue", "Amara", "1995-09-09"));
		stud_CollectionObjectList4.add(new Student(10, "Kone", "Ismael", "2002-09-09"));
		stud_CollectionObjectList4.add(new Student(9, "Dao", "Fatim", "1997-09-09"));
		
		//static comparator object
		Collections.sort(stud_CollectionObjectList4, Student.sortbyfirstnameComparator);
		
		stud_CollectionObjectList3.forEach(s -> System.out.println(s)); 
	}

}
