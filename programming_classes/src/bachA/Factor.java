package bachA;

import java.util.Scanner;

public class Factor {
//	finding the sum of the factor
	public static int sumFactor(int n) {
		int ans=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				ans+=i;
			}
		}
		
		return ans;
	}
//	finding the factor
	public static void factor(int n) {

		for(int i=1;i<=n;i++) {
			if(n%i==0)
				System.out.print(i+" ");			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		factor(n);
		System.out.println();
		System.out.println("Sum of the factor is "+sumFactor(n));
	}

}


