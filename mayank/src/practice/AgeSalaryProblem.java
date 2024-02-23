// else if problem 
package practice;

import java.util.Scanner;

public class AgeSalaryProblem {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your age: ");
	int age = sc.nextInt();
	System.out.println("Enter your salary: ");
	int salary = sc.nextInt();
	
	if(age > 40) {
		if(salary >= 30000)
			System.out.println("You are Rich and Adult");
		else
			System.out.println("You are an adult");
	}
	else if(age <= 40) {
		if(salary >= 12000)
			System.out.println("You are Rich and Young");
		else
			System.out.println("You are young");
	}
		
}
}
