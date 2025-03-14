/*Remove Duplicates from a Sorted Array
○ Remove duplicate elements from a sorted array without using extra space*/


public class Question_06{
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 2, 3, 4, 4, 5}; // Sorted array with duplicates

        int uniqueCount = removeDuplicates(numbers); // Call function

        // Print the updated array
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static int removeDuplicates(int[] numbers) {
        int index = 0; // Pointer for unique elements

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[index]) { // If a new unique element is found
                index++; // Move index forward
                numbers[index] = numbers[i]; // Store unique element
            }
        }
        return index + 1; // Return count of unique elements
    }
}
