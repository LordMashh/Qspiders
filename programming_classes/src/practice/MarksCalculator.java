// WAJP to take 5 subjects marks and calculate total marks and percentage obtained, if total marks is 500
package practice;

import java.util.Scanner;

public class MarksCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of 1st Subject");
		double m1 = sc.nextDouble();
		System.out.println("Enter Marks of 2nd Subject");
		double m2 = sc.nextDouble();
		System.out.println("Enter Marks of 3rd Subject");
		double m3 = sc.nextDouble();
		System.out.println("Enter Marks of 4th Subject");
		double m4 = sc.nextDouble();
		System.out.println("Enter Marks of 5th Subject");
		double m5 = sc.nextDouble();
		
		double total = m1+m2+m3+m4+m5;
		System.out.println("Total Marks are "+total);
		
		double percentage = total / 500 * 100 ;
		System.out.println("Precentage is "+percentage);
		
	}
}
