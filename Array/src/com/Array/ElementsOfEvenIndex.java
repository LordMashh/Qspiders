package com.Array;

import java.util.Scanner;
//Wajp to print 
public class ElementsOfEvenIndex {
	
	public static void reverse(int[] arr) {
		int [] temp=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			temp[j++]=arr[i];
		}
		
		for(int i=0;i<temp.length;i++) {
			System.out.print(temp[i]+" ");
		}
	}
	
	public static int [] tempArray(int [] arr)
	{
		int[] temp=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		return temp;
	}
	
	public static int sum(int[] arr) {
		int ans=0;
		for(int i=0;i<arr.length;i++) {
			ans+=arr[i];
		}
		return ans;
	}
	
	public static int avg(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum/arr.length;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
//		for(int i=0;i<n;i++) {
//			if(i%2==0) {
//				System.out.print(arr[i]+" ");
//			}
//		}
		
//		int[] arr2=tempArray(arr);
//		for(int i=0;i<arr2.length;i++) {
//			System.out.print(arr2[i]+" ");
//		}
//		
		
//		System.out.println("The sum of the array is "+sum(arr));
//		System.out.println("The sum of the array is "+avg(arr));
		reverse(arr);
	}
	
  

}
