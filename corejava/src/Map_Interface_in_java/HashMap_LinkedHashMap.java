package Map_Interface_in_java; 

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap_LinkedHashMap { 
	
        public static void main(String[] args) {
		
		HashMap<String , Integer> mp  = new HashMap<>() ;
		
		mp.put("madhuri" , 120 ) ;
		mp.put("virat" , 130  ) ;
		mp.put("Suresh" , 110  ) ;
		mp.put("Rohit" , 150  ) ;
		mp.put(null , 1200  ) ;
			
		for( Map.Entry<String , Integer> ee :mp.entrySet()) {
			System.out.println(ee.getKey() +"------------> " + ee.getValue());
				
		} 
		
		System.out.println("-------------------------------------------------");
			
	   
       LinkedHashMap<String , Integer> m  = new LinkedHashMap<>() ;
		
		m.put("Virat" , 1200  ) ;
		m.put("Dhoni" , 130  ) ;
		m.put("Suresh" , 110  ) ;
		m.put("Rohit" , 150  ) ;
		m.put(null , 1200  ) ;
			
		for( Map.Entry<String , Integer> ee :m.entrySet()) {
			System.out.println(ee.getKey() +"------------> " + ee.getValue());
				
		}
		

	}

}
	


