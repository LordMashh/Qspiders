package bachA;


//Program for checking the starting digit is even or odd
import java.util.Scanner;

public class CheckLast {
	
	public static boolean check(int n) {
		
		
		while(n>9) {
			n=n/10;	
		}
		
		if(n%2==0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		
		if(check(n)) {
			System.out.println("The starting digit is even");
		}else {
			System.out.println("The starting digit is odd");
		}
	}
}


