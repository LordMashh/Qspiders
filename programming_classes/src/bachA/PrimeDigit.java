package bachA;

import java.util.Scanner;

public class PrimeDigit {
	public static void printPrime(int n) {
		
		while(n!=0) {
			boolean isPrime=true;
			int rem=n%10;
			for(int i=2;i<=rem/2;i++) {
				if(rem%i==0) {
					isPrime=false;
					break;
				}
			}
			
			if(isPrime&&rem!=1) {
				System.out.print(rem+" ");
			}
			n/=10;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPrime(n);
	}

}

// trace tech number program for 3025
