/*Find the Maximum Element in a Matrix
○ Find the largest element in a given matrix.*/


public class Question_22 {
    public static void main(String[] args) {
        int[][] matrix = { {1, 5}, {7, 2} }; // Small 2×2 matrix

        int max = matrix[0][0]; // Assume first element is the max

        // Check all elements
        if (matrix[0][1] > max) max = matrix[0][1];
        if (matrix[1][0] > max) max = matrix[1][0];
        if (matrix[1][1] > max) max = matrix[1][1];

        System.out.println("Maximum element: " + max);
    }
}


/*Execution Process:
-Start with first element → max = 1
-Compare each element manually:
 Compare 5 → max = 5
 Compare 7 → max = 7
 Compare 2 → max = 7
-Final max element = 7 */