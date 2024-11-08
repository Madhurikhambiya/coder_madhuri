package Array;

public class ArrayReverse { 
	// you task it is to create array [10] and fill it will table 
	//23 then reverse it then print the covert the same same array into 17 table then print.
	
	public static void main(String[] args) {
		int[] tableof23 = new int [10];
		
		for(int i=0;i<10;i++) {
			
			tableof23[i] = 23*(i+1);
			
		}
		System.out.println("Array  with multiple of 23 :");
		 
		for(int i=0;i<tableof23.length;i++) {
			
			System.out.println("table of 23 "  + " * " + i  +  "  " +tableof23[i]); 
			
		}  
		System.out.println("=========================================");
		
		System.out.println("Reverse array");
		for(int i=10-1;i>0;i--) { 
			
			
			
			System.out.println("table of 23 "+ " * " + + i + "  " +tableof23[i]);
			
		}
		
		
		
	
		
		
	}
	

}
