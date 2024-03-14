package programming_classes;

import java.util.Scanner;

public class Day_6 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to run the program");
	int n = sc.nextInt();
	techNumber(n);
	buzzNumber(n);
	primeDigits(n);
}
// 33.WAJP to check whether the given number is tech number or not()
	public static void techNumber(int n) {
		int n1 = n;
		int n2 = n;
		int sum = 0;
		int last = 0;
		int square = 0;
		int first = 0;
		int count = 0;
		while(n!=0) {
			int digit = n%10;
			++count;
			n = n/10;
		}
		if(count % 2 == 0) {
			int digit = 1;
			for (int i = 1; i<= count/2; i++) {
				digit *= 10;
			}
			last = n1 % digit;
			first = n1 / digit;
			sum = last + first;
			square = sum * sum;
			
		}else {
			System.out.println(n2 + " is not tech number and it is odd, enter an even number");

		}
		if(square  == n2) {
			System.out.println(n2 + " is a tech number");
		}else {
			System.out.println(n2 + " is not tech number");
		}	
}
	
	// 34. WAJP to check whether the given number is buzz number or not(number which is divisible by 7 and ends with 7)
public static void buzzNumber(int n) {
	if (n % 7 == 0 || n % 10 == 7) 
		System.out.println(n + " is buzzNumber");
		else
			System.out.println(n + " is not a buzzNumber");

}
// 35. WAJP to print prime digit in a number.
public static void primeDigits(int n) {
	while(n!=0) {
		boolean isprime = true;
		int digit = n % 10;
		for (int i = 2; i <= digit/2; i++) {
			if (digit % i == 0 ) {
				isprime = false;
				break;
			}
		}
		if(isprime && digit != 1)  
			System.out.print(digit+ " ");
		n= n/ 10;
	}
}
}
