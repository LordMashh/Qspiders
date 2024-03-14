/*
 * A strong number is a number which must be equal to the sum of factorial of all digit
 *
 */
package bachA;

import java.util.Scanner;

public class StrongNumber {
	
	
	public static int fact(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans*=i;
		}
		return ans;
	}
	
	
	
    public static boolean checkStrong(int n) {
    	int sum=0;
    	int m=n;
    	while(m!=0) {
    		int rem=m%10;
    		sum+=fact(rem);
    		m/=10;
    	}
    	if(sum==n) {
    		return true;
    	}
    	return false;
    }
    
    
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(checkStrong(n)) {
			System.out.println(n+" Strong");
		}else {
			System.out.println(n+" not a strong number");
		}
		
	}

}
