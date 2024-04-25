// WAJP to check whether given year is leap year or not
package practice;

import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a leap year to check ");
	int year = sc.nextInt();
	
	System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "It is a leap year" : "It is not a leap year");
}
}
