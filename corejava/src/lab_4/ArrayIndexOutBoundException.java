package lab_4;

public class ArrayIndexOutBoundException {
	public static void main(String[] args) {
    
		int[] arr = {1,2,3,4,5}; 
		
		int index = 6;
    
		
		try {
			System.out.println("Element at index "+ index + " : "+arr[index]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
		     System.out.println("Error: Index  "  + index + " is out of bound :");
		}
		
		//try accessing a valid index 
		
		index = 2; //Example index that is within bounds
		
		try {
			System.out.println("Element at index " + index + " : " + arr[index]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
		     System.out.println("Error: Index " + index + " is out of bound :");
		}


	}

}
