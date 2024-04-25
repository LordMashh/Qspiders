package TCS;

public class MaximumToys {
    
    public static int maxToys(int[] prices, int money) {
        int maxToys = 0;
        int currentSum = 0;
        int start = 0;
        
        for (int end = 0; end < prices.length; end++) {
            currentSum += prices[end];
            
            // Shrink the window until the current sum is greater than the budget
            while (currentSum > money) {
                currentSum -= prices[start];
                start++;
            }
            
            // Update the maximum number of toys if the current window size is greater
            maxToys = Math.max(maxToys, end - start + 1);
        }
        
        return maxToys;
    }

    public static void main(String[] args) {
        int[] prices = {1, 4, 5, 3, 2, 1, 6};
        int money = 6;
        
        int maxToys = maxToys(prices, money);
        System.out.println("Maximum number of toys that can be purchased: " + maxToys);
    }
}

