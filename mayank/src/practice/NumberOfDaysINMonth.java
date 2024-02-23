// WAJP to write the days in a month of given input month number
package practice;

import java.util.Scanner;

public class NumberOfDaysINMonth {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of month : ");
	    int i = sc.nextInt();
	    if( i==1 || i==3 || i==5 || i == 7 || i==8 || i==10 || i==12 )  
	    System.out.println("number of days are 31 ");      
	    else if ( i == 2)
	    System.out.println("number of days are 28 or 29 ");      
	    else 
	    System.out.println("number of days are 30 ");   
	}
}
