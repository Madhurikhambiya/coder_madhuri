package matrix;

public class SwastikSum { 
	public static void main(String[] args) { 
		int n=7; //size

		for(int i =1 ;i<=n; i++) {
			for(int j = 1; j<=n; j++) {
				if(i == n / 2+1 || j == n / 2+1 || 
				  (i==1 && j>=n/2+1)||
				  (j==1 && i<=n/2)||
				  (i==n && j<=n/2)||
				  (j==n && i>=n/2+1)) {
					
					System.out.print("*");
				}else {
					System.out.print(" "); //2ws
				}
			}
			System.out.println();
		}
		
		
	}

}
