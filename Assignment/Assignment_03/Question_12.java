/*12.Find Missing Number in an Array
○ Given an array of size n-1 containing numbers from 1 to n, find the missing number*/



import java.util.Scanner;

public class Question_12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Declare an array of size 20
        int[] numbers = new int[20];

        // Step 2: Take input from the user by using for loop
        System.out.println("Enter 20 integers:");
        for (int i = 0; i < 20; i++) {
            numbers[i] = sc.nextInt();
        }

        // Step 3: Initialize counters-We set evenCount, oddCount, and multipleOf3Count to 0.
        int evenCount = 0; 
       int oddCount = 0; 
       int multipleOf3Count = 0;

        // Step 4: Process the array using for each loop.
        for (int num : numbers) {
            if (num % 2 == 0) {//the number is even, so we increase evenCount.
                evenCount++; // Number is even
            } else {//the number is odd, so we increase oddCount.
                oddCount++; // Number is odd
            }
            if (num % 3 == 0) {//he number is a multiple of 3, so we increase multipleOf3Count.
                multipleOf3Count++; // Number is a multiple of 3
            }
        }

        // Step 5: Display the results
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of multiples of 3: " + multipleOf3Count);

        sc.close();
    }
}

