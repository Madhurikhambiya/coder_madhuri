package operaters;

public class Ternary_operator { 
	public static void main(String[] args) {  
		
		// ?,:,
		
		System.out.println("Ternary operator"); 
		
	   int a=10;
	   int b,max;
	   int c=20;
	   int d=30;
	   System.out.println("====================================");
	   
	   int x=(10<20)?30:20;
	   System.out.println(x);
	   
	   b=(a==1)?20:30;
	   System.out.println(b);
	   
	   b=(a==10)?20:30;
	   System.out.println(b);
	   
	   System.out.println("=================================");
	  
	   System.out.println("Nested ternary operator");
	   
	   max = (a>c)?(a>c?a:b):(c>d?c:d);
	   System.out.println(max);
		
				
				
				
				
		
	
		
		
		
	}

}
