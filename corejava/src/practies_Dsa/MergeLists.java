package practies_Dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeLists {
	public static void main(String[] args) {
		//create two list
		
		List<Integer>list1 = Arrays.asList(22,33,44,55);
		List<Integer>list2 = Arrays.asList(66,77,88,99);
		
		//print lists before merging
		
		System.out.println("List 1 : "+ list1);
		System.out.println("List 2 :"+ list2);
		
		//Merge lists
		
		List<Integer>mergedList = mergedLists(list1,list2);
		
		//print merged list
		
		System.out.println("Merged List :" + mergedList);
		
	}
	private static List<Integer> mergedLists(List<Integer> list1, List<Integer> list2) {
		//Method to merge two list
		
		List<Integer>mergedList = new ArrayList<>(list1);
		
		mergedList.addAll(list2);
		
		return mergedList;
		
	}
	

	
}
	
	