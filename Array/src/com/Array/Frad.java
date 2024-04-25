package com.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class Frad {
	
//	program for fradlent
	
//	printing the element
	public static void printDetails(ArrayList<ArrayList<object>> arr) {
		int n=arr.length;
		
	}
	
	
	public static void main(String[] args) {
		
		
		ArrayList<ArrayList<Object>> arr =new ArrayList<ArrayList<Object>>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			ArrayList<Object> innerArrayList=new ArrayList<>();
			innerArrayList.add(sc.nextInt());
			innerArrayList.add(sc.nextInt());
			innerArrayList.add(sc.nextFloat());
			innerArrayList.add(sc.nextLine());
			innerArrayList.add(sc.nextInt());
			arr.add(innerArrayList);
		}
		
		
		
		
	 
	  
	 
	  
		
	}

}
