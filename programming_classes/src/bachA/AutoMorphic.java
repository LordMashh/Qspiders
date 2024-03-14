package bachA;
/*
 * A number is said to be automorphic number if the square of the number is ending with the number itself
 */

import java.util.Scanner;

public class AutoMorphic {
	
//	other method
	public static boolean checkAutoMorphic2(int n) {
		int square=n*n;
		while(n!=0 && square!=0) {
			int squareDigit=square%10;
			int nDigit=n%10;
			if(nDigit!=squareDigit) {
				return false;
			}
			square/=10;
			n/=10;
			
		}
		return true;
	}
	
	
//	My method
	public static boolean checkAutoMorphic(int n) {
		int sq=n*n;
		int temp=0;
		int m=n;
		int count=0;
		int count2=0;
		while(m!=0) {
			count++;
			m/=10;
		}
		while(sq!=0) {
			int rem=sq%10;
			temp=temp*10+rem;
			count2++;
			if(count==count2)
				break;
			sq/=10;
		}
		
		int actual=0;
		while(temp!=0) {
			int rem=temp%10;
			actual=actual*10+rem;
			temp/=10;
		}
		if(actual==n)
			return true;
		return false;
		
	}
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(checkAutoMorphic2(n)) {
			System.out.println(n+" is isomorphic");
		}else {
			System.out.println(n+"is not isomorphic");
		}
	}

}
