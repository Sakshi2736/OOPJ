/*Merge Two Sorted Arrays
○ Merge two sorted arrays into a single sorted array without using extra space.*/


public class Question_08{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Example array
        int k = 2; // Rotate by 2 positions

        rotateRight(numbers, k); // Call function to rotate

        // Print the rotated array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void rotateRight(int[] numbers, int k) {
        int n = numbers.length;
        k = k % n; // Handle cases where k > n

        // Rotate k times
        for (int i = 0; i < k; i++) {
            int last = numbers[n - 1]; // Store last element

            // Move all elements to the right
            for (int j = n - 1; j > 0; j--) {
                numbers[j] = numbers[j - 1];
            }

            numbers[0] = last; // Put last element at the front
        }
    }
}




/*Step-by-Step Explanation 
Take an array → {1, 2, 3, 4, 5}
Choose k (how many times to rotate) → k = 2
Rotate k times:
Store the last element.
Move all elements one step right.
Put the last element in the first position.
Repeat k times.
Print the rotated array*/
