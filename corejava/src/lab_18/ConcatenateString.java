package lab_18;

import java.util.*;
import java.util.stream.Collectors;

public class ConcatenateString {
	
	public static void main(String[] args) {
		List<String> city = new ArrayList<>();
		
		city.add("B");
		city.add("H");
		city.add("O");
		city.add("P");
		city.add("A");
		city.add("L");
		
		String new_city = city.stream().collect(Collectors.joining());
		
		System.out.println("String after concatenates "+new_city);
	}

}
