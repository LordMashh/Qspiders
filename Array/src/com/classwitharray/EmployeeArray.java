package com.classwitharray;

import java.util.Scanner;

public class EmployeeArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		Employee [] employees=new Employee[n];
		
		
		for(int i=0;i<employees.length;i++) {
			Employee e=new Employee();
		
			System.out.println("Enter the name of employee:"+i);
			e.setName(sc.next());
			System.out.println("Enter the Eid of employee"+i);
			e.setEid(sc.nextInt());
			employees[i]=e;
		}
		System.out.println("Printing the details of the employee");
		for(int i=0;i<employees.length;i++) {
			Employee e=employees[i];
			System.out.println("Employee:"+i);
			System.out.println("Eid:"+e.getEid());
			System.out.println("Name:"+e.getName());
			System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		}
	}

}
