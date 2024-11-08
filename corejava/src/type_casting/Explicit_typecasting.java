package type_casting;

public class Explicit_typecasting { 
	public static void main(String[] args) {  
		
		System.out.println("Explicit tyepe casting");
		 
		/* 1 the big data type is convert small data it is called explicit type casting
		 
		 2- In  explicit type casting change to data lose.
		 3- By default the compiler doesn't allow the explicit type casting*/ 
		
		int a=180;
		double x =10.5;
		
		byte b =(byte) a;
		System.out.println(b);
		
		int y =(int) x;
		System.out.println(y);
		
		
	}

}
