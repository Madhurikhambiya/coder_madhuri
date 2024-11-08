package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Concate_String {
	public static void main(String[] args) {
		List<String>length = new ArrayList<>();
		length.add("Hindi");
		length.add("English");
		length.add("tamil");
		length.add("telgu");
		length.add("gujrati");
		
		//joining method is use to concate  element into a single string.
		
		String concate_list = length.stream().collect(Collectors.joining(" "));
		System.out.println(concate_list);
	
	}

}
