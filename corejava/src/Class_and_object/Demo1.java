package Class_and_object;

public class Demo1 {
	
public static void main(String[] args) {
		
		Car scorpio = new Car();
		
		scorpio.brand = "mahindra" ;
		scorpio.tyre = 4  ;
		scorpio.modelname = "s11" ;
		
	
      System.out.println(scorpio.giveHorn() );
	
   	System.out.println(scorpio.speed());

	
	System.out.println("scorpio object  ki puri jaankari " + "brand -->" +scorpio.brand  + " model " +scorpio.modelname);
	
	
		
		/// student  object call
	
	
	Student s1  = new Student() ;// s1 object bana hai default conructor se 
	
	s1.rollNumber = 9211 ;
	s1.name = "Nitish" ;
	s1.subject = "Math" ;
	s1.address = "Bhopal" ;
	
	
	s1.display();
	
	
	
	Student s2 = new Student(2323  , "Rahul" , "Mumbai" , "psycology") ;
	
	s2.display();
	
	
	}
	
	

}


