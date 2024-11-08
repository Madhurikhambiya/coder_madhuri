package Star_pattern;

public class Square_pattern { 
	public static void main(String[] args) { 
System.out.println("Squre fill  pattern");  
		
		int n =5; 
		
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=3;j++) {
				System.out.print("*");
			} 
			System.out.println();
		} 
		
		 
		
		System.out.println("Square hollow pattern");
		for(int i=1;i<=4;i++) {
			if(i==1 ||i==4) {
				for(int j=1;j<=4;j++) {
					System.out.print("*");
				}
			} 
			else {
				for(int j=1;j<=4;j++) {
					if(j==1 || j==4) {
						System.out.print("*");
					} 
					else { 
						System.out.print(" ");
					}
				}
			} 
			System.out.println();
		}
		
	}

}
