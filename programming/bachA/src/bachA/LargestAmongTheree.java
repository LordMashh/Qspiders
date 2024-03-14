package bachA;
//Write a java program to print largest of 3 number using conditional operator

import java.util.Scanner;

public class LargestAmongTheree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		int ans=(a>b?(a>c?a:c):(b>c?b:c));
		System.out.println(ans);
	}

}

