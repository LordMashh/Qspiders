package com.programmingArray;

import java.util.Scanner;
// Write a java program to find the maximum sum from an array

public class KadaneAlgorithm {
	
	public static int findSum(int[] arr) {
		int sum=0;
		int maxSum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			if(sum>maxSum)
				maxSum=sum;
			if(sum<0) {
				sum=0;
			}
		}
		
		return maxSum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(findSum(arr));
		
		
		
		
	}
}
