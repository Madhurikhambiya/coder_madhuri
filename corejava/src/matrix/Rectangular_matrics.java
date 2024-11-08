package matrix;

public class Rectangular_matrics {
	public static void main(String[] args) {
	    int[][] mat = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}}; 
		int rows = 3;
		int cols = 4;
		
		int[][]matrix = createMatrix(rows,cols);
		traverseMatrix(matrix);
		
	}
      
	public static int[][] createMatrix(int rows, int cols) {
		// TODO Auto-generated method stub
		int[][]matrix = new int[rows][cols];
		int num = 1;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]= num++;
			}
		}
		return matrix;
	}
	public static void printMatrix(int[][]matrix) {
		System.out.println("Rectangular Matrix");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.println(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public static void traverseMatrix(int[][] matrix) {
		// TODO Auto-generated method stub
		System.out.println("Traversed Numbers :");
		for(int i=matrix.length-1;i>=0;i--) {
			for(int j=matrix[0].length-1;j>=0;j--) {
				System.out.print(matrix[i][j]+" ");
				
			}
		}
		
	}
	
	

}
