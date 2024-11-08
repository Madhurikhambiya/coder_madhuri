package Star_pattern;

public class Rhombus_pattern { 
	public static void main(String[] args) {   
		
		System.out.println("Rhombus pattern");
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=4-i;j++) {
				
				System.out.print(" ");
		 
			}
			for(int j=1;j<=4;j++) {
				System.out.print("*");
			}
		System.out.println();
			
	    }
		
		
		
		System.out.println("Hollow rhombus pattern");  
		System.out.println("Rhombus pattern");
		for(int i=1;i<=4;i++) {
			
			for(int j=1;j<=4-i;j++) {
				
				System.out.print(" ");
		 
			}
			for(int j=1;j<=4;j++) { 
				if(i==1 ||i==4 ||j==1||j==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
				
		}
		
	    }
}		
		
			
			
			
		
			
			
			
			
			
		
		
		
		
		
         
		
	


