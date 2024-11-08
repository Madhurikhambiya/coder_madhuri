package Multithreding;

public class Demo {
	public static void main(String[] args) {
		DemonThread dd = new DemonThread();
		dd.setDaemon(true);
		dd.start();
		System.out.println("i am thread");
		
	}

}
//demon thread call when main thread is run.
//if main thread does any things to execute then jvm automatically.
//terminate  the emon thread.
