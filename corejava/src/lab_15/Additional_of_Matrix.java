package lab_15; 

import java.util.*;

public class Additional_of_Matrix { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Size for matrix
		System.out.println("Enter the number of row");
		Integer row = sc.nextInt();  
		
		System.out.println("Enter the number of coloumn");
		Integer col = sc.nextInt();
		
		//for first Matrix
		
		int arry1[][] = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				arry1[i][j] = sc.nextInt();
			}
		}
		//for second matrix 
		
		int arry2[][] = new int[row][col];
		System.out.println("Enter element Matrix 2");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arry2[i][j] = sc.nextInt();
			}
		}
		//printing matrix 1
		
		System.out.println("Matrix one");
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arry1[i][j]+" ");
			}
			System.out.println();
		}
		//printing matrix 2 
		
		System.out.println("Matrix two");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arry1[i][j]+" ");
			}
			System.out.println();
		} 
		//for calculating sum 
		
		int sum[][] = new int [row][col];
		for(int i=0; i<row ; i++) {
			for(int j=0; j<col;j++) {
				sum[i][j] = arry1[i][j] + arry2[i][j];
			}
		}
		//printing addition of matrix
		
		System.out.println("The sum of two matrix-");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

		
	}

}
