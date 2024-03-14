// Program for finding the palindrome
package bachA;

import java.util.Scanner;

public class Palindrom {
	public static int chekPolindrome(int n) {
		int rev=0;
		int m=n;
		while(m!=0) {
			int lastDigit=m%10;
			rev=rev*10+lastDigit;
			m/=10;
		}
		return rev;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(chekPolindrome(n)==n) {
			
				System.out.println("The given number is polindrome");
		}
		else {
				System.out.println("The given number is not polindrome");
			}
		
		
	}

}

//Write a program 
