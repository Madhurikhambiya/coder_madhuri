package operaters;

public class logical_operator { 
	public static void main(String[] args) { 
		
		// && , ||,  
		int a =27;
		int b = 3; 
		
		System.out.println("logical And(&&)operator");
		
		 if(a<b && a==b){
			System.out.println("Both  condition are true");
		} 
		else {
			System.out.println("Both  condition are false"); 
			
		} 
		 
		 System.out.println("==================================");
		 
		 System.out.println("logical OR(||) operater");
		
		
		if(a>b || a<b) {
			System.out.println("Atleast condition is true");
		} 
		else {
			System.out.println("Atleast condition id false");
		}
		
		
		
	}

}
