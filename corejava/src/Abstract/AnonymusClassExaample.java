package Abstract;

interface sayable{
	public void sleep();
}
public class AnonymusClassExaample {
	public void eat() {
		System.out.println("Madhuri khambiya");
	}
	public static void main(String[] args) {
		//anonymus class
		sayable s = new sayable() {
			public void sleep() {
				System.out.println("hello");
			}
		};
		s.sleep();
	}

}
