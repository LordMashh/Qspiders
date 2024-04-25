package TCS;
public class MinimumOccurrence {
    
    public static char minOccurrence(String str) {
        int[] count = new int[128]; // Assuming ASCII characters
        // Count occurrences of each character in the string
        for (char c : str.toCharArray()) {
        	System.out.println(c + " " + count[c]);
            count[c]++;
        }
      
        
        // Find the character with the minimum occurrence
        char minChar = 0;
        int minCount = Integer.MAX_VALUE;
        for (char c = 0; c < count.length; c++) {
            if (count[c] > 0 && count[c] < minCount) {
            	System.out.print(count[c] + " ");
            	System.out.println();
                minChar = c;
                minCount = count[c];
                System.out.print(minCount + " ");
                System.out.println();
            }
        }
        System.out.println(minChar);
        
        return minChar;
    }
    
    public static void main(String[] args) {
        String str = "abbaaavabba"; // Example string
        char minChar = minOccurrence(str);
        System.out.println("Character with minimum occurrence: " + minChar);
    }
}
