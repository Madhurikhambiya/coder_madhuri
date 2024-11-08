package Data_Structure;

import java.lang.reflect.Array;

public class Bubble_Sort {
	public static void main(String[] args) {
		int arr[] = {7,6,9,4,2,3,1,10};
		
		int length  = arr.length;
		
		System.out.print("unSorted array : ");
		
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		
			for(int i = 0; i<length;i++) {
			for(int j = 1; j<length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j];
					arr[j]= arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
			System.out.println();
		System.out.print("Sorted array : ");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
