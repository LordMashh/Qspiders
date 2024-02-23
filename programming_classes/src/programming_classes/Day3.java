package programming_classes;

import java.util.Scanner;

public class Day3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to run the program");
//	int n = sc.nextInt();
//	primeChecker(n);
	
	int init = sc.nextInt();
	int fin = sc.nextInt();
	primeRange(init,fin);
}
// 16. WAJP to check whether the given number is prime number or not
public static void primeChecker(int n) {
	boolean isprime = true;
	for (int i = 2; i < n/2; i++) {
		if(n % i == 0)
			isprime = false;
		break;
		
	}
	if(isprime)
		System.out.println(n+ " is a prime number");
	else
		System.out.println(n+ " is not a prime number");
	}
//another method
//public static boolean PrimeChecker(int n) { 
//	boolean isprime = true;
//	for (int i = 2; i < n/2; i++) {
//		if(n % i == 0)
//			isprime = false;
//		break;
//		
//	}
//	return isprime;
//	}

	// 	17. WAJP to list the prime numbers in given range.
public static void primeRange(int init, int fin) {
	for (int i = init; i <= fin ; i++) {
		boolean isprime = true;
		for (int j = 2; j < i/2; j++) {
			if(i % j == 0)
				isprime = false;
			break;
			
		}
		if(isprime)
			System.out.print(i + " ");
	}
	}
}