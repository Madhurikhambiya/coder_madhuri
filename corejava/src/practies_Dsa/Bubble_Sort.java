package practies_Dsa;

public class Bubble_Sort {
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("Sorted Array :");
		int arr[] = {7,8,9,3,2,1};
		
		//time complexity = o(n^2)
		//bubble sort
		for(int i=0;i<arr.length-1;i++) { // n-1
			
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					//swapping
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					
					
				}
		
			}
		}
	printArray(arr);
		
	}

	
}

