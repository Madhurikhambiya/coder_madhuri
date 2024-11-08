package verybasic;

public class Data_type {  
	public static void main(String[] args) {
		
		/* Data types specify the different size and values that can be stored in the variable .
		  there are two type of data type.
		  Primitive data type => boolean,char,byte,short, int ,  long,float,double
		  Non-primitive  data type => classes,interfaces,Arrays.*/
		
		System.out.println("Primitiv data type"); 
		boolean a = false; // bit-1  value  true false
		
		byte b=10; // 8-bit, range (-128 to127) minimum-128 and  maximum 127.it is default value 0.
		
		short c = 20 ; // 16-bit range -32,768 to 32767. it is default value 0.
				
	    int d=30 ;// 32-bit  range 2,147,483648 and 2,147,483,647.it is default value 0.
	  
	     long e= 40; //64-bit range -9,223,3720,036,854,775,808 maximum 9,223,372,036,854,775,807.
		
	     float f = 234.5f; //32-bitIEEE754 its default value 0.0F
	     
	     double g = 5; //64-bit IEEE754 range unlimited  its default value 0.0d.
	     
	     char h='A'; //16-bit  range'\u0000' '\uffff'
	     
	     System.out.println("Boolean" +a);
	   
	     System.out.println("byte"+b);

	     System.out.print("short"+c);
	   
	     System.out.println("int"+d);
	  
	     System.out.println("long"+e);
	  
	     System.out.println("float"+f);
	   
	     System.out.println("double"+g);
	   
	     System.out.println("char"+h);
	     
	}


}
