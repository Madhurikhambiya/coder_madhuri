package matrix;

public class rombus_traversal { 
	public static void main(String[] args) {
		
		int [][] mat = {{1,2,3},{4,5,6},{7,8,9}}; //12(row/2 ,col-1)
		int r= mat.length;
	    int c = mat[0].length;
		
		for(int i=r/2,j=c-1;i>=0 && j>=c/2;i--,j--) {
			System.out.println(mat[i][j]+" ");
			
		}  
		for(int i=1,j=c/2-1;i<=r/2 && j>0;i++,j--) {
			System.out.println(mat[i][j]+" ");
		}  
		
		for(int i=r/2,j=c/2-1;i>=0 && j>=0;i++,j++) {
			System.out.println(mat[i][j]+" ");
		
		}
		
		
	}

}
