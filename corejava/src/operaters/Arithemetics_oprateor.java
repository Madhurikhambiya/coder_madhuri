package operaters;

public class Arithemetics_oprateor { 
	public static void main(String[] args) { 
		System.out.println("Aeithemetics oprater"); 
		
		/* Addition,subtraction,multiplication, division, modulo*/ 
		
		int  a= 10;
		int  b = 5;
		
		System.out.println("Addition"+a+b);
		
		System.out.println("subtraction"+(a-b));
	
		System.out.println("multiplication"+a*b);
	
		System.out.println("division"+a/b);
		
		System.out.println("modulo"+a%b); 
		
		System.out.println("========================================================");
		
		System.out.println("pre incrmente   and decrement"); 
		
		System.out.println("pre increment"+(++a));
		
		System.out.println("pre decrement"+(--a)); 
		
		System.out.println("=========================================================");
		 
		System.out.println("post increment and decrement");
		
		System.out.println("post increment"+(a++));
		
		System.out.println("post decrement"+(a--));
		
		System.out.println("==========================================================");
		
		System.out.println("pre increment and pre dectement");
		
		System.out.println("expresion"+(++a - ++a));  
		
		System.out.println("==========================================================");
		
		System.out.println("post increment and  post decrement");
		
		System.out.println("expresion"+(--a+--a)*(++a-a--)+(--a+a--)*(++a+a++));
	
		
	}

}
