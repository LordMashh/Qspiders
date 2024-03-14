package bachA;
/*
 * Write a java program to check wether the given number is neon or not
 * A neon number is a number after squaring and then summing all the digit the number we get is equal to the given number.
 */
import java.util.Scanner;

public class Neon {
	public static boolean isNeon(int n) {
		int sq=n*n;
		int sum=0;
		while(sq!=0) {
			int rem=sq%10;
			sum+=rem;
			sq/=10;
			
		}
		if(sum==n) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isNeon(n)) {
			System.out.println(n+" is a neon number");
		}
		else {
			System.out.println(n+" is not a neon number");
		}
		
		
	}

}
