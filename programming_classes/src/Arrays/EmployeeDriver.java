package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EmployeeDriver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of Emplyees");
	int size = sc.nextInt();
	Employee []emp = new Employee[size];
	for (int i = 0; i < emp.length; i++) {
		Employee e = new Employee();
		System.out.println("------Enter Employee details");
		System.out.println("Enter name of Employee");
		e.setName(sc.next());
		System.out.println("Enter Designation of Employee");
		e.setDesignation(sc.next());
		System.out.println("Enter Salary of Employee");
		e.setSalary(sc.nextInt());		
		emp[i] = e;
	}
	System.out.println("Before sorting");
	for (int i = 0; i < emp.length; i++) {
		Employee e = emp[i];
		System.out.println("-----Employee details are : ");
		System.out.println("Name : "+ e.getName());
		System.out.println("Designation : "+ e.getDesignation());
		System.out.println("Salary : "+ e.getSalary());
		System.out.println("-------------------------------");
	}
	Arrays.sort(emp);
	System.out.println("=========================================");
	System.out.println("After sorting");
	for (int i = 0; i < emp.length; i++) {
		Employee e = emp[i];
		System.out.println("-------Employee details are : ");
		System.out.println("Name : "+ e.getName());
		System.out.println("Designation : "+ e.getDesignation());
		System.out.println("Salary : "+ e.getSalary());
		System.out.println("---------------------------------");
	}
	
}
}
