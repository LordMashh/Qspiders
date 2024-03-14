package bachA;

import java.util.Scanner;

public class SumDigit {
	
//	Program for finding  product of given digit
	public static int Product(int n) {
		int product=1;
		while(n!=0) {
			int digit=n%10;
			product*=digit;
			n/=10;
		}
		return product;
	}
//	Program for fingding the sum of given digit
	public static int sum(int n) {
		int ans=0;
		while(n!=0) {
			int digit=n%10;
			ans+=digit;
			n/=10;
			
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Sum is "+sum(n));
		System.out.println("Product is "+Product(n));
	}
	

}
