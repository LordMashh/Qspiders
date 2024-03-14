package com.programmingArray;

import java.util.Scanner;

// WAJP to remove the element from the given element
public class RemoveElement {
	public static int[] removeElement(int[] arr,int ind) {
		int[] result=new int[arr.length-1];
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(i==ind) {
				continue;
				
			}else {
				result[j++]=arr[i];
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
		
		
		int[] ans=removeElement(arr,ind);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		
	}

}
