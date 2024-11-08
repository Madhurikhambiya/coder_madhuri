package Class_and_object;

public class Student {
	
	int rollNumber ;
	String name ;
	String address ;
	String subject ;
	
	// source -genrate const,using field - select all - genrated.
	public Student(int ro, String n, String address, String subject) {
	
		this.rollNumber = ro;
		this.name = n;
		this.address = address;
		this.subject = subject;
	}
	
	
	
	public Student(){ } ; //ye automatically is class ka object return kra rahe hai default constructor
	
	
	  
	
	
	public void display() {
		
		System.out.println("===============================================================");
		
		System.out.println("roll number ---> " + this.rollNumber );
		System.out.println(" name  ---> " + this.name );
		System.out.println(" subject  ---> " + this.subject );
		System.out.println("roll address ---> " + this.address );
		
	}
	
	
	
	

}
	
	
	




