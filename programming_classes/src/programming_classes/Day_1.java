//
package programming_classes;

import java.util.Scanner;

public class Day_1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the data using next");
	String a = sc.next();
	// to consume the data
	sc.nextLine();
	System.out.println("read the data using nextline");
	//to read the data
	String b = sc.nextLine();
	
	System.out.println("a : " + a);
	System.out.println("b : " + b);
}
}