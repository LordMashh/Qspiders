// given char belong to vowel or not using switch case

package programming_classes;

import java.util.Scanner;

public class VowelOrNot {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character to check whether it is vowel or not");
	char ch = sc.next().charAt(0);
	vowel(ch);
	
}
public static void vowel(char ch) {
	switch(ch) {
	case 'a' :
		System.out.println("vowel");
		break;
	case 'e' :
		System.out.println("vowel");
		break;
	case 'i' :
		System.out.println("vowel");
		break;
	case 'o' :
		System.out.println("vowel");
		break;
	case 'u' :
		System.out.println("vowel");
		break;
		default :
			System.out.println("not a vowel");
			break;
		
	}
}
}
