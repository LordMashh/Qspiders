package programming_classes;

import java.util.Scanner;

public class Day_3_2nd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to run the program");
		int n = sc.nextInt();
		strongNumber(n);
		
		
	}
	// 21. WAJP to check whether the given number is strong or not.
	public static void strongNumber(int n) {
		int n1 = n;
		int sum = 0;
		while(n != 0) {
			int digit = n % 10;
			int fact = 1;
			for (int i = 1; i <= digit; i++) {
				fact *=  i;
			}
			sum += fact;
			n=n/10;
		}
//		System.out.println(sum);
		if(sum == n1)
			System.out.println(n1+ " is a Strong number");
		else
			System.out.println(n1+ " is not a Strong number");
		
	}
}
