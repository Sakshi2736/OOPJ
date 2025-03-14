/*Row-wise and Column-wise Sum
○ Find the sum of each row and each column of a given matrix.*/


public class Question_21 {
    public static void main(String[] args) {
        // Define a 2×2 matrix
        int[][] matrix = { {1, 2}, {3, 4} };

        // Row-wise sum
        System.out.println("Row sums:");
        System.out.println(matrix[0][0] + matrix[0][1]); // Row 1 sum
        System.out.println(matrix[1][0] + matrix[1][1]); // Row 2 sum

        // Column-wise sum
        System.out.println("Column sums:");
        System.out.println(matrix[0][0] + matrix[1][0]); // Column 1 sum
        System.out.println(matrix[0][1] + matrix[1][1]); // Column 2 sum
    }
}
