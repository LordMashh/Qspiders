package com.programmingArray;

import java.util.Scanner;

public class LeftRotation {
	
	public static void leftRotation(int arr[]) {
		
		int first=arr[0];
		int [] temp=new int[arr.length-1];
		
		
		for(int i=0;i<temp.length;i++) {
			temp[i]=arr[i+1];
		}
		
		
		for(int i=0;i<temp.length;i++) {
			arr[i]=temp[i];
		}
		arr[arr.length-1]=first;
			
		
	}
	
public static void rightRotation(int arr[]) {
		
		int last=arr[arr.length-1];
		int [] temp=new int[arr.length-1];
		
		
		for(int i=0;i<arr.length-1;i++) {
			temp[i]=arr[i];
		}
		
		arr[0]=last;
		for(int i=0;i<temp.length;i++) {
			arr[i+1]=temp[i];
		}
		
			
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
//		System.out.println("Left Rotation");
//		leftRotation(arr);
	
		System.out.println("Right Rotation");
		rightRotation(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
