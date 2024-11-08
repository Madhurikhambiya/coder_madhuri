package matrix;

public class Diamond_traversal {
	 public static void main(String[] args) {
		 System.out.println("Diamond Traversal");
	        int[][] matrix = {
	            {1, 2, 3, 4, 5},
	            {6, 7, 8, 9, 10},
	            {11, 12, 13, 14, 15},
	            {16, 17, 18, 19, 20},
	            {21, 22, 23, 24, 25}
	        };

	        int rows = matrix.length;
	        int cols = matrix[0].length;
	        int centerRow = rows / 2;
	        int centerCol = cols / 2;

	        traverseDiamond(matrix, centerRow, centerCol);
	    }
	 public static void traverseDiamond(int[][] matrix, int centerRow, int centerCol) {
	        int rows = matrix.length;
	        int cols = matrix[0].length;

	        // Upar ki taraf traverse
	        for (int i = centerRow; i >= 0; i--) {
	            System.out.print(matrix[i][centerCol] + " ");
	        }

	        // Left ki taraf traverse
	        for (int j = centerCol - 1; j >= 0; j--) {
	            System.out.print(matrix[0][j] + " ");
	        }

	        // Down ki taraf traverse
	        for (int i = 1; i < rows; i++) {
	            System.out.print(matrix[i][0] + " ");
	        }

	        // Right ki taraf traverse
	        for (int j = 1; j < cols; j++) {
	            System.out.print(matrix[rows - 1][j] + " ");
	        }
	     // Center se upar ki taraf traverse
	        for (int i = centerRow - 1; i >= 0; i--) {
	            System.out.print(matrix[i][centerCol] + " ");
	        }

	        // Center se left ki taraf traverse
	        for (int j = centerCol - 1; j >= 0; j--) {
	            System.out.print(matrix[centerRow][j] + " ");
	        }

	        // Center se down ki taraf traverse
	        for (int i = centerRow + 1; i < rows; i++) {
	            System.out.print(matrix[i][centerCol] + " ");
	        }

	        // Center se right ki taraf traverse
	        for (int j = centerCol + 1; j < cols; j++) {
	            System.out.print(matrix[centerRow][j] + " ");
	        }
	    }
	}






