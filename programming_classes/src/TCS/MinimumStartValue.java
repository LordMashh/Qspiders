package TCS;
import java.util.Scanner;

public class MinimumStartValue {
    
    public static int minStartValue(int[] nums) {
        int minStart = 1;
        int currentSum = 0;
        
        for (int num : nums) {
            currentSum += num;
            if (currentSum < 1) {
                minStart += Math.abs(currentSum) + 1;
                currentSum = 1;
            }
        }
        
        return minStart;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of levels:");
        int n = scanner.nextInt();
        
        int[] coins = new int[n];
        System.out.println("Enter the coins required for each level:");
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        
        int minStartValue = minStartValue(coins);
        System.out.println("Minimum start value required: " + minStartValue);
        
        scanner.close();
    }
}

