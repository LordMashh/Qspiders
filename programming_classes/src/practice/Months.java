// WAJP to write the month of given input month number
package practice;

import java.util.Scanner;

public class Months {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of month : ");
		int i = sc.nextInt();
	    if (i==1)
	    System.out.println("Answer is : January");
	    else if(i==2)
	    System.out.println("Answer is : Februrary");
	    else if(i==3)
	    System.out.println("Answer is : march");
	    else if(i==4)
	    System.out.println("Answer is : april");
	    else if(i==5)
	    System.out.println("Answer is : may");
	    else if(i==6)
	    System.out.println("Answer is : june");
	    else if(i==7)
	    System.out.println("Answer is : july");
	    else if(i==8)
	    System.out.println("Answer is : August");
	    else if(i==9)
	    System.out.println("Answer is : september");
	    else if(i==10)
	    System.out.println("Answer is : october");
	    else if(i==11)
	    System.out.println("Answer is : november");
	    else 
	    System.out.println("Answer is : december");
		
		
	}
}
