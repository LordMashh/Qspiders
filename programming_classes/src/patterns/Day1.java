package patterns;

import java.util.Scanner;

public class Day1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number to print pattern");
	int n = sc.nextInt();
	char ch = 'A';
	char ch2 = 'A';
	char ch1 = 'a';
	
	// 1st pattern
	System.out.println("1st pattern ------");
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if(j<=i) 
				System.out.print("* ");				
		}
		System.out.println();
	}
	// 2nd pattern
	System.out.println("2nd pattern ------");
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if(j<=i) {
			
			if(i % 2 == 0) {
				System.out.print(ch++ + " ");		
			}
			else {
				System.out.print(ch1++  + " ");
			}
			
		}
	}
		System.out.println();
	}
	// 3rd pattern
	System.out.println("3rd pattern -------");
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if(j<=i) 
				System.out.print(j+1 + " ");	
			
		}
		System.out.println();
	}
	// 4th pattern
		System.out.println("4th pattern -------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(j<=i) {
				
				if(i % 2 == 0) {
					System.out.print(ch2 + " ");		
					ch2 ++;	
				}
				else {
					System.out.print((char)(ch2 + 32) + " ");
					ch2++;
				}
				
			}
		}
			System.out.println();
		}
		// 5th pattern
		System.out.println("5th pattern ------");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i<=j) {					
					System.out.print("* ");				
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}



}
	
}
/*
 * 1st pattern ------
* 
* * 
* * * 
* * * * 
* * * * * 
2nd pattern ------
A 
a b 
B C D 
c d e f 
E F G H I 
3rd pattern -------
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
4th pattern -------
A 
b c 
D E F 
g h i j 
K L M N O 
5th pattern ------
* * * * * 
  * * * * 
    * * * 
      * * 
        * 
*/
