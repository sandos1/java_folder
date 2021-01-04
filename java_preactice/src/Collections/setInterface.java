package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;


public class setInterface {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// set is an interface of collection framework. it collect only unique element and does not conserve order.
		//A Set is a Collection that cannot contain duplicate elements.
		//set is implemented by collection class such as HashSet, LinkedHashSet,TreeSet.
		//NavigableSet and SortedSet is another interface which extend set interface and the SortedSet interface is implement by TreeSet class
		//only TreeSet collection class keep order of element added. Objects are stored in sorted, ascending order.
		//But we can iterate in descending order using method TreeSet.descendingIterator().
		// elements are not accessible randomly. but we can iterate over the object 
		
		Set set1 = new HashSet<>(); 
		
		set1.add("soro");
		set1.add(2);
		set1.add(2);
		set1.add("sandona");
		set1.add(30);
		
		//System.out.println(EtchedBorder(indx)); not allow to randomly access element of set object
		 System.out.println("\nTraversing the set Using Hashse:");
		Iterator itr1= set1.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
		
		Set set2 = new LinkedHashSet<>(); 
		
		set2.add("soro");
		set2.add(2);
		set2.add(2);
		set2.add("sandona");
		set2.add(30);
		
		//System.out.println(EtchedBorder(indx)); not allow to randomly access element of set object
		
		 System.out.println("\nTraversing the set Using LinkedHashSet:");
		Iterator itr2= set2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		Set set3 = new LinkedHashSet<>(); 
		
		set3.add("soro");
		set3.add(2);
		set3.add(2);
		set3.add("sandona");
		set3.add(30);
		
		//System.out.println(EtchedBorder(indx)); not allow to randomly access element of set object
		
		 System.out.println("\nTraversing the set Using LinkedHashSet:");
		Iterator itr3= set3.iterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
		}
		SortedSet set = new TreeSet();   
        // Add the elements in the given set.  
        set.add("Audi");  
        set.add("BMW");  
        set.add("Mercedes");  
        set.add("Baleno");  
        System.out.println("The list of elements is given as:");  
        for (Object object : set) {  
            System.out.println(object);  
              }  
        //Returns the first element  
       System.out.println("The first element is given as: " + set.first());     
        //Returns the last element  
       System.out.println("The last element is given as: " + set.last());  
       //Returns a view of the portion of the given set whose elements are strictly less than the toElement.   
       System.out.println("The respective element is given as: " + set.headSet("Baleno"));  
       //Returns a view of the map whose keys are strictly less than the toKey.  
       System.out.println("The respective element is given as: " + set.tailSet("Audi"));  
	}

}
