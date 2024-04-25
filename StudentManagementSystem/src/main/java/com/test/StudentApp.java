package com.test;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.entity.Collage;
import com.entity.Student;

public class StudentApp {
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
	public static EntityManager em = emf.createEntityManager();
	public static EntityTransaction et = em.getTransaction();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		a: while (true) {
			System.out.println("Press 1 for Add Student");
			System.out.println("Press 5 for Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				add();
				break;
			case 5:
				System.out.println("Have a good day Bye...");
				break a;
			default:
				System.out.println("You had Entered Wrong choice...");
				break;
			}
		}
	}

	public static void add() {
		System.out.println("Enter Student Details : ");
		sc.nextLine();
		System.out.println("Enter Your Name : ");
		String name = sc.nextLine();
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		System.out.println("Enter Mobile Number");
		long mob_no = sc.nextLong();
		
		System.out.println("Enter College Details : ");
		System.out.println("Enter College Name : ");
		sc.nextLine();
		String col = sc.nextLine();
		System.out.println("Enter College Address : ");
		String address = sc.nextLine();
		System.out.println("Enter College University : ");
		String university = sc.nextLine();
		
		Student s = new Student();
		s.setName(name);
		s.setAge(age);
		s.setMob_no(mob_no);
		
		Collage c = new Collage();
		c.setName(col);
		c.setAddress(address);
		c.setUniversity(university);
		
		s.setCollage(c);
		
		et.begin();
		em.persist(c);
		em.persist(s);
		et.commit();

		System.out.println("Student added successfully!");

		
	}

}
