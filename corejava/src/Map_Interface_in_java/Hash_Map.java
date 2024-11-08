package Map_Interface_in_java; 

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;


public class Hash_Map { 
	
	
		
		
		public static void main(String[] args) {
			
			
			HashMap<String , Integer> mp  = new HashMap<>() ;
			
			mp.put("Virat" , 120  ) ;
			mp.put("Dhoni" , 130  ) ;
			mp.put("Suresh" , 110  ) ;
			
			mp.put("Rohit" , 150  ) ;
			
			mp.put(null , 1200  ) ;
			
			
//			for(String  s:mp) {
//				System.out.println(s);
//			}
			
			
		//	Set<Map.Entry<String , Integer> > st  =  ;
			
			
			for( Map.Entry<String , Integer> ee :mp.entrySet()) {
				System.out.println(ee.getKey() +"------------> " + ee.getValue());
				
			}
			
			
			
			
			
		}

	}


