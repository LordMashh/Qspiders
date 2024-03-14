package bachA;

import java.util.Scanner;

// write a java program to check the given number is sunny or not
// a number is sunny number if the next number comes after the given number is perfect square
public class SunnyNumber {
	public static boolean checkSunny(int n) {
		int m=n+1;
		for(int i=1;i<=m/2;i++) {
			if(i*i==m) {
				return true;
			}
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(checkSunny(n)) {
			System.out.println("The given number is sunny number");
		}else {
			System.out.println("Not a sunny number");
		}
	}

}
