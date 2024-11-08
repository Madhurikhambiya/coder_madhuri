package Statements;

public class transfer_statements { 
	public static void main(String[] args) {
		System.out.println("Transfer ststement"); 
		
		System.out.println("===================================="); 
		System.out.println("Break ststement"); 
		
		for(int i=0;i<5;i++) {
			if(i==5)
				break;
			System.out.println(i);
				
		} 
		
		System.out.println("===================================="); 
		 System.out.println("Nested break statement"); 
		
		for(int i=0;i<10;i++) { 
			for(int j=0;j<10;j++) {
				if(j==5) 
					break;
				
				System.out.println(i+" "+j);
					
				
			}  
			
		} 
		
		System.out.println("===================================="); 
		
		System.out.println("Continue statement Example 1"); 
		
		
		for(int i=0;i<10;i++) {
			if(i==5)
				continue;
			System.out.println(i);
				
		} 
		
       System.out.println("===================================="); 
		
		System.out.println("Continue statement Example 2"); 
		
		
		for(int i=0;i<10;i++) {
			if(i%2==0)
				continue;
			System.out.println(i);
				
		} 
		
       System.out.println("===================================="); 
		
		System.out.println("Continue statement Example 3"); 
		
		
		for(int i=0;i<10;i++) {
			if(i==5) {
				
				continue;
				
			}
			System.out.println(i);
				
			
				
		} 
		System.out.println("");
		
		
		 System.out.println("===================================="); 
			
		 System.out.println("Continue statement Example 3"); 
			
			
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(j==2)
						continue;
					System.out.println(i+""+j);
					
				}
			}	
   }
	
}
			
			
			
		
	


