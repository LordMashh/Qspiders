package com.programmingArray;

import java.util.Iterator;
import java.util.Scanner;

public class MergeTwoArray {
	
	public static int[] mergeTwoArray(int [] arr1,int[] arr2) {
		int [] result=new int[arr1.length+arr2.length];
		for(int i=0;i<result.length;i++) {
			if(i<arr1.length) {
				result[i]=arr1[i];
			}else {
				result[i]=arr2[i-arr1.length];
			}
		}
		
		return result;
	}
	
//	merge two array in zigzag
	public static int[] mergeTwoArrayZigzag(int [] arr1,int [] arr2) {
	    int result[]=new int[arr1.length+arr2.length];
	    int i=0;
	    int j=0;
	    int k=0;
	    while(i<arr1.length&& j<arr2.length) {
	    	result[k++]=arr1[i++];
	    	result[k++]=arr2[j++];
	    }
	    
	    while(i<arr1.length) {
	    	result[k++]=arr1[i++];
	    }
	    
	    while(j<arr2.length) {
	    	result[k++]=arr1[j++];
	    }
	    return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		int [] a=new int[n];
		int [] b=new int[m];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<m;i++) {
			b[i]=sc.nextInt();
		}
		
		int[] ans=mergeTwoArray(a,b);
		
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
