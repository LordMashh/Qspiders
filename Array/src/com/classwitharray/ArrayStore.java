package com.classwitharray;

import java.util.Scanner;

public class ArrayStore {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		Students[] student=new Students[n];
		
		System.out.println("Details of the students");
		for(int i=0;i<n;i++) {
			System.out.println("Enter the name of the student");
			String name=sc.next();
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the address of the student");
			sc.nextLine();
			String add=sc.nextLine();
			
			Students s=new Students(name,id,add);
			student[i]=s;
			
		}
		
		
		System.out.println("Printing the details of the students");
		for(int i=0;i<student.length;i++) {
			Students s=student[i];
			
			System.out.println("Name: "+s.getName());
			System.out.println("Age"+s.getAge());
			System.out.println("Address"+s.getAdd());
			System.out.println("+++++++++++++++++++");
			
		}
		
	}
}
