package programming_classes;

import java.util.Iterator;
import java.util.Scanner;

public class Day_7_array_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size = sc.nextInt();
//	int []a = {2,4,6,5,55,2,1};
	int[] arr = new int[size];
	int[] arr2 = new int[size];
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter the number for index : " + i);
		arr[i] = sc.nextInt();
	}
	
//	// 44. WAJP to copy elements of one array into another array
//	System.out.println("Printing of new array");
//	for (int i = 0; i < arr2.length; i++) {
//		System.out.print(arr2[i] + " ");
//	}
////	System.out.println();
////	for (int i = 0; i < arr.length; i++) {
////			arr2[i] = arr[i];
////		
////	}
//	System.out.println();
//	System.out.println("Printing of new array");
//	for (int i = 0; i < arr2.length; i++) {
//		System.out.print(arr2[i] + " ");
//	}
	// 45. WAJP to reverse an array
	System.out.println();
	int j = 0;
	for (int i = arr.length-1; i >= 0; i--) {
			arr2[j] = arr[i];
			j++;
	}
	System.out.println("Printing of new array");
	for (int i = 0; i < arr2.length; i++) {
		System.out.print(arr2[i] + " ");
	}
}
}
