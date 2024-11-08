package matrix;

public class Even_odd_squaradd1number { 
	public static void main(String[] args) { 
System.out.println("print even number"); 
		
		int[][] mat = {{2,3,5},{6,7,2},{2,4,8}}; 
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]%2==0) {
					System.out.print(mat[i][j]+" ");
				}
			} 
			System.out.println();
		}
		System.out.println(" ");
		System.out.println("print odd number");
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[0].length;j++) {
				if(mat[i][j]%2!=0) {
					System.out.print(mat[i][j]+" ");
				}
			} 
			System.out.println();
		} 
		
      System.out.println("add 1 number");
		
		for(int i=0;i<mat.length;i++) { 
			for(int j=0;j<mat[0].length;j++) {
				mat[i][j]=mat[i][j]+1; 
				System.out.print(mat[i][j]+" ");
		}  
			System.out.println(" ");
			
			} 
			
			
		
		
	}

}
