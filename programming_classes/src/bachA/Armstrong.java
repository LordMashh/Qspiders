package bachA;

import java.util.Scanner;

/*Program for armstrong number
 * In a number the sum of each digit whose power is raised to the number of digit in a number should be equal to original number
 */

public class Armstrong {
	public static boolean isArmstrom(int n) {
		int m=n;
		int sum=0;
		int count=0;
		
		//counting the digit
		while(m!=0) {
			count++;
			m/=10;
			
		}
		
		
		m=n;
		
//		taking the power and sum of the power
		while(m!=0) {
			int digit=m%10;
			int power=1;
			for(int i=0;i<count;i++) {
				power*=digit;
			}
			sum+=power;
			m/=10;
			
		}
		if(sum==n) {
			return true;
			
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(isArmstrom(n)) {
			System.out.println(n+" is armstorm");
		}else {
			System.out.println("Not a armstorm");
		}
	}

}
