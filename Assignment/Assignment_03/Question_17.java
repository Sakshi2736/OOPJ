/*17.Write a Java program to find the maximum product of two integers in a given array of
integers.
Example:
Input :
nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
Output:
Pair is (7, 8), Maximum Product: 56*/

public class Question_17 {
    public static void main(String[] args) {
        int nums[] = {2, 3, 5, 7, -7, 5, 8, -5}; // Given array
        
        int max1 = 0, max2 = 0; // Variables to store the two max numbers
        int min1 = 0, min2 = 0; // Variables to store two smallest numbers (for negative cases)

        // Finding the two largest and two smallest numbers
        for (int num : nums) {
            if (num > max1) { 
                max2 = max1; // Shift max1 to max2
                max1 = num;  // Update max1
            } else if (num > max2) { 
                max2 = num;  // Update max2
            }
            
            if (num < min1) { 
                min2 = min1; // Shift min1 to min2
                min1 = num;  // Update min1
            } else if (num < min2) { 
                min2 = num;  // Update min2
            }
        }

        // Compare max1 * max2 and min1 * min2 to get the maximum product
        int product1 = max1 * max2;
        int product2 = min1 * min2;

        if (product1 > product2) {
            System.out.println("Pair is (" + max1 + ", " + max2 + "), Maximum Product: " + product1);
        } else {
            System.out.println("Pair is (" + min1 + ", " + min2 + "), Maximum Product: " + product2);
        }
    }
}
