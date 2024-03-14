package bachA;

//WAJP to check weather given or not without using modulo operator
import java.util.Scanner;

public class CheckEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
//		other method best method
//		if((n&1)==0) {
//			System.out.println("Even");
//		}else {
//			System.out.println("Odd");
//		}
		
		if(n/2*2==n) {
			System.out.println("Even");
		}else {
			System.out.println("Odd");
		}
	}

}


