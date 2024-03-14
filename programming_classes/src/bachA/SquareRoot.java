package bachA;

import java.util.Scanner;
//Program for finding the squareroot of the given number
public class SquareRoot {
	public static int findSquareRoot(int n) {
		for(int i=1;i<=n/2;i++) {
			if(i*i==n) {
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int ans=findSquareRoot(n);
		if(ans!=0) {
			System.out.println("The square root of the given number is::"+ans);
		}else {
			System.out.println("Please enter value which are perfect square to find the square root");
		}
				
	}

}

//trace armstrong number program for 407
/*
 * write a java program to print cuberoot of the given number
 */
 
