package bachA;

import java.util.Scanner;

public class CompositNumPrint {
	
	public static void printComposit(int start, int end) {
		for(int i=start;i<=end;i++) {
			if(i==1)
				continue;
			boolean isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
				
			}
			if(!isPrime) {
				System.out.print(i+" ");
			}
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the start value::");
		int start=sc.nextInt();
		System.out.println("Enter the end value::");
		int end=sc.nextInt();
		printComposit(start,end);
		
	}

}
