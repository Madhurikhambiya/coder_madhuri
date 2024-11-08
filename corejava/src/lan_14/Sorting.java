package lan_14;

import java.util.*;

public class Sorting {
	public static void sort(int array[]) {
		
		for(int i=0;i<array.length;i++) {
			for(int j= i+1 ;j<array.length;j++) {
				int a = 0;
				if(array[i]>array[j]) {
					a = array[i];
					array[i] =array[j];
					array[j] = a;
				}
			}
			System.out.print(array[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size  of array number");
		int size = sc.nextInt();
		
		int array[] = new int[size];
		System.out.println("Enter element of array ");
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("array element before sorting");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.println("array element after sorting");
		Sorting.sort(array);
	}

}
