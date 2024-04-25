package com.programmingArray;

import java.util.Scanner;

public class MinElement {
	
	public static int findMin(int[] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min)
				min=arr[i];
		}
		return min;
	}
	
	public static int secondMinElement(int[] arr) {
		int firstSmall=arr[0];
		int secondSmall=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<firstSmall) {
				secondSmall=firstSmall;
				firstSmall=arr[i];
			}
			if(arr[i]<secondSmall && arr[i]!=firstSmall)
				secondSmall=arr[i];
		}
		return secondSmall;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("The smallest number is::"+findMin(arr));
		System.out.println("The smallest number is::"+secondMinElement(arr));
		
	}

}
