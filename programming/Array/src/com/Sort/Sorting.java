package com.Sort;

import java.util.Scanner;

 /* 
 * Sorting:
 * Sorting is nothing but arranging the element of an array either in ascending or descending order
 * To sort element of an array in java we have different types of technique like
 * 1)Bubble Sort
 * 2)Selection Sort
 * 3)Insertion Sort
 * 4)MergeSort
 * 5)Quick Sort
 * etc.
 * 
 * 1)Bubble Sort:
 * In an array is having n number of element bubble sort technique take n-1 no of passses to sort the array
 * In each passes the largest element of an array swaps continuosly until it moves to desired or required position
 * The swapping of element is done by comparing adjacent elements of an array if an element is larger than next element then it will swap and move the controller to the next position
 * If not it will just move the pointer to the next position
 * 
 * 
 * 
 * Selection Sort:
 * If an array is having n number of element selection sort will take n-1 no. of passes
 * -> IN selection sort we will select smallest element first by comparing element present inside position with all the element
 *    if any element which is smaller  the element is present inside position then smallest element's index
 *    will be store inside position
 * -> If position is changed during the execution of passes then later we need to swap the element if position is not changed
 *    that means array is sorted
 * 
 */

public class Sorting {
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			int pos=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[pos]>arr[j]) {
					pos=j;
				}
			}
			
			if(pos!=i) {
				int temp=arr[i];
				arr[i]=arr[pos];
				arr[pos]=temp;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		bubbleSort(arr);
		selectionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
