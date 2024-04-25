package com.Array;

import java.util.Scanner;

public class Demo {
	
	
	//Program for deleting the element with index
	
	public static int[] delete(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element that you want to delete");
		int indx=sc.nextInt();
		
		if(indx>=0 && indx<arr.length) {
			int[] result=new int[arr.length-1];
			for(int i=0;i<arr.length-1;i++) {
				if(i<indx) {
					result[i]=arr[i];
				}
				else {
					result[i]=arr[i+1];
				}
			}
			
			return result;
			
		}else {
			return arr;
		}
		
		
		
	}
	// Program for updating the array
	
	public static void update(int[] arr) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index that you want to update:");
		int idx=sc.nextInt();
		if(idx>=0 && idx<arr.length) {
		 System.out.println("Enter the element that you want to updated");
		 int ele=sc.nextInt();
		 arr[idx]=ele;
		 
		 System.out.println(ele+" is inserted");
		}else {
			System.out.println("Can't be updated out of index");
		}
	}
	
	//Printing the element of the array
	public static void printEle(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println();
	}
	
	
	//Taking input from the user for array
	public static int [] input() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lenght of the array");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("enter the element");
		for (int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		return arr;
		
	}
	
	//Program to delete the element with respect to taking element
	
	public static int[] delete2(int [] arr, int ele) {
		int[] result=new int[arr.length-1];
		int idx=-1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				idx=i;
			}
		}
		
		if(idx>=0 && idx<arr.length) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<arr[idx]) {
					result[i]=arr[i];
				}else {
					result[i]=arr[i+1];
				}
			}
			
			return result;
			
		}else {
			
			System.out.println("The given element is not present in the array");
			return null;
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//calling the input() mehtod and storing the element in arr
		int arr[]=input();
//		System.out.println("PrintElement");
//		printEle(arr);
//		//updating list
//		update(arr);
		
		
		printEle(arr);
//		arr=delete(arr);
//		printEle(arr);
		
		System.out.println("Enter the element that you want to delete");
		int element=sc.nextInt();
		
	}

}

//Assignment merging two array
