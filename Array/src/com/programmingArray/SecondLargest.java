package com.programmingArray;

import java.util.Scanner;

public class SecondLargest {
	
	public static int SecondLargestElement(int arr[]) {
		int maxfirst=arr[0];
		int secondLargest=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxfirst) {
				secondLargest=maxfirst;
				maxfirst=arr[i];
				
			}
			
			if(arr[i]>secondLargest && arr[i]!=maxfirst) {
				secondLargest=arr[i];
			}
			
			
			
		}
		
		return secondLargest;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The second largest element is ::"+SecondLargestElement(arr));
		
		
		
	}
}
