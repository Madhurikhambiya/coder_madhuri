package Multithreding;

public class Mainn {
	public static void main(String[] args) {
		Thread a = new Thread();
		Thread b = new Thread();
		Thread c = new Thread();
		
		a.start();
		b.start();
		c.start();
		for(int i=70;i<80;i++) {
			System.out.println(i);
			System.out.println("main thread");
		}
	}

}
class ThreadSA extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			System.out.println("thread of class A");
		}
	}
}
class ThreadB extends Thread{
	public void run() {
		for(int i=50;i<60;i++) {
			System.out.println(i);
			System.out.println("thread of class B");
		}
	}
}
class ThreadC extends Thread{
	public void run() {
		for(int i=20;i<30;i++) {
			System.out.println(i);
			System.out.println("thread of class C");
		}
	}
}
