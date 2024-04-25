package TCS;

import java.util.Scanner;

public class Present_Absent {
	public static void main(String[] args) {
		System.out.println("Welcome to present absent");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int stu = sc.nextInt();
		System.out.println("Enter the number of days");
		int days = sc.nextInt();
		sc.nextLine();

		String data[];
		if ((stu >= 1 && stu <= 10) && (days >= 1 && days <= 31)) {
			data = new String[days];
			for (int i = 0; i < days; i++)
				data[i] = sc.nextLine();
			System.out.println(consecutive(data));
		}
		System.out.println("----------------");
	}

	public static int consecutive(String[] data) {
		int max = 0;
		int count = 0;
		for (String s : data) {
			if (!s.contains("A"))
				count++;
			else {
				if (count > max)
					max = count;
				count = 0;

			}
		}
		if (count > max)
			max = count;
		return max;

	}
}
