
//wajp to check perfect number
/*
 * A perfect number is a number that is equal to the sum of the factor of that number except that number itself
 */
package bachA;

import java.util.Scanner;

public class Perfect {
	public static int checkPerfect(int n) {
		int sum=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(checkPerfect(n)==n) {
			System.out.println("The given number is perfect");
		}else {
			System.out.println("The given number is not a perfect number");
		}
		
	}

}

//Assignment 
/*
 * Write a java program to find product of factor 
 * trace perfect no 6
 * tracing for reverse number
 * 
*/
