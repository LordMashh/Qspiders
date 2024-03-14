// Program for finding the cube root of the given number
package bachA;

import java.util.Scanner;

public class CubeRoot {
	public static int findCube(int n) {
		for(int i=1;i<=n/3;i++) {
			if(i*i*i==n) {
				return i;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(findCube(n));
	}

}
