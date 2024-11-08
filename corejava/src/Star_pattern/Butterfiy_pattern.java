package Star_pattern;

public class Butterfiy_pattern { 
	public static void main(String[] args) { 
		System.out.println("Butterfiy pattern");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			} 
			for(int j=1;j<=2*(5-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");		
			}
			System.out.println();
		
	    } 
		for(int i=5-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			} 
			for(int j=1;j<=2*(5-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");		
			}
			System.out.println();
		
	    }
    
	
    
	
	    
} 

}
