package Statements;

public class conditional_statements { 
	public static void main(String[] args) { 
		
		System.out.println("Conditional operator");  
		System.out.println("===============================================");
		 
		System.out.println("if statement");
		int i=10;
		int j; 
		
		 if(i==10) {
			j=20;
			System.out.println(j);
			
		}   
		
		System.out.println("=================================================");
		
		System.out.println("if-else ststements");   
		
		if(i==10) {
			j=20;
		}
		else {
			j=30;
			
		}
		System.out.println(j);
		
		 
		System.out.println("=========================================================");
		
		System.out.println(" else-if  ststement"); 
		
		if(i==10) { 
			
			System.out.println("sunday");
			
		}else if(i==20) {
			System.out.println("monday");
		} 
		else if(i==20) {
			System.out.println("tuesday");
		}
		
		else { 
			System.out.println("wednesday");
			
		}
		 
		 
		 System.out.println("================================================="); 
		 
		 System.out.println("Switch ststement"); 
		 
		 int month= 6;
		 switch (month)
		 
		 {
		 case 1:
			 System.out.println("jan"); 
			 break;
			 
		 case 2:
			 System.out.println("febn"); 
			 break;
			 
		 case 3:
			 System.out.println("may"); 
			 break;
			 
		 case 4:
			 System.out.println("jun"); 
			 break;
			 
		 case 5:
			 System.out.println("july"); 
			 break;
			 
		 case 6:
			 System.out.println("jan"); 
			 break;
		 case 7:
			 System.out.println("jan"); 
			 break;
		 case 8:
			 System.out.println("aug"); 
			 break;
		 case 9:
			 System.out.println("sep"); 
			 break;
		 case 10:
			 System.out.println("oct"); 
			 break;
		 case 11:
			 System.out.println("nov"); 
			 break;
		 case 12:
			 System.out.println("dec"); 
			 break;
			 
			 
		 } 
		 
		 
		
		
	}

}
