package programming_classes;

import java.util.Scanner;

public class Day_7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to run the program");
	int n = sc.nextInt();
	largestDigit(n);
	smallestDigit(n);
}
//36. WAJP to find largest number in a digit.
public static void largestDigit(int n) {
	int n1=n;
	int largest = Integer.MIN_VALUE;
	while(n!=0) {
		int digit = n%10;
		if (largest < digit) {
			largest = digit;
		}
		n=n/10;
	}
	System.out.println("The largest number among "+ n1+" is "+ largest);
}

// 37. WAJP to find smallest number in a digit.
public static void smallestDigit(int n) {
	int n1=n;
	int smallest = Integer.MAX_VALUE;
	while(n!=0) {
		int digit = n%10;
		if (smallest > digit) {
			smallest = digit;
		}
		n=n/10;
	}
	System.out.println("The largest number among "+ n1+" is "+ smallest);
}
}
// 

