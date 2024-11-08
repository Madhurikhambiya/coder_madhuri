package Multithreding;

public class Runnablee implements Runnable {
	public static void main(String[] args) {
		Runnablee r = new Runnablee();
		Thread thread = new Thread(r);
		thread.start();
		thread.setPriority(10);
		Runnablee r2 = new Runnablee();
		Thread thread1 = new Thread(r);
		thread1.start();
		
		thread.setName("1st thread");
		System.out.println(thread.getName());
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i <=10;i++) {
			System.out.println(i);
			System.out.println(Thread.currentThread().getName());
		
		}
		
	}

}
