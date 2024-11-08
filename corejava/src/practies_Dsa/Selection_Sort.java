package practies_Dsa;

public class Selection_Sort {
		public static void main(String[] args) {
			System.out.println("print sorted list :");
		int arr[]= {6,4,7,9,8};
		
		//time complexity is o(n^2)
		//n-1 common difference is one
		//Selection sort 
		for(int i=0;i<arr.length-1;i++) {
			int smallest =i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[smallest]>arr[j]) {
					smallest = j;
				}
				
			}
			//Swapping
			int temp = arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
			
		}
		printArray(arr);
				
	}

		private static void printArray(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			
		}

}
