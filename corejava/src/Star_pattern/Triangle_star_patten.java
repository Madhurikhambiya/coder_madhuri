package Star_pattern;

public class Triangle_star_patten { 
	public static void main(String[] args) { 
		System.out.println("Triangle  fill star patten");  
		
		for(int i=0;i<5;i++) {
			for(int j=5-i;j>1;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
      System.out.println(" Reverse Triangle  fill star patten");  
		
		for(int i=5;i>=1;i--) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}   
		
       
		System.out.println("Hollow   triangle pattern");  
		
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++ ) {
				if(j==1||i==5||j==(2*i-1)) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
		System.out.println("Hollow  reverse triangle pattern");  
		
		for(int i=5;i>=1;i--) {
			for(int j=i;j<5;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++ ) {
				if(j==1||i==5||j==(2*i-1)) {
					System.out.print("*");
					
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
