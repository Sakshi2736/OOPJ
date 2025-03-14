/*Sum of Two Matrices
○ Given two matrices of the same size, compute their sum.*/


public class Question_20{
    public static void main(String[] args) {
        // Define two matrices
        int[][] A = { {1, 2}, {3, 4} };
        int[][] B = { {5, 6}, {7, 8} };

        // Add and print the sum directly
        System.out.println("Sum of the matrices:");
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) { 
                System.out.print((A[i][j] + B[i][j]) + " "); // Add and print
            }
            System.out.println(); // Move to the next row
        }
    }
}
/*  Execution Process:
-Define two matrices A and B.
-Loop through each element and print the sum:
1 + 5 → 6
2 + 6 → 8
3 + 7 → 10
4 + 8 → 12*/