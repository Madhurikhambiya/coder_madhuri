package lab_3; 


 class  InvalidAgeException extends Exception {
	
	public InvalidAgeException() {
		super();	
	}

	public InvalidAgeException(String message) {
		super(message);	
	}
	
}

public class Person {
	
	private int age;
	   
	  public Person(int age) throws InvalidAgeException{
		 if(age<18||age>100) {
		    throw new InvalidAgeException("Age must be greater than 18 or less then 100");
		 }
		 this.age = age;
	  }
	  
	  public int getAge() {
		  return age;
	  }
	  
	  public static void main(String[] args) {
		    	
		  try {
			Person person1 = new Person(20);
			System.out.println("Person1 age: " +person1.getAge());
					
			Person person2 = new Person(110);   // Throw Exception
			System.out.println("Person2 age: " +person2.getAge());
					
		  } 
		  catch (InvalidAgeException e) {
			System.out.println("Exception caught: " +e.getMessage());
	      }
		     
		  try {
			Person person3 = new Person(15);   // Throw Exception
			System.out.println("Person3 age: " +person3.getAge());
		  }
		  catch (InvalidAgeException e) {
			System.out.println("Exception caught: " +e.getMessage());
		  }

	  }

}



