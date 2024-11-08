package lab_19;

import java.util.function.*;

public class StringManipulate {
	public static void main(String[] args) {
		String str ="My Work is completed "; 
		
		//convert to upperCase
		Function<String,String> touppercase =(r) -> str.toUpperCase();
		System.out.println("upperCase -"+ touppercase.apply(str));
		
		//convert to LowerCase
		Function<String,String> toLowerCase =(r) -> str.toLowerCase();
		System.out.println("LowerCase -"+ toLowerCase.apply(str));
		
		//Reversing String
		Function<String,String> reverse =(r) -> new StringBuilder(r).reverse().toString();
		System.out.println("reverse -"+ reverse.apply(str));
		
		
		
	}

}
