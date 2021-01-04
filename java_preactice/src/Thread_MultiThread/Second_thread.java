package Thread_MultiThread;


public class Second_thread extends Thread{
	@Override
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("thread "+i+" is running.......");
			
			try {
				Second_thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
