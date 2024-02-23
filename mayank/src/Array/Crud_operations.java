package Array;

import java.util.Scanner;

public class Crud_operations {
public static void main(String[] args) {
	int arr[] = insert();
	print(arr);
	
	updatearr(arr);
	print(arr);

	int res[] = deletearr(arr);
	print(res);
	
	
}

public static int[] deletearr(int arr[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("====================================");
	System.out.println("Enter the number of the index to delete");
	int index = sc.nextInt();
	if (index > 0 && index < arr.length) {
	int[] result = new int[arr.length-1];
	for (int i = 0; i < result.length; i++) {
		if (i < index) 
			result[i] = arr[i];
			else
			result[i] = arr[i+1];
			
	}
	return result;
	}
	System.out.println("can't delete");
	return arr;
		
}

public static int[] delete2(int arr[]) {
	Scanner sc = new Scanner(System.in);
	int elem = sc.nextInt();
	int index = -1;
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] == elem) {
			index = i;
		}
		
	}
	if (index > 0 && index < arr.length) {
	int[] result = new int[arr.length-1];
	for (int i = 0; i < result.length; i++) {
		if (i < index) 
			result[i] = arr[i];
			else
			result[i] = arr[i+1];
			
	}
	return result;
	}
	System.out.println("can't delete");
	return arr;
		

}

public static void updatearr(int arr[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("====================================");
	System.out.println("Enter the number of the index to upadate");
	int index = sc.nextInt();
	if (index > 0 && index < arr.length) {
		System.out.println("Enter the element ");
		int elem = sc.nextInt();
		arr[index] = elem;
		
	}
	
}

public static void print(int arr[]) {
	System.out.println("====================================");
	System.out.println("Elements inside the Array Are");
for (int i =0 ; i< arr.length ; i++) {
	System.out.print(arr[i] + " ");
}
System.out.println(" ");
}
public static int[] insert() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of the array");
	int len = sc.nextInt();
	int[] arr = new int[len];
	for (int i = 0; i < len; i++) {
		arr[i] = sc.nextInt();
	}
	return arr;
 }
}
