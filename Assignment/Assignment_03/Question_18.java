/*18. Print a Matrix
○ Given an m x n matrix, print all its elements row-wise*/


import java.util.Scanner;

public class Question_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for matrix size
        System.out.print("Enter rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter columns: ");
        int cols = scanner.nextInt();

        // Create matrix
        int[][] matrix = new int[rows][cols];

        // Take input for matrix
        System.out.println("Enter matrix values:");
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) { 
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print matrix row-wise
        System.out.println("Matrix output:");
        for (int i = 0; i < rows; i++) { 
            for (int j = 0; j < cols; j++) { 
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next row
        }

        scanner.close();
    }
}

/*1.User enters rows = 2, columns = 3.
2.Program creates a 2×3 matrix.
3.User enters values row-wise:
Row 1: 1 2 3
Row 2: 4 5 6
4.Program prints matrix row-wise */
