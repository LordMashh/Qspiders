package com.programmingArray;

import java.util.Scanner;
// WAJP to find the repeated element in an array

public class Frequency {
	
	public static void frequency(int[] arr) {
		
		
	    for(int i=0;i<arr.length;i++) {
	    	int count=1;
	    	for(int j=i+1;j<arr.length;j++) {
	    		if(arr[i]==arr[j]) {
	    			count++;
	    			arr[j]=Integer.MAX_VALUE;
	    		}
	    		
	    		
	    	}
	    	
	    	if(arr[i]!=Integer.MAX_VALUE) {
	    		System.out.println(arr[i]+"      :      "+count);
	    	}
	    	
	    }
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Element : Fequency");
		frequency(arr);
		
	}

}
