package bachA;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("read data using next");
		String a=sc.next();
		
		//consume the data
        sc.nextLine();
		
		System.out.println("Read data using nextline");
		String b=sc.nextLine();
		
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
	}

}

