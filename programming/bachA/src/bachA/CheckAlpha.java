package bachA;
//Write a java program to check given character is alphabet or digit or special character

import java.util.Scanner;

public class CheckAlpha {
	
	public static String check(char c) {
		if((c>='A' && c<='Z') || (c>='a' && c<='z')) {
			return "Alphabet";
		}
		else if(c>='0' && c<='9') {
			return "Number";
		}else {
			return "Special Character";
		}
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		
		System.out.println(check(ch));
	}

}


