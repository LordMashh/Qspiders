package programming_classes;

import java.util.Scanner;

public class Day4_part2 {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to run this program");
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	gcd(n1,n2);
	coprime(n1,n2);
	squareroot(n1);
	cuberoot(n2);
}
 public static void gcd(int n1, int n2) {
	 int gcd = 0;
	 for (int i = 1; i <= n1 || i <= n2; i++) {
		if (n1 % i == 0 && n2 % i == 0) {
			gcd = i;
			
		}
	}
	 System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd);
 }
 
 // 25. WAJP to find coprime(if gcd == 1 )
 public static void coprime(int n1, int n2) {
	 int gcd = 0;
	 for (int i = 1; i <= n1 || i <= n2; i++) {
		if (n1 % i == 0 && n2 % i == 0) {
			gcd = i;
			
		}
	}
	 if(gcd == 1)
	 System.out.println("The numbers " + n1 + " and " + n2 + " are " + " coprime numbers");
 }
 // 26. WAJP to find square root of a given number
 public static void squareroot(int n1) {
	 boolean flag = false;
	 int i = 1; 
	 for ( i = 1; i <= n1/2; i++) {
		if (i * i == n1) {
			flag = true;
			break;
		}
	}
	 if(flag)
		 System.out.println(i + " is a square root of "+ n1);
	 else
		 System.out.println(n1 + " is not a perfect square root");
 }
//  27. WAJP to print cube root of a given number.
 public static void cuberoot(int n1) {
	 boolean flag = false;
	 int i = 1; 
	 for ( i = 1; i <= n1/2; i++) {
		if (i * i * i == n1) {
			flag = true;
			break;
		}
	}
	 if(flag)
		 System.out.println(i + " is a cube root of "+ n1);
	 else
		 System.out.println(n1 + " is not a perfect cube root");
 }
}
