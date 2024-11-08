package Star_pattern;

public class Right_half_pyramid { 
	public static void main(String[] args) {
		System.out.println("Right half pytamid");
		for(int i=1;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
		 
		System.out.println("Revers right half pyramid"); 
		 for(int i=0; i<=4;i++) {
			 for( int j=1;j<=4-i+1;j++) {
				 System.out.print("*");
			 } 
			 System.out.println(); 
			 
		 }  
		 
		 System.out.println("Left half pyramid"); 
		 
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
		 
		 System.out.println("Reverse left pyramind"); 
		 for(int i=1;i<=6;i++) {
			 for(int j=0;j<=6-1;j++) {
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

