// design a method to return ascii value of the given character
// to check whether given char is alphabet digit or spaecial character
package programming_classes;

import java.util.Scanner;

public class Ascii_Value {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character to convert it in its ascii value");
	char ch = sc.next().charAt(0);
//	int res = asci(ch);
//	System.out.println("The Ascii value of " + ch +" is ");
	checker(ch);
	
}
public static int asci(int ch) {
//	int i = ch;
//	System.out.println(ch);
	return ch;
}
public static void checker(char ch) {
	if(ch>= 'a' && ch<= 'z' || ch>= 'A' && ch<= 'Z') {
		if (ch>=97 && ch<=122)
			System.out.println("charcter is character and lowercase");
		else if(ch>=65 && ch<=90)
			System.out.println("character is character and uppercase");
	}else if(ch>= 48 && ch <= 62) {
		System.out.println("character is a number");
		
	}else {
		System.out.println("it is a special character");
	}
}
}