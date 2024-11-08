package Multithreding;

public class PriorityThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<10;i++) {
			String thread_name = Thread.currentThread().getName();
			if(thread_name.equals("Chintu")) {
				try {
					Thread.sleep(1000);;
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(thread_name + "is running");
		}
		
	}
	
	public static void main(String[] args) {
		PriorityThread pt = new PriorityThread();
		Thread thread = new Thread(pt);
		Thread thread1 = new Thread(pt);
		Thread thread2 = new Thread(pt);
		
		//setting name 
		thread.setName("Chintu");
		thread1.setName("kapil");
		thread2.setName("komal");
		
		//setting priority of each thread
		
		thread.setPriority(10); //highest priority
		thread.setPriority(5); // normal  priority
		thread.setPriority(1); // lowest priority
		thread.start();
		thread1.start();
		thread2.start();
		
		

		
	}

	

}
