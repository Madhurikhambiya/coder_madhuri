package lab_10;

public class Common { 
	public static void fun1(String name) {
		System.out.println("Welcome");
		try {
			Thread.sleep(3000);
		}catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(name);
	}

}

