package lab_17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		//creating list of string
		
		List<String> city = new ArrayList<>();
		city.add("Bhopal"); city.add("Indore");
		city.add("Pune"); city.add("Jabalpure");
		city.add("Goa"); city.add("Banglure");
		
		
		//print Duplicate list
		
		System.out.println("List of city with Duplicate "+ city);
		
		//creating list of stream using distinct it remove duplicate value
		
		List<String>real_city = city.stream().distinct()
				.collect(Collectors.toList());
		System.out.println("List of city without duplicates "+real_city);
		
	}

}
