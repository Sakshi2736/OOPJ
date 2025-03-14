/*19.Transpose of a Matrix
○ Given a matrix, return its transpose (swap rows and columns)
A transpose of a matrix means swapping rows and columns. That means:
-The first row becomes the first column.
-The second row becomes the second column.*/

public class Question_19{
    public static void main(String[] args) {
        int[][] matrix = { 
            {1, 2, 3}, 
            {4, 5, 6} 
        };

        int rows = matrix.length;       // Number of rows (2)
        int cols = matrix[0].length;    // Number of columns (3)

        int[][] transpose = new int[cols][rows]; // New matrix with swapped size

        // Swap rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j]; // Swap elements
            }
        }

        // Print transposed matrix
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}



/*Execution Process:
-The program creates the matrix with 2 rows & 3 columns.
-It creates a new matrix (transpose[][]) with swapped size (3 rows & 2 columns).
-It swaps elements:
transpose[0][0] = matrix[0][0] → 1
transpose[1][0] = matrix[0][1] → 2
transpose[2][0] = matrix[0][2] → 3
transpose[0][1] = matrix[1][0] → 4
transpose[1][1] = matrix[1][1] → 5
transpose[2][1] = matrix[1][2] → 6 */