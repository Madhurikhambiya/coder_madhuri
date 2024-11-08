package Static_keyword;

public class Student { 
	
	 String name  ;
		
		String subject  ;
		
		static String  collegeName = "IES" ;
		
		
		public  static void learn() {
		//	subject  = "hindi" ;    // non static variable can not be written  
		//	collegeName = "sistec"; // we  can write only static variable 
			
			collegeName  = "sistect" ;
			
				
		System.out.println("all students are learning"); 
		
		System.out.println("==========================================");
		
		}
		
		
		public void pdadaikaro() {
			System.out.println("pad rahe hai  "); 
			
			System.out.println("==========================================");
			
		}
		

//		method area  , heap area  , stack area
		public static void main(String[] args) {
			
			Student.learn(); //static method is directly  call to class name 
			                 //not a need to  object
			
			//student.pdadaikaro() ;
			
			
			System.out.println(Student.collegeName);
			
			
			Student s  = new Student() ;
			s.name  = "Rajaji" ;
			s.subject = "CS" ;
			
			s.pdadaikaro();
			
			
		
			System.out.println(s.name ) ; 
			
			//System.out.println("==========================================");
			
			System.out.println(s.subject); 
			
			System.out.println(s.collegeName); 
			
			System.out.println("==========================================");
			
			
			
			
			Student s2  = new Student() ;
			s2.name  = "pawan" ;
			s2.subject = "math" ;
		
			System.out.println(s2.name ) ; 
			
			
			
			
			System.out.println(s2.subject); 
			
		
			System.out.println(s2.collegeName);
			
			
			
		}



		@Override
		public String toString() {
			return "Student [name=" + name + ", subject=" + subject + "]";
		}
		
		
		
		
		

	}





