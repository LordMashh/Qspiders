package com.programmingArray;

import java.util.Scanner;

public class LinearSearch {
	
	
//	only checking the element is present or not
	public static void isPresent(int[] arr,int k) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k)
				flag=true;
			break;
		}
		
		if(flag)
			System.out.println("The element is present");
		else
			System.out.println("The element is not present");
	}
	
//	returning the index of the found element
	public static int find(int[] arr,int k) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==k) {
				return i;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to search");
		int k=sc.nextInt();
		
//		int ind=find(arr,k);
//		if(ind>=0) {
//			System.out.println("The element is present at index "+ind);
//		}else {
//			System.out.println("The element is not in the array");
//		}
		
		isPresent(arr,k);
		
	}
}
