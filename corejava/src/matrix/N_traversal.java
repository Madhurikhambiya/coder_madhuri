package matrix;

public class N_traversal {  
	public static void main(String[] args) { 
		
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};  
		
		System.out.println("simple matrix");
		 
		for(int i=0;i<mat.length;i++) {
	    	
			for(int j=0;j<mat[0].length;j++) {
	    		 System.out.print(mat[i][j]+" ");
	    	 } 
	    	 System.out.println();
	     } 
		
		System.out.println("N traversal metrix");
		
		for(int i=mat.length-1;i>=0;i--) {
			System.out.print(mat[i][0]+" ");
			
		} 
		for(int i=1;i<mat.length-1;i++) {
			System.out.print(mat[i][i]+" ");
		} 
		for(int i=mat.length-1;i>=0;i--) {
			System.out.print(mat[i][mat[0].length-1]+" ");
		}
		
	}
	

}
