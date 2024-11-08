package practies_Dsa;

public class insertion_sort {
	public static void main(String[] args) {
		System.out.println("print sorted list");
		int  arr[] = {6,7,9,3,4,2,1};
		//insertion sort
		
		for(int i=1;i<arr.length;i++) {
			int current =arr[i];
			int j= i-1;
			while(j>=0 && current<arr[j]) {
				arr[j+1]=arr[j];
				j--;
			}
			//placement
			arr[j+1] = current;
		}
		printArry(arr);
	}

	private static void printArry(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
