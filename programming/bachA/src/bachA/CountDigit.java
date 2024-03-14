//write a java program to count the digit of a given number
package bachA;
import java.util.Scanner;



public class CountDigit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int count=0;
		while(n!=0) {
			count++;
			n/=10;
		}
		
//		for(int i=n;i>0;i/=10) {
//			
//			count++;
//		}
		
		System.out.println(count);
	}

}
