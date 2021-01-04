package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class listInterface {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//Collection is the top Interface of collection framework and type safe. and are generic type
		// List Interface is implement using ArrayList, LinkedList, vector and Stack which extend Vector Class.
		//they are not synchronized but type safe and keep order and allow random access.
		//Iterator is a collection framework use to iterate over collection class object in one direction
		//ListIterator is also a collection framework use to iterate over in both directions (forward and backward)
		//collection using methods like hasNext(), next() and hasPrevious(), previous(), 
		//when Iterating over List collection class object we cannot modify the collection element/object
		//but we can remove element with condition using iterator object see line 43-46
		
		//vector and ArrayList have the same behavior except vector is Synchronized while ArrayList is not
		//ArrayList is faster than Vector . Both allow duplicate values and keep ordering
		
		//stack extends vector class based on the basic principle of last-in-first-out with methods like: pop() use to remove last element from the stack
		//push() to add element at the stack,
		//empty() It returns true if nothing is on the top of the stack. Else, returns false.
		//search() It determines whether an object exists in the stack. 
		//If the element is found,It returns the position of the element from the top of the stack. Else, it returns -1. 

		//and peek() use to get the first element push to the stack.
		
		
		List list1 = new ArrayList<>();
		list1.add("soro");
		list1.add("sandona");
		list1.add(25);
		
		Iterator iterator =list1.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		List<String> names = new ArrayList<String>();
		names.add("Shyam");
	    names.add("Rajat");
	    names.add("Paul");
	    names.add("Tom");
	    names.add("Kate");
	    
	    System.out.println("name is :"+names.get(2));
	    //Obtaining list iterator
	    ListIterator litr=names.listIterator();
	 
	    System.out.println("Traversing the list in forward direction Using Arrylist:");
	    while(litr.hasNext()){
	    	 System.out.println(litr.next());
	    	/*String elementString= (String)litr.next();
	    	if(elementString.equals("Paul")) {
	    		litr.remove();
	    	}*/
	      
	    }
	    System.out.println("\nTraversing the list in backward direction Using Arrylist:");
	    while(litr.hasPrevious()){
	       System.out.println(litr.previous());
	    }
		
	    
	    List list2 = new LinkedList<>();
	    list2.add("Shyam");
	    list2.add("Rajat");
	    list2.add("Paul");
	    list2.add("Tom");
	    list2.add("Kate");
	    System.out.println("name is :"+names.get(2));
	    //Obtaining list iterator
	    ListIterator litr2=list2.listIterator();
	 
	    System.out.println("Traversing the list in forward direction Using LinkedList:");
	    while(litr2.hasNext()){
	    	 System.out.println(litr2.next());
	    	
	      
	    }
	    
	    List list3 = new Vector<>();
	    list3.add("Shyam");
	    list3.add("Rajat");
	    list3.add("Paul");
	    list3.add("Tom");
	    list3.add("Kate");
	    
	    System.out.println("name is :"+names.get(2));
	    //Obtaining list iterator
	    ListIterator litr3=list3.listIterator();
	 
	    System.out.println("Traversing the list in forward direction Using Vector:");
	    while(litr3.hasNext()){
	    	 System.out.println(litr3.next());
	    	
	      
	    }
	    
	    Stack<String> list4 = new Stack<>();
	    list4.push("Shyam");
	    list4.push("Rajat");
	    list4.push("Paul");
	    list4.push("Tom");
	    list4.push("Kate");
	    
	    System.out.println("name is :"+list4.peek());
	    //Obtaining list iterator
	    ListIterator litr4=list4.listIterator();
	 
	    System.out.println("Traversing the list in forward direction Using Stack:");
	    while(litr4.hasNext()){
	    	 System.out.println(litr4.next());
	    	
	      
	    }
	}

}
