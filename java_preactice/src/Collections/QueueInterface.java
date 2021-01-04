package Collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {

	public static void main(String[] args) {
		// Queue is a collection interface which is based on First In First Out) order principle
		//Queue is implemented by LinkedList, PriorityQueue class collection.
		// LiskedList store element in order while PriorityQueue sorted as well as Ordered as per the natural Order.
		//The add() and offer() methods differ in how the behave if the Queue is full, so no more elements can be added.
		//The add() method throws an exception in that case, whereas the offer() method just returns false.
		
		//The poll() and remove() both removes the first element in the Queue. They differ in how they behave if the Queue is empty.
		//The poll() method returns null if the Queue is empty. The remove() method throws an exception if the Queue is empty. 
		
		//You can peek at the element at the head of a Queue without taking the element out of the Queue. 
		//This is done via the Queue element() or peek() methods. The element() method returns the first element in the Queue.
		//If the Queue is empty, the element() method throws a NoSuchElementException.
		
		
		Queue<String> queue = new LinkedList<String>(); 
	    queue.add("Ishfaq");
	    queue.add("Ramzan");
	    queue.add("Nagoo");
	    queue.add("Bangalore");

	    System.out.println("Linked List Queue is:"+ queue);
	    System.out.println("Linked List Queue Peek is :"+queue.peek());
	    System.out.println("Linked List Queue after peek is:"+ queue);

	    queue.poll();
	    System.out.println("Linked List Queue after remove is:"+ queue);


	    Queue<Integer> queuenew = new PriorityQueue<Integer>();


	    queuenew.add(2);
	    queuenew.add(3);
	    queuenew.add(1);
	    queuenew.add(0);
	    queuenew.add(4);

	    System.out.println("Priority Queue is:"+ queuenew);
	    System.out.println("Priority Queue Peek(first element) is :"+queuenew.peek());

	    int ieleFirst=queuenew.remove();
	    System.out.println("Priority Queue Element Removed is:"+ ieleFirst);
	    int ieleSecond=queuenew.remove();
	    System.out.println("Priority Queue Element Removed is:"+ ieleSecond);
	    System.out.println("Priority Queue after remove is:"+ queuenew);
	  

	}

}
