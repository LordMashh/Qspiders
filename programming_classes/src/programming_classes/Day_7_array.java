// 38. WAJP to store elements in array dynamically

package programming_classes;

import java.util.Iterator;
import java.util.Scanner;

public class Day_7_array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array");
	int size = sc.nextInt();
	int[] arr = new int[size];
	for (int i = 0; i < arr.length; i++) {
		System.out.println("Enter the number for index : " + i);
		arr[i] = sc.nextInt();
	}
	// interview question
//	System.out.println("interview question");
//	for (int i = 0; i < 3; System.out.println(i++)) {
//		
//	}
	// 38. WAJP to store elements in array dynamically
//	System.out.println("Printing the array elements");
//	for (int i = 0; i < arr.length; i++) {
//		System.out.print(arr[i] + " ");
//	}
	// 39. WAJP to print even elements of an array.
	System.out.println("Printing the even numbers in array ");
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2 == 0) 
			System.out.print(arr[i] + " ");
	}
	System.out.println();
	// 40. WAJP to print odd elements of an array.
		System.out.println("Printing the even numbers in array ");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 != 0) 
				System.out.print(arr[i] + " ");
		}
		System.out.println();
	// 41. WAJP to print elements of even index
		System.out.println("Printing the even index numbers in array ");
		for (int i = 0; i < arr.length; i++) {
			if(i%2 == 0) 
				System.out.print(arr[i] + " ");
		}
	// 41. WAJP to print elements of odd index
		System.out.println();
			System.out.println("Printing the odd index numbers in array ");
			for (int i = 0; i < arr.length; i++) {
				if(i%2 != 0) 
					System.out.print(arr[i] + " ");
			}
	// 42. WAJP to add all the elements in array
			System.out.println();
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			System.out.println("Printing the sum of all elements in array : "+ sum);
	// 43. WAJP to find average of all elements in array
			double average = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
				average = sum/size;
			}
			System.out.println("Printing the sum of all elements in array : "+ average);

}
}
