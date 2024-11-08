package Star_pattern;

public class Right_pascals_triangle { 
	public static void main(String[] args) { 
		System.out.println("Right pascals triangle");
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for(int i=5-1;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		
		} 
		
      System.out.println("Left pascals triangle"); 
      
      for( int i=5;i>0;i--) {
			 for(int j=0;j<5;j++) { 
				 if(j<i-1) {
					 System.out.print(" ");
					 
				 } else {
					 System.out.print("*");
				 } 
				 
				 
			 } 
			 System.out.println(); 
			 
		 } 
      
      for(int i=2;i<=5;i++) {
			 for(int j=0;j<=5-1;j++) {
				 if(j<i-1) {
				 System.out.print(" "); 
				 } 
				 else {
					 System.out.print("*");
				 }
			 } 
			 System.out.println();
		 }
		
		
		
	}

}
