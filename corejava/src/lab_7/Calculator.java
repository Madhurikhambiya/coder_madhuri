package lab_7;

public class Calculator { 
	int calculateSum(int a,int b) {
		return a+b; 
		
	}
	double calculateSum(double a,double b,double c) {
		return a+b+c;
	}
	int calculateSum(int[]array) {
		int sum = 0;
		for(int num :array) {
			sum+= num;
		}
		return sum;
	}
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.calculateSum(2,3));
		System.out.println(c1.calculateSum(1.2,2.3,3.4));
		
		System.out.println(c1.calculateSum(new int[]{1,2,3,4,5}));
		
	}

}
