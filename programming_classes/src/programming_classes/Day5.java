package programming_classes;

import java.util.Scanner;

public class Day5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to run the program ");
	int n = sc.nextInt();
//	byte a = (byte) 257;
//	System.out.println(a);
//	int n2= sc.nextInt();
//	fibonaci(n);
	sunnyNumber(n);
	neonNumber(n);
	xylemOrPholem(n);
	automorphic(n);
}
// 28. WAJP to find fibonaci series.
public static void fibonaci(int n) {
	int n1 = 0;
	int n2 = 1;
	System.out.print(n1 + " ");
	System.out.print(n2 + " ");
	for (int i = 1; i <= n; i++) {
		int n3 = n1 + n2;
		System.out.print(n3 + " ");
		n1 = n2;
		n2 = n3;
	}
	System.out.println();
	
}
// 29. WAJP to check whether the given number is sunny number or not(is a number next to which there will be a perfect square)
public static void sunnyNumber(int n) {
	int n1 = n + 1 ;
	boolean flag = false;
	 int i = 1; 
	 for ( i = 1; i <= n1/2; i++) {
		if (i * i == n1) {
			flag = true;
			break;
		}
	}
	 if(flag)
		 System.out.println(n + " is a sunny Number ");
	 else
		 System.out.println(n + " is not a sunny Number");
}
// 30. WAJP to check whether the given number is neon number or not(sum of the digits after squaring the original number == original number ex: 9 --> 81 --> 8+1=9)
public static void neonNumber(int n) {
	int square = n * n;
	int sum = 0;
	while(square != 0) {
		int digit = square%10;
		sum += digit;
		square = square/10;
	}
//	System.out.println(sum);
	if(sum == n)
		System.out.println(n + " is a Neon number");
	else
		System.out.println(n + " is not a neon number");
}
// 31. WAJP to check whether given number is Xylem(is a number in which the sum of inner digits is equal to the sum of the outer numbers ex: 1234 then 1+4 == 5 and 2+3 == 5 thus 5 == 5 if equal then it will be xylem) or phloem.
public static void xylemOrPholem(int n) {
	int n1 = n;
	int sum2 = 0;
	int sum1 = n % 10;
	n= n/10;
	while(n > 9 ) {
			int digit = n % 10;
			sum2 += digit;
			n=n/10;
	}
	sum1 += n;
	if (sum1 == sum2)
		System.out.println("The Number "+ n1 +" is xylem");
	else
		System.out.println("The Number "+ n1 +" is phloem");
}

// 32. WAJP to check whether the given number is automorphic or not( if the square of the original number is ending with the original number ex: 25 --> 625, 5 --> 25, 625 -->72625).
public static void automorphic(int n) {
	int square = n * n;
	int n1 = n;
	int sum1 = 0;
	int sum2 = 0;
	while(n!=0) {
		int digit = n%10;
		sum2 += digit;
		n= n/10;
	}
	while(square >= n1) {
		int digit = square % 10;
		sum1 += digit;
		square=square/10;
	}
	if(sum1 == sum2)
		System.out.println(n1 + " is automorphic Number");
	else
		System.out.println(n1 + " is not automorphic Number");
	
}

}