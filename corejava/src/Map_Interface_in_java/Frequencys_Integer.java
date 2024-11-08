package Map_Interface_in_java; 

import java.util.Arrays;
import java.util.*;
import java.util.Map;

public class Frequencys_Integer { 
	
	public static void main(String[] args) {
	
		int[] numbers = {1,2,4,5,6,3,2,5,2,1,4,6,3,1,1}; 
		
		HashMap<Integer,Integer>frequency= new HashMap<>();  
		
		for(int i = 0 ; i<numbers.length ; i++) {
			if(frequency.containsKey(numbers[i])) { 
				
				frequency.put(numbers[i],frequency.get(numbers[i]+1));
			
			}else {
				frequency.put(numbers[i],1);
			}
		
		} 
		System.out.println(frequency);
		

		//single line logic
		
		for( Map.Entry<Integer , Integer> ee :frequency.entrySet()) {
			System.out.println(ee.getKey() +"------------> " + ee.getValue());
			
		}
		
		System.out.println("----------------------------------------------------------");
		
		for(int number : numbers) {
			frequency.put(number,frequency.getOrDefault(number,0)+1);
		} 
		
		for(Map.Entry<Integer,Integer>entry  : frequency.entrySet()) {
			System.out.println("Number:" +entry.getKey()+ ", frequency: "+entry.getValue());
		}
	}
} 





