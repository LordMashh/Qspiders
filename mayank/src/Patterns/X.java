package Patterns;

import java.util.Scanner;

public class X {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(" Enter a number for pattern");
	int n = sc.nextInt();
	for (int row = 1; row <= n; row++) {
        for (int col = 1; col <= n; col++) {
            if (col == row ||  col+row == n+1 ) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
}