package Statements;

public class itrative_statements { 
	public static void main(String[] args) { 
		System.out.println("iterative ststement");
		
		System.out.println("================================================");
		
		System.out.println("for loop"); 
		for(int i=0;i<10;i++) {
			System.out.println(i);  
				}
		
		System.out.println("=================================================");
		System.out.println("Nested for loop");
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");  
				
			}
			System.out.println();
		} 
		
		System.out.println("================================================");
		
		System.out.println("While loop");
		
		int i=0;
		while(i<5) {
			System.out.println(i);
			i=i+1;
		} 
		
		System.out.println("===================================================");
		
		System.out.println("Do while-loop");
		
		do {
			System.out.println(i);
			i=i+1;
		}
		while(i<10); 
		
		System.out.println("=====================================================");
		
		System.out.println("do statement");
		
		do {
			System.out.println("only one statement");
		} 
		while(i<5) ;
			
		
		
	}

}
