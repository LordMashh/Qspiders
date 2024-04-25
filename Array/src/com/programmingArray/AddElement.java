package com.programmingArray;

import java.util.Scanner;

public class AddElement {
	
	public static int[] addElement(int[] arr,int ind,int ele) {
		int[] result=new int[arr.length+1];
		
		int j=0;
		for(int i=0;i<result.length;i++) {
			if(i==ind) {
				result[i]=ele;
				
			}else {
				result[i]=arr[j++];
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
		
		System.out.println("enter the index");
		int ind=sc.nextInt();
		System.out.println("Enter the elmeent");
		int ele=sc.nextInt();
		
		int[] ans=addElement(arr,ind,ele);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
