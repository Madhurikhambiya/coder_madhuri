package Data_Structure;

import java.util.Arrays;

public class TwonumberSum {
	public static void main(String[] args) {
		int[]arr = {12,7,6,4,5,33}; // n^2
		int k = 12;
		Arrays.sort(arr);
		int n = arr.length;
		int i = 0 ;
		int r = n-1;
		while(1<r) {
			if(arr[i] + arr[r] == k) {
				System.out.println(arr[i] + " " +arr[r]);
				break;
			}else if((arr[i]+arr[r]<k)) {
				i++;
			}else {
				r--;
			}
		}
		
	}

}
