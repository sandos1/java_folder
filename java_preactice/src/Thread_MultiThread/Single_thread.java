package Thread_MultiThread;

public class Single_thread extends Thread{
	@Override
	public void run() {
		System.out.println("Thread is running.........");
		Thread.yield();
	}
}
