package Multithreding;

class common2{
	//class level lock
	//we also used synchronized block for better performance
	
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
class At1 extends Thread{
	common2 c;
	String name;
	At1(common2 c,String name){
		this.c = c;
		this.name = name;
	}
	public void run() {
		c.printName(name);
	}
}
class B1 extends Thread{
	common2 c;
	String name;
	B1(common2 c,String name){
		this.c = c;
		this.name = name;
	}
}
public class ClassLevelLock {
	public static void main(String[] args) {
		common2 c = new common2();
		common2 c1 = new common2();
		At1 t1 = new At1(c,"Ram");
		B1 t2 = new B1(c1,"rohit");
		t1.start();
		t2.start();
	}

}
