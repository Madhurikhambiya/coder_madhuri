package Number_pattern;

public class Number_triangular { 
	public static void main(String[] args) { 
		//1
		//2 2
		//3 3
		//4 4
		
     System.out.println("Number  right half triangular ");  
     
		
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4-1;j++) {
				System.out.print(" "); 
			}  
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}  
		
		 System.out.println("Number triangular");  
	     
			
			
			for(int i=1;i<=4;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print(" "); 
				}  
				for(int j=i;j<=4;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}   
			
			 System.out.println("left half Number triangular"); 
			
			for(int i=1;i<=4;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print(""); 
				}  
				for(int j=i;j<=4;j++) {
					System.out.print(j+" ");
				}
				System.out.println();
			}   
			
          System.out.println("Reverse Number triangular"); 
			
			for(int i=4;i>0;i--) {
				for(int j=4;j>=i;j--) {
					System.out.print(" "+j); 
				}  
				System.out.println();
			}  
		
		
		
	}

}
