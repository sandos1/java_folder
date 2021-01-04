package Thread_MultiThread;

public class Resources {
	
	@SuppressWarnings("unused")
	private int salary=5000;
	
	//synchronized blocks the next thread's call to method paysalary() as long as the previous thread's 
	//execution is not finished. Threads can access this method one at a time. 
	//Without synchronized all threads can access this method simultaneously.
	public synchronized void paysalary(int value) {
		
		if(salary<value) {
			System.out.println("you cannot be paid");
		}else {
		salary -=value;
		System.out.println("your paycheck is: "+value);
		System.out.println("current thread: "+Thread.currentThread().getName());
		System.out.println("remaining salary: "+salary);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		
		
	}
	
	public int getsalary() {
		return this.salary;
	}

}
