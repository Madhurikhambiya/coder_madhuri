package polymorphism;

public class calculateor {
	public int add(int a,int b) {
		return a+b;
	}
	//changing return type
	public double 	add(double a,double b) {
		return a+b;
	}public int add(int a, int b , int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Calculator c = new Calculator();
		System.out.println("sum of 2 and 3 ="+c.add(2,3)); //calling method which take two integer parameters
		System.out.println("sum of 2.4 and 3.45 ="+c.asdd(2.4,3.45)); // calling method which take two double as parameter
		System.out.println("sum 2,3,4 ="+c.add(12,13,34));//calling method which take three integer parameters
	}

}
