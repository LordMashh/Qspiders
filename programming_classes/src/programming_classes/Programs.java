package programming_classes;

import java.util.Scanner;

public class Programs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1.to print largest number of 3 numbers using conditional operator.
//		int a = sc.nextInt();	
//		int b = sc.nextInt();	
//		int c = sc.nextInt();	
	//	
//		System.out.println( a > b ? a > c ? a + " is the largest" : c + " is the largest" : b > c ? b + " is the largest"  : c + " is the largest" );

		// 2.WAJP to check whether even number or not
//		System.out.println("enter a number to find even or not " );
//		int n = sc.nextInt();
////		if((n&1)==0)
//		if(n/2*2 == n)
//			System.out.println("even");
//		else
//			System.out.println("odd");
		
		// 3.to count number of digits in a given number
		System.out.println("enter random numbers");
		int n = sc.nextInt();
		
		int count = 0;
		while(n>0) {
			count++;
			n=n/10;
		}
		System.out.println(count);

		
	}
}