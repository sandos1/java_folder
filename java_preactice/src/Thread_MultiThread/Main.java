package Thread_MultiThread;

public class Main {
/**
 * 
 * @param args
 * Various stages of life cycle of the thread are,
		New
		Runnable
		Running
		Waiting
		Dead
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * We create a class called Single_thread that extends the java.lang.Thread class.
		 *  This class overrides the run()
		 *  method available in the Thread class. A thread begins its life inside run() method. 
		 *  We create an object(t1) of our new class and call start() method to 
		 * start the execution of a thread. Start() invokes the run() method on the Thread object.
		 */
		Single_thread t1= new Single_thread();
		t1.start();
		
		Second_thread t2 = new Second_thread();
		t2.start();
		/*
		 * We create a new class which implements java.lang.Runnable interface and override run() 
		 * method.
		 *  Then we instantiate a Thread object and call start() method on this object.
		 */
		/*Runnable_thread r1= new Runnable_thread();
		Thread t3 = new Thread(r1);
		t3.start();
		
		  GuruThread3 threadguru1 = new GuruThread3("guru1");
		  threadguru1.start();
		  GuruThread3 threadguru2 = new GuruThread3("guru2");
		  threadguru2.start()*/

	}

}
