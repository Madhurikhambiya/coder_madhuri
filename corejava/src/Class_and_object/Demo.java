package Class_and_object;

public class Demo {
	
public static void main(String[] args) { 
	
	// car object
		
		Car scorpio = new Car();  //() bracket ka matlab koi  method call ho rahe hai.
		
		scorpio.brand = "mahindra" ;
		scorpio.tyre = 4  ;
		scorpio.modelname = "s11" ;  
		
		System.out.println(scorpio.giveHorn());
		System.out.println(scorpio.speed());
		System.out.println("scorpio object  ki puri jaankari " + "brand -->" +scorpio.brand  + " model " +scorpio.modelname);
		
		
		
 
	// student object
	
	Student s1  = new Student() ;
	
	s1.rollNumber = 9211 ;
	s1.name = "Nitish" ;
	s1.subject = "Math" ;
	s1.address = "Bhopal" ;
	
	
	s1.display();
	
	
	
	Student s2 = new Student(2323  , "Rahul" , "Mumbai" , "psycology") ;
	
	s2.display();
	
	
	
	
		
		
				
		
		
	
		
		
		
		
		
		
		
	}
	
	

}
