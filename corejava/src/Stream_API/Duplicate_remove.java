package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate_remove {
	// method to remove duplicate elements of the list.
	
	public static List remove_duplicate(List list) {
		List<String>list2 = (List<String>)list.stream().distinct().collect(Collectors.toList());
		return list2;
	}
	//main method
	
	public static void main(String[] args) {
		
		//creating list of string.
		
		List<String>list = new ArrayList<>();
		list.add("Madhuri");
		list.add("Chammu");
		list.add("Chintu");
		list.add("uma");
		list.add("Chammu"); //duplicate
		list.add("Chintu"); //duplicate
		list.add("kapil");
		
		System.out.println(remove_duplicate(list));
	}
	

}
