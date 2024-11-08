package Multithreding;

public class JoinThread {
	public static void main(String[] args) {
		Training t1 = new Training();
		t1.start();
		try {
			t1.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		Placement t2 = new Placement();
		t2.start();
	}
  }
	class Training extends Thread{
		public void run() {
			for(int i = 0; i<5; i++) {
				System.out.println("Training is staryed");
			}
		}
	}
	class Placement extends Thread{
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.println("Placement is started");
			}
		}
	}


