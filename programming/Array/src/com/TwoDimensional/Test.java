/*Two dimension array:
 * ->Two dimension array is used to represent matrix
 *  matrix is also written like this
 *   _________
 *  | 0 0 0 0 |
 *  | 1 2 3 4 |
 *  | 3 4 6 8 |
 *  |_________|
 *  
 *  syntax to create two dimensional array
 *  using new Operator:
 *   datatype [] [] ref=new datatype[][]
 */
package com.TwoDimensional;

import java.util.Scanner;

public class Test {
	
//	wajp to check the given matrix is symmentric or not
	public static boolean isSymmentrix(int[][] ans) {
		
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[i].length;j++) {
				if(ans[i][j]!=ans[j][i]) {
					return false;
				}
			}
		}
		return true;
	}
//	wajp to find diagonal matrix
	
	public static boolean isDiagonalMatrix(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					if(arr[i][j]==0)
					 return false;
				}
			}
		}
		return true;
	}
//	check the given matrix is identity matrix or not
	
	public static boolean isIdentyMatrix(int[][]arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					if(arr[i][j]!=1)
					 return false;
				}else if(i!=j) {
				     if(arr[i][j]!=0)
				    	 return false;
				}
			}
		}
		return true;
	}
//	printing the two array
	public static void printElement(int[][] arr) {
		System.out.println("Printing the element");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	
//	wajp to find transpose of an matrix
	public static int[][] findTranspose(int[][]arr){

		int[][] result=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				result[i][j]=arr[j][i];
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int arr[][]=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		printElement(arr);
		
//		System.out.println("Printing the transpose of the array");
//		int[][] ans=findTranspose(arr);
//		printElement(ans);
//		if(isDiagonalMatrix(arr)) {
//			System.out.println("Yes, the given matrix is diagonal");
//		}else {
//			System.out.println("The given matrix is not diagonal");
//		}
		
//		if(isIdentyMatrix(arr)) {
//			System.out.println("Yes, the given matrix is identity");
//		}else {
//			System.out.println("The given matrix is not identity");
//		}
		
		if(isSymmentrix(arr))
			System.out.println("Yes, symmentric");
		else
			System.out.println("Not a symmentric");
	}
	
	

}

