package bachA;

import java.util.Scanner;

public class LargestNumInDigit {
	
	public static int findMin(int n) {
		int min=Integer.MAX_VALUE;
		while(n!=0) {
			int rem=n%10;
			if(rem<min)
				min=rem;
			n/=10;
		}
		
		return min;
	}
	
	public static int findLargest(int n) {
		int max=Integer.MIN_VALUE;
		while(n!=0) {
			int rem=n%10;
			if(rem>max) {
				max=rem;
			}
			n/=10;
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The largest digit is "+findLargest(n));
		System.out.println("The largest digit is "+findMin(n));
	}

}
