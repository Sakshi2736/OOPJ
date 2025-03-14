/*Find the Diagonal Sum
○ Compute the sum of both diagonals in a square matrix.*/

public class Question_25{
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };

        int n = matrix.length; 
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += matrix[i][i]; // Primary diagonal (↘)
            if (i != n - 1 - i) { // Avoid double-counting center in odd-sized matrix
                sum += matrix[i][n - 1 - i]; // Secondary diagonal (↙)
            }
        }

        System.out.println("Total Diagonal Sum: " + sum);
    }
}

/*Excution 
Given Matrix
Copy code
1  2  3
4  5  6
7  8  9
 Step 1: Identify Diagonal Elements
Primary Diagonal (↘) → 1, 5, 9
Secondary Diagonal (↙) → 3, 5, 7
The middle element (5) appears twice, so we only count it once.
 Step 2: Compute Sum
Total Sum = 1 + 5 + 9 + 3 + 7 = 25
 Step 3: Print Output*/