package com.programmingArray;

import java.util.Scanner;

public class RemoveDuplicateFromArray {
	public static void removeDuplicate(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=Integer.MAX_VALUE;	
				}
				
				
			}
			
			if(arr[i]!=Integer.MAX_VALUE) {
				System.out.print(arr[i]+" ");
			}
			
		}
	}
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the length of the array");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the element of the array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("After removing duplicated element we get");
	removeDuplicate(arr);
	
	
}

}
