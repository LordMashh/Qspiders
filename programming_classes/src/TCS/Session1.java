package TCS;

import java.util.Iterator;
import java.util.Scanner;

public class Session1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i = 0; i<arr.length; i++) {
		System.out.println("Enter elements for array index : "+ i );
		arr[i] = sc.nextInt();
	}
	System.out.println("Elements of array are : ");
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i] + " ");
	}
	System.out.println();
	
	System.out.println("enter the number of test cases : ");
	int test = sc.nextInt();
	for(int i =0; i < test; i++) {
		System.out.println("Enter the element to found its count");
		int element = sc.nextInt();
		int count = 0;
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] == element) {
				count ++;
			}
		}
		if(count == 0)
			System.out.println("Element is not present ");
		else
			System.out.println("Element occurence is : "+ count);
	}
}
}
