package Star_pattern;

public class Hollow_Hourglass { 
	public static void main(String[] args) { 
		System.out.println("Hollow hourhlass");  
		
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
		
		
		
	}

}
