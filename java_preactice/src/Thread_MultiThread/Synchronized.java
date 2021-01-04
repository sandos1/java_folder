package Thread_MultiThread;

public class Synchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resources resource = new Resources();
		
		/*ConsumeThread t1= new ConsumeThread(3000, resource);
		t1.start();
		
		ConsumeThread t2= new ConsumeThread(400, resource);
		t2.start();*/
		
		Runnable_thread tr1 = new Runnable_thread(1000,resource);
		Thread t3=new Thread(tr1,"thread 1");
		t3.start();
		Runnable_thread tr2 = new Runnable_thread(2000,resource);
		Thread t4=new Thread(tr1,"thread 2");
		t4.start();

	}

}
