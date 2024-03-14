package bachA;

import java.util.Scanner;

public class Fibonacci {
	public static int fibo(int n) {
		int n1=0;
		int n2=1;
		int fibo=0;
		for(int i=1;i<=n;i++) {
			fibo=n1+n2;
			System.out.print(fibo+" ");
			n1=n2;
			n2=fibo;
		}
		
		System.out.println();
		return fibo;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fibo(n));
	}
}
