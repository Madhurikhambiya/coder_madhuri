package Data_Structure;

public class SearchingAlgo {
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,10,46,89,90,92,95,555,924};
		// there is elements k and you have to find its idx value
		
		int k = 92;
		//86 is not there then return-1
		
		int uttar = search(arr,k);
		System.out.println(uttar);
		
	}

	private static int search(int[] arr, int k) {
		// TODO Auto-generated method stub
		//n+n/2+n/4--------------
		//n /2 ^ k =1;
			//	n= 2^k ;//log2n=k
				
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid=low +(high-low)/2;
			if(arr[mid]==k) {
				return mid;
			}
			if(arr[mid]<k) {
				low=mid+1;
			}else {
				high = mid-1;
			}
		}
		return -1;
	}

}
