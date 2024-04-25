package com.Array;

import java.util.Scanner;

public class ShiftZero {
	
//	method-2
	public static void moveZeroToEnd(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				if(i!=j) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
			
		}
		
		
	}
	

	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
//	method-1
	public static int[] moveZeroEnd2(int[] arr) {
		int n=arr.length;
		int[] result=new int[n];
		int j=0;
		for(int i=0;i<n;i++) {
			if(arr[i]!=0) {
				result[j]=arr[i];
				j++;
			}
		}
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		printArray(arr);
		int [] ans=moveZeroEnd2(arr);
		printArray(ans);
		moveZeroToEnd(arr);
		printArray(arr);
		
		
	}

}
