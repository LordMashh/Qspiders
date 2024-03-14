package programming_classes;

import java.util.Arrays;
import java.util.Scanner;

public class Day_9 {
public static void main(String[] args) {
	int[] a2 = {2,4,6,5,55,2,1,3,4,5,25,41,58,6,9,7,4,3,5};
	int[] a1 = {9,16,15,19,1,9,5,6};
	//inbuilt method for sorting
//	Arrays.sort(a1);
   int[] a = {1,2,3,4,5,6,7,8,9,10,11};
	System.out.println("Elements of the array a are : ");
	for (int i = 0; i < a.length; i++) {
	System.out.print(a[i] + " ");
}
	System.out.println();
	System.out.println("Elements of the array a1 are : ");
	for (int i = 0; i < a1.length; i++) {
		System.out.print(a1[i] + " ");
	}
	System.out.println();
//	addElement(a1);
//	removeElement(a);
	largestElement(a1);
	smallestElement(a1);
	secondLargest(a1);
	secondsmallest(a1);
}
// 50. WAJP to add an element to an given array at the given index or given position.
public static void addElement(int[] a) {
	Scanner sc = new Scanner(System.in);
	int[] b = new int[a.length];
	System.out.println("Enter a number to add in array");
	int number = sc.nextInt();
	System.out.println("Enter on what position to add in array");
	int position = sc.nextInt();
	int j =0 ;
	 for (int i = 0; i < b.length; i++) {
		if (i == position) {
			b[i] = number;
		}else {
			b[i] = a[j];
			j++;
		}
	}
	 for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();

}

// 51. WAJP to remove an element from an array at given position
public static void removeElement(int[] a) {
	Scanner sc = new Scanner(System.in);
	int[] b = new int[a.length-1];
	System.out.println("Enter position to be removed from array");
	int position = sc.nextInt();
	int j =0 ;
	 for (int i = 0; i < a.length; i++) {
		if (i == position) {
		}else {
			b[j] = a[i];
			j++;
		}
	}
	 for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
}
//52. WAJP to find largest element in an given array.
public static void largestElement(int[] a) {
	int largest = Integer.MIN_VALUE ;
	
	for (int i = 0; i < a.length; i++) {
		if (a[i] > largest) {
			largest = a[i];
		}
	}
	System.out.println("The largest number among the array is : "+largest);
}
// 53. WAJP to find smallest element in an given array.
public static void smallestElement(int[] a) {
	int smallest = Integer.MAX_VALUE ;
	
	for (int i = 0; i < a.length; i++) {
		if (a[i] < smallest) {
			smallest = a[i];
		}
	}
	System.out.println("The smallest number among the array is : "+smallest);
}
// 54. WAJP to find second largest number in an element.
public static void secondLargest(int[] a) {
   int largest = Integer.MIN_VALUE ;
   int secondlargest = 0;
	
	for (int i = 0; i < a.length; i++) {
		
		if (a[i] > largest) {
			secondlargest = largest;
			largest = a[i];
		}else if( largest > a[i] && secondlargest < a[i]) {
			secondlargest = a[i];

		}
		
	}
	System.out.println("The secondlargest number among the array is : "+secondlargest);
}
//54. WAJP to find second smallest number in an element.
public static void secondsmallest(int[] a) {
int smallest = Integer.MAX_VALUE ;
int secondsmallest = 0;
	
	for (int i = 0; i < a.length; i++) {
		
		if (a[i] < smallest) {
			secondsmallest = smallest;
			smallest = a[i];
		}else if( smallest < a[i] && secondsmallest > a[i]) {
			secondsmallest = a[i];

		}
		
	}
	System.out.println("The secondlargest number among the array is : "+secondsmallest);
}

}
