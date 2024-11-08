package practies_Dsa;

public class Quick_Sort {
	
	public static int partition(int arr[],int low, int high) {
		int pivot = arr[high]; //8
		int i = low-1; //-1
		//{6,3,9,5,2,8}
		for(int j = low ; j<high ; j++) {
			if(arr[j]< pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;
	}
	public static void quicksort(int arr[],int low, int high) {
		//{6,3,9,5,2,8}
		if(low<high) {
			int pi = partition(arr,low,high);
			quicksort(arr,low,pi-1);
			quicksort(arr,pi+1,high);
			
		}
	}
	public static void main(String[] args) {
		int [] arr = {6,3,9,5,2,8};
		//2,3,5,6,8,9  arrange the number sequence 
		
		quicksort(arr,0,5);
		
		for(int jj:arr) {
			System.out.print(jj+" ");
		}
		
		
		
	}
	
}
	
	
	
	