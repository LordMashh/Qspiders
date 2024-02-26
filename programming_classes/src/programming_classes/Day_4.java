package programming_classes;

import java.util.Scanner;

public class Day_4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number of run the program");
	int n = sc.nextInt();
	armstrong(n);
	
	int init = sc.nextInt();
	int fin = sc.nextInt();
	armstrongchecker(init,fin);
}

// 22. WAJP to check whether the given number is armstrong number or not(in an number the sum of each digits whose power is raise to the number of digits in a number should be equal to the original number means 370 = 3^3 + 7^3 + 0^3 == 27+343=370 )
public static void armstrong(int n) {
	int n1 = n;
	int temp = n;
	int count = 0;
	while( n != 0) {
		n = n/10;
		++count;	
		}
	int sum = 0;
	while(temp!= 0 ) {
		int digit = temp%10;
		int power =1;
		for (int i = 1; i <= count; i++) {
			power *= digit;
		}
		sum += power;
		temp = temp/10;
	}
//	System.out.println(sum);
	if(sum == n1)
		System.out.println(n1+" is an armstrong number");
	else

		System.out.println(n1+" is not an armstrong number");
	
}

	// 23. WAJP to print armstrong number within the range.
	public static void armstrongchecker(int init, int fin) {
System.out.print("The armstrong number between "+init + " and " + fin+ " is ");
		for (int j = init; j <= fin; j++) {
			int n = j;
			int temp = n;
			int temp1 = n;
			int count = 0;
			while( n != 0) {
				n = n/10;
				++count;	
				}
			int sum = 0;
			while(temp!= 0 ) {
				int digit = temp%10;
				int power =1;
				for (int i = 1; i <= count; i++) {
					power *= digit;
				}
				sum += power;
				temp = temp/10;
			}
//			System.out.println(sum);
			if(sum == temp1)
				System.out.print(+temp1+" ");

		}
		System.out.println();
	}
}