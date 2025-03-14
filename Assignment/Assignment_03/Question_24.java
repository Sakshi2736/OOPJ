/*Rotate a Matrix by 90 Degrees
○ Rotate a given N x N matrix by 90 degrees clockwise*/


public class Question_24 {
    public static void main(String[] args) {
        int[][] matrix = { 
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9} 
        };

        int n = matrix.length;

        // Step 1: Create a new rotated matrix
        int[][] rotated = new int[n][n];

        // Step 2: Rotate by 90° (Swap rows into columns)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n - 1 - i] = matrix[i][j];  
            }
        }

        // Step 3: Print rotated matrix
        System.out.println("Rotated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/*Excution
Given Matrix (Before Rotation)
1  2  3
4  5  6
7  8  9
- Step 1: Create an Empty Rotated Matrix
0  0  0
0  0  0
0  0  0
-Step 2: Swap Row Elements into Column (90° Rotation)
7  4  1
8  5  2
9  6  3
- Step 3: Print the Rotated Matrix */