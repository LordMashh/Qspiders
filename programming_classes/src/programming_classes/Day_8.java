package programming_classes;

import java.util.Scanner;
import java.util.Arrays;

public class Day_8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter the size of array");
//	int size = sc.nextInt();
//	int[] arr = new int[size];
//	for (int i = 0; i < arr.length; i++) {
//		System.out.println("Enter the number for index : " + i);
//		arr[i] = sc.nextInt();
//	}
   int[] a1 = {2,4,6,5,55,2,1,3,4,5};
	//inbuilt method for sorting
	Arrays.sort(a1);
   int[] a = {1,2,3,4,5,6,7,8,9,10,11};
	System.out.println("Elements of the array are : ");
	for (int i = 0; i <= a.length; i++) {
	System.out.print(a[i] + " ");
}
	System.out.println();
//   linearSearch(a);
   binarySearch(a);

}
// 46. WAJP to search an element of an array using linear search technique.
public static void linearSearch(int a[]) {
	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the element which is to be found : ");
	int elem = sc.nextInt();
	boolean ispresent = false;
	int i = 0;
	for ( i = 0; i < a.length; i++) {
		if (a[i] == elem ) {
			ispresent = true;
			break;
		}
	}
	if (ispresent) {
		System.out.println("Found the element using linear Search at index" + " " + i);
	}
	else {
		System.out.println("Not Found the element using linear Search at index " + " " + i);
	}
}
// 47. WAJP to search an element of an array using binary search technique.
public static void binarySearch(int a[]) {
	Scanner sc = new Scanner(System.in);
 	System.out.println("Enter the element which is to be found : ");
	int elem = sc.nextInt();
	int low = 0;
	int high = a.length-1;
	boolean ispresent = false;
	int mid = 0;
	while(low<=high) {
		 mid = (low + high) / 2;
			if (a[mid] == elem ) {
				ispresent = true;
				break;
			}else if(elem > a[mid]) {
				low = mid + 1;
			}else if(elem < a[mid]){
				high = mid - 1;
			}
	}
	if (ispresent) {
		System.out.println("Found the element using binary Search at index " + " " + mid);
	}
	else {
		System.out.println("Not Found the element using binary Search at index " + " " + mid);
	}
}




}
