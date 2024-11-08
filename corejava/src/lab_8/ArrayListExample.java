package lab_8;  

// Write a java program to create an arrayList of integers,add the following elements to
// it : 10,20,30,40,50. then perform the following operations.
//1)print the original ArrayList.
//2)Sort the ArrayList in ascending order.
//3)print the Sorted ArrayList.
//4)Reverse the ArrayList.
//5)print the reverse ArrayList.


import java.util.Collections;
import java.util.ArrayList;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Integer>ArrayList=new ArrayList<>();
		
		ArrayList.add(10);
		ArrayList.add(30);
		ArrayList.add(20);
		ArrayList.add(40);
		ArrayList.add(50);
		
		System.out.println("original ArratList : " + ArrayList);
		
		//Sort the ArratList ascending order.
		
		Collections.sort(ArrayList);
		
		System.out.println("Sort ArratList : " + ArrayList);
		
		Collections.reverse(ArrayList);
		
		System.out.println("Reverse ArrayList : " + ArrayList);
		
		
		
	}
	
	
		
		
		
	}




