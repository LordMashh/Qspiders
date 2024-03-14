package bachA;

import java.util.Scanner;

public class PrintPrime {
	
	public static void printPrime(int init,int fin) {
		for(int i=init;i<=fin;i++) {
			if(i==1)
				continue;
			boolean isPrime=true;
			for(int j=2;j<i/2;j++) {
				if(i%j==0) {
					
					isPrime=false;
					break;
				}
					
			}
			if(isPrime) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter initial value");
		int in=sc.nextInt();
		System.out.println("Enter end value");
		int fin=sc.nextInt();
		
		System.out.println("Prime numbers");
		printPrime(in,fin);
	}

}



//trace prime number 23
// trace strong program for 145

