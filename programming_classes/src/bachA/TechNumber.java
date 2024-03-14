/*
 * WAJP to check weather the given number is tech number or not
 * explaination:
 * example 2025-> 20+25=> 45*45=2025
 * 
 */
package bachA;

import java.util.Scanner;

public class TechNumber {
	
	public static boolean checkTech(int n) {
		int count=0;
	    int m=n;
	    while(m!=0) {
	    	count++;
	    	m/=10;
	    }
	    
	    //if no. of digit are odd
	    if(count%2!=0) {
	    	return false;
	    }
	    
	    int a=1;
	    for(int i=1;i<=
	    		count/2;i++) {
	    	a*=10;
	    }
	    
	    int last=n%a;
	    int first=n/a;
	    int sum=first+last;
	    if((sum*sum)==n) {
	    	return true;
	    }else {
	    	return false;
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(checkTech(n)) {
			System.out.println(n+" is tech number");
		}else {
			System.out.println(n+" NOt a tech number");
		}
	}
	

}
