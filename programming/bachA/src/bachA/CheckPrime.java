package bachA;

import java.util.Scanner;

public class CheckPrime {
	public static boolean CheckPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
	
		
		
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(CheckPrime(n)) {
			System.out.println(n+" is prime");
		}else {
			System.out.println(n+" is not a prime");
		}
	}
}
