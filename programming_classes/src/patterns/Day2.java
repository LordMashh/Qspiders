package patterns;

import java.util.Scanner;

public class Day2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number for run the program");
	int n = sc.nextInt();
1
	System.out.println("1st pattern ------");
	int n1 = 2;
	char ch = 'a';
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if(i<=j) {
				if (i % 2 == 0) {
					System.out.print(n1 + " ");
					n1+=2;
				}
				else {
					System.out.print(ch++ + " ");
				}
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	System.out.println("2nd pattern ------");
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if(i+j < n)
				System.out.print("* ");
		}
		System.out.println();
			
	}
	System.out.println("3th pattern ------");
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if(i+j < n)
				System.out.print(j%2 + " ");
		}
		System.out.println();
			
	}
	System.out.println("4th pattern ------");
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if(i+j < n-1)
				System.out.print("  ");
			else
				System.out.print("* ");
		}
		System.out.println();
			
	}
	

	
	
}
}
/*
 * Enter a number for run the program
5
1st pattern ------
2 4 6 8 10 
  a b c d 
    12 14 16 
      e f 
        18 
2nd pattern ------
* * * * * 
* * * * 
* * * 
* * 
* 
3th pattern ------
0 1 0 1 0 
0 1 0 1 
0 1 0 
0 1 
0 
4th pattern ------
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
*/