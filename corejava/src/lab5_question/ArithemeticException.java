package lab5_question;
 
public class ArithemeticException { 
	public static void main(String[] args) {
		int numerator = 10 ;
		int denominator = 0; // Change to non-zero to test successful division
			try {
				int result = numerator / denominator;
				System.out.println("Result: " + result);
				
			}
			catch(ArithmeticException e){
				System.out.println("Error : Division by zero is not allowed : ");

			}
			
			// try with a valid denominator that is non zero 
			
			denominator = 2 ;
			
			try {
				int result = numerator / denominator;
				System.out.println("Result: " + result);
				
			}
			catch(ArithmeticException e){
				System.out.println("Error : Division by zero is not allowed : ");

			}
			
			
			
		}
	}

