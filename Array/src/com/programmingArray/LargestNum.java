package com.programmingArray;

import java.util.Scanner;

public class LargestNum {
	//largest
	public static int LargestElement(int arr[]) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		
		return max;
	}
	
	
	
	
	public static int secondSmallestElement(int arr[]) {
		int firstMin=Integer.MAX_VALUE;
		int secondMin=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstMin) {
				secondMin=firstMin;
				firstMin=arr[i];
				
			}
			
			if(arr[i]<secondMin && firstMin>arr[i]) {
				secondMin=arr[i];
			}
			
			
			
		}
		
		return secondMin;
	}
	
	
	public static int minElement(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		
		return min;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		System.out.println(secondSmallestElement(arr));
		System.out.println("Largest is "+LargestElement(arr)+" Smallest is: "+minElement(arr));
		
		
	}

}
