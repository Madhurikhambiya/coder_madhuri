package String; 

//Write a java program to concatenate two strings using the +operator.

public class String_question {  
	public static void main(String[] args) {
		String first = "Hello";
		String second = "World"; 
		String m = first+second;
		System.out.println("String first : " + first);
		System.out.println("String second : " + second);
		
		System.out.println("After concatenation string : " + m);
		
		
		System.out.println("=============================================================="); 
		
		//Write a java program to convert a String to upper-case using the to-upper-case().
		
		String str = "Hello World";
		String strup = str.toUpperCase();
		System.out.println(strup);
		
		
		System.out.println("================================================================="); 
	
		//Write a java program to get the length of a String using the length() method.
		
		String str1 = " Hello World ";
		
		//Get the length of the String using the length() method.
		
		int length = str1.length();
		
		//print the length of the string.
		System.out.println("The length of the String :\""+str1+"\" is : "+length); 
		
		System.out.println("==================================================================");
		
		//write a java program to trim the whitespace from a string using the trim()method.
		
		String x = " Hii ";
		
		String y = " I am ";

		String z = " Madhuri "; 
		
		//printing without trim function.
		
		System.out.println(x+y+z);
		
		//Using trim function to get result.
		
		System.out.println(x.trim()+y.trim()+z.trim());
		
		System.out.println("====================================================================");
		
		//Write java program to split string in to array of substring using the split()method.
		
		String str3 = " Hello World ";
		String [] Words = str3.split("\\s"); 
		for(String w: Words) {
			System.out.println(w);
			
		}
		System.out.println("========================================================================");
		
		//write a java program to reverse a string.
		
		String str4 = "Hello world";
		String reverseStr = "";
		for(int i = str4.length()-1;i>=0;i--) {
			reverseStr = reverseStr + str4.charAt(i);
		}
		System.out.println("original string : "+ str4);
		System.out.println("Reverse string :"+ reverseStr);
		
		System.out.println("=====================================================================");
		
		//write a java program to extract a substring from a string using the substring()method.
		
		String str5 = new String("Hello world");
		System.out.println("The extracted substring is :");
		System.out.println(str5.substring(5));
		
		System.out.println("=======================================================================");
		
		//write a java program to replace a specific character in a string with another
		//character using the replace()method.
		


		
		
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 
	
	
	
	
	

}
