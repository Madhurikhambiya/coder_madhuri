package lab_13;

public class Main {
	
	public static void main(String[] args) {
		Student std1 = new Student("Madhuri",20);
		Student std2 = new Student("Uma",22,"sales");
		Student std3 = new Student();
		
		System.out.println("value of constructorthe 2 parameter");
		System.out.println("Student name"+std1.name+ "student age"+std1.age);
		
		System.out.println("value of constructorthe 3 parameter");
		System.out.println("Student name"+std2.name+ "student age"+std2.age+"student department"+std2.department);
		
		System.out.println("value of constructorthe");
		System.out.println("Student name"+std3.name+ "student age"+std3.age+"student department"+std3.department);
		
	}

}
