package bachA;

import java.util.Scanner;

public class Xylem {
	public static boolean checkXylem(int n) {
		
		int m=n;
		int lastDigit=n%10;
		n=m;
		while(m>9) {
			m/=10;
		}
		int firstDigit=m;
		
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
		}
		
		int sum1=lastDigit+firstDigit;
		sum-=sum1;
		if(sum==sum1) {
		
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(checkXylem(n)) {
			System.out.println("The given number is xylem");
		}else {
			System.out.println("The given number is phloem");
		}
	}

}
