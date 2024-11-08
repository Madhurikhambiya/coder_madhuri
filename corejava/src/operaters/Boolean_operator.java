package operaters;

public class Boolean_operator { 
	public static void main(String[] args) { 
		
     System.out.println("Boolean logical operator");
		
		// &,  |, ^ 
		
		boolean b1 = true;
		boolean b2= false;
		
		System.out.println("Bitwise (&) operator = "+(b1&b1)); //true
		
		System.out.println("Bitwise (&) operator = "+(b1&b2));//false
		
		System.out.println("Bitwise (&) operator = "+(b2&b1));//false
		
		System.out.println("Bitwise (&) operator = "+(b2&b2));//false 
		
		System.out.println("===================================");
		
        System.out.println("Bitwise (|) operator = "+(b1|b1)); //true
        
        System.out.println("Bitwise (|) operator = "+(b1|b2));//true
		
		System.out.println("Bitwise (|) operator = "+(b2|b1));//true
		
		System.out.println("Bitwise (|) operator = "+(b2|b2));//false
		
		System.out.println("==================================="); 
		
        System.out.println("Bitwise (^) operator = "+(b1|b1)); //false
        
        System.out.println("Bitwise (^) operator = "+(b1|b2));//true
		
		System.out.println("Bitwise (^) operator = "+(b2|b1));//true
		
		System.out.println("Bitwise (^) operator = "+(b2|b2));//false 
		
		System.out.println("=======================================");
		
        System.out.println("boolean compliment  (!) operator = "+(!b1));
        
        System.out.println("boolean compliment  (!) operator = "+(!b2));
		
		
		
		
		
		

		
		
	}

}
