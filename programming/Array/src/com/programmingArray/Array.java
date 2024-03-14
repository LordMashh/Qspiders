package com.programmingArray;

import java.util.Scanner;

// Wap to store to store element inside array dynamically
public class Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements are");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
