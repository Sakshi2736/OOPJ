/*14.Write a program in Java to accept 20 numbers in a single dimensional array arr[20]. Transfer
and store all the even numbers in an array even[ ] and all the odd numbers in another array
odd[ ]. Finally, print the elements of the even & the odd array*/


import java.util.Scanner;

public class Question_14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[20]; // Array to store 20 numbers

        System.out.println("Enter 20 numbers:");
        for (int i = 0; i < 20; i++) {
            arr[i] = sc.nextInt(); // Store numbers in arr[]
        }

        // Print even numbers
        System.out.print("Even numbers: ");
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 == 0) { // The program loops through arr[] to check even numbers (% 2 == 0).
                System.out.print(arr[i] + " ");//It prints all even numbers:
            }
        }

        // Print odd numbers
        System.out.print("\nOdd numbers: ");
        for (int i = 0; i < 20; i++) {
            if (arr[i] % 2 != 0) { // The program loops through arr[] again to check odd numbers (% 2 != 0).
                System.out.print(arr[i] + " ");// It prints all odd numbers:
            }
        }

        sc.close(); // Close scanner
    }
}
