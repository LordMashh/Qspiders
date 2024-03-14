package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BookDriver {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of books");
	int size = sc.nextInt();
	Book []books = new Book[size];
	for (int i = 0; i < books.length; i++) {
		Book b = new Book();
		System.out.println("------Enter book details");
		System.out.println("Enter name of book");
		b.setName(sc.next());
		System.out.println("Enter name of author");
		b.setAuthor(sc.next());
		System.out.println("Enter price of book");
		b.setPrice(sc.nextInt());		
		books[i] = b;
	}
	System.out.println("Before sorting");
	for (int i = 0; i < books.length; i++) {
		Book b = books[i];
		System.out.println("-----Books details are : ");
		System.out.println("Name : "+ b.getName());
		System.out.println("Author : "+ b.getAuthor());
		System.out.println("Price : "+ b.getPrice());
		System.out.println("-------------------------------");
	}
	Arrays.sort(books);
	System.out.println("=========================================");
	System.out.println("After sorting");
	for (int i = 0; i < books.length; i++) {
		Book b = books[i];
		System.out.println("-------Books details are : ");
		System.out.println("Name : "+ b.getName());
		System.out.println("Author : "+ b.getAuthor());
		System.out.println("Price : "+ b.getPrice());
		System.out.println("---------------------------------");
	}
	
}
}
