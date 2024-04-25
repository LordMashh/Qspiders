package TCS;

import java.util.Scanner;

public class Session2_Liftproblem {
	public static void main(String[] args) {
		System.out.println("Welcome to lift problem");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Test cases : ");
		int test = sc.nextInt();
		lift(test);

	}

	public static void lift(int test) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The total floor : ");
		int max = sc.nextInt(); // 7
		int min = 1; //3\
		int x =Math.abs(min - max);
		System.out.println("This is max " + x);
		for (int i = 0; i < test; i++) {
			System.out.println("Enter The call floor : ");
			int initial = sc.nextInt();
			if (initial - min < max - initial || initial - min == max - initial) {
				min = initial;
				System.out.println("lift A will come ");
			} else {
				max = initial;
				System.out.println("lift B will come ");
			}

			System.out.println("End of case : " + i);
		}
	}
}
