package bachA;

import java.util.Scanner;

public class PrintArmstrong {
	public static void printArmstrong(int start,int end) {
		for(int i=start;i<=end;i++) {
			//count digit;
			int countDigit=0;
			int m=i;
			while(m!=0) {
				countDigit++;
				m/=10;
			}
			m=i;
			int sum=0;
			while(m!=0) {
				int digit=m%10;
				int power=1;
				for(int j=0;j<countDigit;j++) {
					power*=digit;
				}
				sum+=power;
				m/=10;
			}
			
			if(sum==i) {
				System.out.print(i+" ");
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int fin=sc.nextInt();
		printArmstrong(start,fin);
		
	}

}

