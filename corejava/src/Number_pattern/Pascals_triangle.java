package Number_pattern;

public class Pascals_triangle { 
	public static void main(String[] args) { 
		System.out.println("Pascals triangle");
		
		//1
		//11
		//121
		//1331
		
		int rows = 4;
		printPascalsTriangle(rows);
		
		
	}

	private static void printPascalsTriangle(int rows) {
		// TODO Auto-generated method stub
		for(int i=0;i<rows;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(getPascalsTriangle(i,j)+"");
			}
			System.out.println();
		}
		
	}

	private static int getPascalsTriangle(int row, int col) {
		// TODO Auto-generated method stub
		if(col==0 || col==row) {
			return 1;
		}else {
			return getPascalsTriangle(row-1,col-1)+getPascalsTriangle(row-1,col);
		}
		
	}

}
