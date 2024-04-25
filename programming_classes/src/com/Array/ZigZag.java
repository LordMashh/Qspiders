package com.Array;

import java.util.Iterator;
import java.util.Scanner;

public class ZigZag {
	

	
	public static int[] zigZagMerge(int[] arr1,int[] arr2) {

		int result[]=new int[arr1.length+arr2.length];
		
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			result[k++]=arr1[i++];
			result[k++]=arr2[j++];
		}
		
		while(i<arr1.length) {
			result[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			result[k++]=arr2[j++];
		}
		
		return result;
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int arr1[] =new int[n1];
		int arr2[]=new int[n2];
		for(int i=0;i<n1;i++) {
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<n2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		int ans[]=zigZagMerge(arr1,arr2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
			
		}
		

	}

}
