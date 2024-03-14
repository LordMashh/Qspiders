package com.Array;

import java.util.Scanner;

public class MergeTwoArray {
	
	public static int[] mergeTwoArray(int[] arr1,int [] arr2) {
		int n=arr1.length;
		int m=arr2.length;
		int j=0;
		int[] result=new int[m+n];
		for(int i=0;i<m+n;i++) {
			
			if(i<n) {
				result[i]=arr1[i];
			}else {
				result[i]=arr2[i-n];
				j++;
			}
		}
		
		
//		another approach
//		
//		int i=0;
//		for(i=0;i<n;i++) {
//			result[i]=arr1[i];
//		}
//		i=0;
//		for(int j=n;j<m+n;j++) {
//			result[j]=arr2[i];
//			i++;
//		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] arr1=new int[n];
		int [] arr2=new int[m];
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<m;i++) {
			arr2[i]=sc.nextInt();	
		}
		
		int[] ans=mergeTwoArray(arr1,arr2);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}

//assignment zigzag merge
