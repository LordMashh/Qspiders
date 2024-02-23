package programming_classes;

import java.util.Scanner;

public class Day3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number to run the program");
	int n = sc.nextInt();
	primeChecker(n);
	factorial(n);
	
	int init = sc.nextInt();
	int fin = sc.nextInt();
	primeChecker(n);
	primeRange(init,fin);
	compositeChecker(n);
	compositeRange(init,fin);
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
//18. WAJP to check whether the given number is composite number or not
public static void compositeChecker(int n) {
	boolean iscomposite = true;
	for (int i = 2; i < n/2; i++) {
		if(n % i != 0)
			iscomposite = false;
		break;
		
	}
	if(iscomposite)
		System.out.println(n+ " is a composite number");
	else
		System.out.println(n+ " is not a composite number");
	}
//another method
//public static boolean PrimeChecker(int n) { 
//	boolean iscomposite = true;
//	for (int i = 2; i < n/2; i++) {
//		if(n % i == 0)
//			iscomposite = false;
//		break;
//		
//	}
//	return iscomposite;
//	}

	// 	19. WAJP to list the composite numbers in given range.
public static void compositeRange(int init, int fin) {
	for (int i = init; i <= fin ; i++) {
		boolean iscomposite = true;
		for (int j = 2; j < i/2; j++) {
			if(i % j != 0)
				iscomposite = false;
			break;
			
		}
		if(iscomposite)
			System.out.print(i + " ");
	}
	}
	
	// 20. WAJP to find factorial of the given number.
	public static void factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n ; i++) {
			fact *= i;
		}
		System.out.println("factorial of "+ n + " is "+ fact);
	}

}
