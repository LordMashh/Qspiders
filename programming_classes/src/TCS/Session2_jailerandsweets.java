package TCS;

import java.util.Scanner;

public class Session2_jailerandsweets {
	public static void main(String[] args) {
		System.out.println("Welcome to Jailer problem");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Test cases : ");
		int test = sc.nextInt();
		jailer(test);

	}
	public static void jailer(int test) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < test; i++) {
			System.out.println("Enter the number of prisoner : ");
			int prisoner = sc.nextInt();
			System.out.println("Enter the number of candies");
			int candies = sc.nextInt();
			
			System.out.println("Enter the starting point");
			int startpoint = sc.nextInt();
			
			int answer = (candies + startpoint - 1) % prisoner;
			System.out.println(answer);
			 
		}
	}
}
