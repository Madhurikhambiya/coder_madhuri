package Multithreding;

class common{
	//object level lock ----> if thread of same object try to access this method so they can extends same
	//method simentenously
	
	public static synchronized void printName(String name) {
		System.out.println("hello ");
		
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(name + " ");
	}
}
class At extends Thread{
	common c;
	String name;
	At(common c,String name){
		this.c = c;
		this.name = name;
	}
	public void run() {
		c.printName(name);
	}
}
class B extends Thread{
	common c;
	String name;
	B(common c,String name){
		this.c = c;
		this.name = name;
	}
	public void run() {
		c.printName(name);
		}
}
public class Synchronization {
	public static void main(String[] args) {
		common c = new common();
		At t1 = new At(c,"Ram");
		B t2 = new B(c,"rohit");
		t1.start();
		t2.start();
	}
}
	