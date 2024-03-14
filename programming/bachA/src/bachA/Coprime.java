/*
 * Write a program to to check the given number is gcd or not
 */
package bachA;

import java.util.Scanner;

public class Coprime {
	
	public static boolean isCoprime(int a,int b) {
		int ans=0;
		for(int i=2;i<=a && i<=b;i++) {
			if(a%i==0 && b%i==0) {
				return false;
			}
		}
		
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		if(isCoprime(a,b))
			System.out.println("The given numbers are coprime");
		else
			System.out.println("The given numbers are not coprime");
		
	}

}

