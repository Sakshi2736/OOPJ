/*10.Find Intersection and Union of Two Arrays
   ○ Find the intersection and union of two unsorted arrays.*/


public class Question_09 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // Given array (3 is missing)
        int n = arr.length + 1; // Array size should be n-1, so n = arr.length + 1

        int missingNumber = findMissingNumber(arr, n); // Function call

        System.out.println("Missing number: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr, int n) {
        int sumTotal = n * (n + 1) / 2; // Sum of first n numbers
        int sumArray = 0;

        // Calculate sum of elements in the array
        for (int num : arr) {
            sumArray += num;
        }

        return sumTotal - sumArray; // Missing number is the difference
    }
}





/*Excution Flow
1.Find the value of n (total numbers including the missing one)
      n = arr.length + 1
      n = 4 + 1 = 5
2.Calculate the expected sum of numbers from 1 to n using the formula:
sumTotal = n * (n + 1) / 2
         = 5 * (5 + 1) / 2
         = 5 * 6 / 2
         = 15
3.Calculate the sum of the given array elements:
sumArray = 1 + 2 + 4 + 5
         = 12
4.Find the missing number by subtracting sumArray from sumTotal:
missingNumber = sumTotal - sumArray
              = 15 - 12
              = 
5.Print the result:Output: Missing number: 3 */
         