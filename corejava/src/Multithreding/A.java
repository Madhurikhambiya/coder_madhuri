package Multithreding;

public class A extends Thread{
	private static final Runnable run = null;
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		System.out.println("end of thread");
	}
	public static void main(String[] args) {
		//Runnablee run = new Runnablee();
		Thread r = new Thread(run);
		r.start();
		
		A obj = new A();
		obj.start();
		//both the run simentenously
		//it is preferable to use eunnable inter
	}

}
