package lab_16; 

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleInputMismatchException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.print("Enter an integer: ");
			int number = scanner.nextInt();
			System.out.print("Entered number : " + number);
		}catch(InputMismatchException e) {
			System.out.println("Enter : enter an integer");
		}finally {
			scanner.close();
		}
		
	}

}
