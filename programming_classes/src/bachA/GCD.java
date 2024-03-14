/*
 * Write a program to find gcd of the given number
 */
package bachA;

import java.util.Scanner;

public class GCD {
	
	public static int gcd(int a,int b) {
		int ans=0;
		for(int i=1;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				ans=i;
			}
		}
		
		return ans;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The gcd of the given numbe is::"+gcd(a,b));
		
	}

}
