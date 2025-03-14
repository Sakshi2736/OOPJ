/*Matrix Multiplication
○ Multiply two matrices and return the resultant matrix.*/

public class Question_23 {
    public static void main(String[] args) {
        // Define two 2×2 matrices
        int[][] A = { {1, 2}, {3, 4} };
        int[][] B = { {5, 6}, {7, 8} };

        // Result matrix
        int[][] C = new int[2][2];

        // Manually calculating each element
        C[0][0] = A[0][0] * B[0][0] + A[0][1] * B[1][0];
        C[0][1] = A[0][0] * B[0][1] + A[0][1] * B[1][1];
        C[1][0] = A[1][0] * B[0][0] + A[1][1] * B[1][0];
        C[1][1] = A[1][0] * B[0][1] + A[1][1] * B[1][1];

        // Print the result matrix
        System.out.println("Resultant Matrix:");
        System.out.println(C[0][0] + " " + C[0][1]);
        System.out.println(C[1][0] + " " + C[1][1]);
    }
}


/* Execution Flow 
-->Given Matrices:
A =  1  2      B =  5  6
     3  4           7  8
--> Computation:
C[0][0] = (1×5) + (2×7) = 5 + 14 = 19
C[0][1] = (1×6) + (2×8) = 6 + 16 = 22
C[1][0] = (3×5) + (4×7) = 15 + 28 = 43
C[1][1] = (3×6) + (4×8) = 18 + 32 = 50 */