package Thread_MultiThread;

class Runnable_thread implements Runnable {
	private int value;
	Resources resources;
	
	public Runnable_thread(int value,Resources resources) {
		this.value=value;
		this.resources=resources;
		
	}
	@Override
	public void run() {
			
			resources.paysalary(value);
		}


}
