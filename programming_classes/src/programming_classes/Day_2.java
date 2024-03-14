package programming_classes;

import java.util.Scanner;

public class Day_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to run program ");
		int n = sc.nextInt();
		
		System.out.println("the sum of "+n + " is "+Sum(n));
		System.out.println("the product of "+n + " is "+Product(n));
		EvenChecker(n);
		System.out.println("the Reverse of "+n + " is "+reverse(n));
		palindrome(n);
		Factors(n);
		System.out.println("the sum of factors of "+n + " is "+SumOffactors(n));
		PerfectNumber(n);
		System.out.println("the product of factors of "+n + " is "+ProductOffactors(n));
		
		
	}
	// 7. WAJP to find sums of digits in a number
	public static int Sum(int n) {
		int sum = 0;
		while(n!=0) {	
			int digit = n%10;
			sum = sum + digit;
			n = n/10;
		}
		return sum;
	}
	// 8. WAJP to find product of digits in a number
		public static int Product(int n) {
			int sum = 1;
			while(n!=0) {
				int digit = n%10;
				sum = sum * digit;
				n = n/10;
			}
			return sum;
		}
		// 9. WAJP to check the given character is starting from even number
		public static void EvenChecker(int n ) {
			
			while(n>9) {
				n = n / 10;
				
			}
			if(n % 2 == 0)
				System.out.println("the number starts with even");
			else
				System.out.println("the number starts with odd");
		}
		// 10. WAJP to reverse a given number.
		public static int reverse(int n) {
			int rev = 0;
			
			while(n>0) {
				int digit = n% 10;
				rev = rev*10 + digit;
				n = n/10;
			}
			return rev;
		}
		// 11. WAJP to check whether the given is palindrome or not.
		public static void palindrome(int n) {
			if( reverse(n) == n ) {
				System.out.println(n + ", It is palindrome");
			}else {
				System.out.println( n + ", It is not a palindrome");
			}
		}
		// 12. WAJP to find factors of a given number.
		public static void Factors(int n) {
			System.out.print("the factors of "+ n + " are: ");
			for (int i = 1; i <= n; i++) {
				if(n % i == 0)
					System.out.print(i + ", ");
			}
		}
		// 13. WAJP to find sum of factors of a given number.
		public static int SumOffactors(int n) {
			int sum = 0;
			System.out.println();
			for (int i = 1; i <= n; i++) {
				if(n % i == 0)
					sum += i;
			}
			return sum;
		}
		// 14. WAJP to check whether number is perfect number(Number whose sum == number after removing the n) or not.
		public static void PerfectNumber(int n) {
			int sum = 0;
			for (int i = 1; i < n; i++) {
				if(n % i == 0)
					sum += i;
			}
			if (sum == n)
				System.out.println(n + " is a perfect number");
			else
				System.out.println(n + " is not a perfect number");

		}
		// 15. WAJP to find products of factor a given number (Assignment)
		public static int ProductOffactors(int n) {
			int product = 1;
			for (int i = 1; i <= n; i++) {
				if(n % i == 0)
					product *= i;
			}
			return product;
		}
	
}
