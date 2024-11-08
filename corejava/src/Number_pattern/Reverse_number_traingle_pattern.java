package Number_pattern;

public class Reverse_number_traingle_pattern { 
	public static void main(String[] args) {  
		//1234
		//234
		//34
		//4 
		
		System.out.println("Reverse number traingle pattern");
		System.out.println(" ");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}  
			for(int j=i;j<=4;j++) {
				System.out.print(j+ "  ");
			
		} 
			System.out.println(); 
			
		
		} 
		
		System.out.println(" ");
		
		System.out.println(" Mirror image traingle pattern");
		System.out.println(" ");
		
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}  
			for(int j=i;j<=4;j++) {
				System.out.print(j+ "  ");
			
		} 
			System.out.println(); 
			
		
		}  
		
		for(int i=4-1;i>=1;i--) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}  
			for(int j=i;j<=4;j++) {
				System.out.print(j+ "  ");
			
		} 
			System.out.println(); 
			
		
		}  
		
		
		System.out.println(" ");
		System.out.println("print samenumber traingle pattern");
		System.out.println(" ");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}  
			for(int j=i;j<=4;j++) {
				System.out.print(i+ " ");
			
		} 
			System.out.println(); 
			
		
		}  
		
	}

}
