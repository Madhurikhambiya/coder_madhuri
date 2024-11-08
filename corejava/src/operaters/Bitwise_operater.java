package operaters;

public class Bitwise_operater { 
	public static void main(String[] args) { 
		System.out.println("Bitwise  logical operator");
		
		//And(&) , OR (|), XOR (^) , Bitwise Complement(~),(right shift <<),(left shift>>)
		
		int a= 10;
		int b= 30;
		
		System.out.println("Bitwise (&) operator = "+(a&b));
		
		System.out.println("Bitwise (|) operator ="+(a|b));
		
		System.out.println(" Bitwise (^) operator ="+(a^b));
		
		System.out.println(" Bitwise (~) operator ="+(~a)); 
		
		System.out.println("====================================");
		
		System.out.println("Right shift operator");
		
		System.out.println("Right shift (<<) oprator = "+(a<<b));  
		
		System.out.println("=======================================");
		
		System.out.println("Left shift operator");

		System.out.println("Left shift (>>) oprator = "+(a>>b)); 
		
		System.out.println("========================================");
		
		System.out.println("Right zero fill operator");

		System.out.println("Right zero fill(>>>) oprator = "+(a>>>b)); 
		
		
		
		
		
	}

}
