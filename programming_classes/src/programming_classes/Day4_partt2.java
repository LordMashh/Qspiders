package programming_classes;

import java.util.Scanner;

public class Day4_partt2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to run this program");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		gcd(n1,n2);
	}
	 public static void gcd(int n1, int n2) {
		 int gcd = 0;
		 for (int i = 0; i <= n1 || i <= n2; i++) {
			if (n1%i == 0 && n2%i == 0) {
				gcd = i;
				
			}
		}
		 System.out.println("The GCD of" + n1 + " and " + n2 + " is " + gcd);
	 }
	
}
