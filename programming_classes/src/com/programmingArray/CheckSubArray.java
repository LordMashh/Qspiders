package com.programmingArray;

// WAJP to check the given array is subArray of the other given array or not
import java.util.Scanner;

public class CheckSubArray {
	
	
	public static boolean checkSubArray(int arr[],int sub[]) {
		for(int i=0;i<sub.length;i++) {
			int flag=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==sub[i] ) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int [] arr=new int[n];
	    System.out.println("Enter the element of the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the size of subarray");
		int n1=sc.nextInt();
		int [] sub=new int[n1];	
		
		System.out.println("Enter the element of subarray");
		for(int i=0;i<n1;i++) {
			sub[i]=sc.nextInt();
		}
		
		if(checkSubArray(arr,sub)) {
			System.out.println("The array is the sub array");
		}
		else {
			System.out.println("NOt a sub array");
		}
		}
	
	
}

