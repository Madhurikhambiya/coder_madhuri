package lab_10;

public class Main { 
	public static void main(String[] args) {
		Common common = new Common();
		String name1 = "Madhuri",name2 = "Uma";
		
		ThreadA threadA = new ThreadA(common,name1);
		ThreadB threadb = new ThreadB(common,name2);
		
		threadA.start();
		threadb.start();
		
		
	}

}
