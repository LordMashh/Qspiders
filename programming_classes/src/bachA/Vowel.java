package bachA;

import java.util.Scanner;

public class Vowel {
	
	
	//design a method to return ascii value of given character
	public static int asciiValue(char c) {
		return c;
	}
	
	
	//this will also work beacuse arguement char is going to convert into int while accepting the arguement
	public static int ascII2(int c) {
		return c;
	}
	
	
	
	//program for checking the vowels
	public static boolean checkingVowels(char c) {
		boolean check=false;
		switch(c) {
		case 'a':
			check=true;
			break;
		case 'e':
			check=true;
			break;
		case 'i':
			check=true;
			break;
		case 'o':
			check=true;
			break;
		case 'u':
			check=true;
			break;	
			
		}
		
		return check;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
//		if(checkingVowels(ch)==true)
//				System.out.println("Given character is vowels");
//		else
//			System.out.println("Given character is not vowels");
		
		System.out.println(asciiValue(ch));
		
		
	}
	

}








