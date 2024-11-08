package Number_pattern;

public class Zero_one_triangal { 
	public static void main(String[] args) {  
		//1
		//01
		//101
		//0101
    
		System.out.println("Zero_one triangal start with one"); 
		
		for(int i=0;i<5;i++) {
			for(int j=1;j<=i;j++)
				if((j+i)%2==0) {
					System.out.print("1 ");
				} 
				else {
					System.out.print("0 ");
				} 
			System.out.println();
		}   
		
		System.out.println(" ");
       
		System.out.println("Zero_one triangal start with zero"); 
		
		for(int i=0;i<=5;i++) {
			for(int j=1;j<i;j++)
				if((j+i)%2==0) {
					System.out.print("1 ");
				} 
				else {
					System.out.print("0 ");
				} 
			System.out.println();
		} 
		
	}

}
