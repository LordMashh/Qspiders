package com.programmingArray;

import java.util.Scanner;

public class PairElement {
	
	public static int[] findPair(int[] arr,int sum) {
		int [] result=new int[2];
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==sum) {
					result[0]=arr[i];
					result[1]=arr[j];
					break;
				}
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
		
		System.out.println("Enter the sum that you want to find");
		int sum=sc.nextInt();
		
		int[] ans=findPair(arr,sum);
		for(int i=0;i<ans.length;i++) {
			
			if(i==0)
			System.out.print(ans[i]+"+");
			else
				System.out.println(ans[i]+"="+sum);
		}
		}
}
