package bachA;

import java.util.Scanner;

public class CompositCheck {
	public static boolean checkComposit(int n) {
		
		for(int i=2;i<n/2;i++) {
			if(n%i ==0) {
				return false;	
			}
			
		}
		return true;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(checkComposit(n)) {
			System.out.println(n+" is not composit number");
		}else {
			System.out.println(n+" is a composit number");
		}
		
	}

}
