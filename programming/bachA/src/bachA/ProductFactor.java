package bachA;

import java.util.Scanner;

public class ProductFactor {
	
	public static int findFactorPro(int n) {
		int product=1;
		while(n!=0) {
			int digit=n%10;
			product*=digit;
			n/=10;
		}
		return product;
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The product of digit is: "+findFactorPro(n));
	}

}
