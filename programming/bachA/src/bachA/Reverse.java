package bachA;

import java.util.Scanner;

public class Reverse {
	//wajp to reverse a given number
	
	public static int reverse(int n) {
		int ans=0;
		while(n!=0) {
			int lastDigit=n%10;
			ans=ans*10+lastDigit;
			n/=10;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(reverse(n));

		
//		if(check(n)) {
//			System.out.println("The starting digit is even");
//		}else {
//			System.out.println("The starting digit is odd");
//		}
	}

}
