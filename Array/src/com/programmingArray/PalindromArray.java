package com.programmingArray;

import java.util.Scanner;
// Write a java program to check the given array is palindrome or not
public class PalindromArray {
	
	public static boolean isPolindrome(int arr[]) {
		int i=0;
		int j=arr.length-1;
		while(i<j) {
			if(arr[i]!=arr[j]) {
				return false;
			}
			i++;
			j--;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		if(isPolindrome(arr)) {
			System.out.println("The given array is polindrome");
		}else {
			System.out.println("Not a polindrome");
		}
		
	}

}
