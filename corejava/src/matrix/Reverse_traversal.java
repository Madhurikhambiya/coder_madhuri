package matrix;

public class Reverse_traversal { 
	public static void main(String[] args) {  
		System.out.println("Reverse traversal");
   int[][] mat = {{1,8,9},{2,7,8},{3,6,11},{4,5,12}}; 
		
		int col = mat[0].length;
		int row = mat.length; 
		
		for(int i=col-1 ;i>=0;i--) {
			for(int j=0; j<row;j++) { 
				System.out.print(mat[j][i]+" ");
			}
		}
		
	}

}
