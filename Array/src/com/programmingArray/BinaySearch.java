package com.programmingArray;

import java.util.Arrays;
import java.util.Scanner;

public class BinaySearch {
	public static void binarySearch(int[] arr,int k) {
		Arrays.sort(arr);
		int l=0;
		int ind=-1;
		boolean isPresent=false;
		int e=arr.length-1;
		while(l<=e) {
			int mid=(l+e)/2;
			if(arr[mid]==k) {
				ind=mid;
				isPresent=true;
				break;
			}
				
			   
			else if(arr[mid]>k)
				l=mid+1;
			else
				e=mid-1;
				
		}
		
		if(isPresent)
			System.out.println("The element is found and present at "+ind);
		else
			System.out.println("Not found");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element that you want to search");
		int k=sc.nextInt();
		binarySearch(arr,k);
		
	}
}
