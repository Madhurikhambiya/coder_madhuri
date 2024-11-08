package Map_Interface_in_java; 

import java.util.*;

public class Hash_map_Example { 
	

	public static void main(String[] args) {
		
		
		HashMap<String , Boolean> mp  = new HashMap<>() ;
		
		mp.put("Queston1" , true  ) ;
		
		mp.put("Question2" , false  ) ;

        mp.put("Question3" , true) ;
		
		mp.put("Question4" , false ) ;
		
		
		
		
		
		
		for( Map.Entry<String , Boolean> ee :mp.entrySet()) {
			System.out.println(ee);
			
		}
		
		
		
		
		
	}

}



	


