package bachA;
/*
 * wajp to check weather the given number is buzz or not
 * 
 * A number is buzz number if it is divisible by 7 or the last digit of the number is 7 then that number is said to be buzz number
 */
import java.util.Scanner;

public class BuzzNumber {
	public static boolean checkBuzz(int n) {
		int m=n;
		int lastDigit=m%10;
		if(lastDigit==7 || n%7==0) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(checkBuzz(n))
			System.out.println(n+" is a buzz number");
		else
			System.out.println(n+" is not a buzz");
	}

}

