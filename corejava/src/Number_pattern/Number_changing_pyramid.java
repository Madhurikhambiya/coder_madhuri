package Number_pattern;

public class Number_changing_pyramid { 
	public static void main(String[] args) {  
		
		System.out.println("Number changing pyramid"); 
		//1
		//2 3
		//4 5 6
		//7 8 9 10
		int count = 1; 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(count+" "); 
				count++;
			}  
			System.out.println();
			
		} 
		
	
		System.out.println("Number increasing reverse pyramid"); 
		
		for(int i=5;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				
					System.out.print(j+" "); 
				
				}
				System.out.println();
	
		} 
		
	
		
		System.out.println("Number_increasing pyramid");  
		
		for(int i=0;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			} 
			System.out.println(); 
			
		} 
		
		 
		
		
		
		
		
		
		
		
		
		
		
		

	
		
		
		
	}

}
