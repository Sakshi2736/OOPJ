
import java.util.Scanner;

class MatrixArray_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// Creates a Scanner object to take input from the user.

        int[][] mat1 = new int[3][3];// Creates a 3×3 integer matrix named mat1
        int[][] mat2 = new int[3][3];// Creates a 3×3 integer matrix named mat2

        System.out.println("Enter values for mat1 :");
        fillMatrix(sc, mat1);    //Calls the fillMatrix() function to take user input
		System.out.println("______________________");
        System.out.println("Enter values for mat2:");
        fillMatrix(sc, mat2);  //Calls fillMatrix() again to take user input
		System.out.println("______________________");
        System.out.println("\nMatrix Addition:");
        printMatrix(add(mat1, mat2));//Calls the add() function to add mat1 and mat2.Calls printMatrix() to display the result.
		
		System.out.println("______________________");
        System.out.println("\nMatrix Subtraction:");
        printMatrix(sub(mat1, mat2));////Calls the sub() function to add mat1 and mat2.Calls printMatrix() to display the result.
		
		System.out.println("_______________________");
        System.out.println("\nMatrix Multiplication:");
        printMatrix(mul(mat1, mat2));////Calls the mul() function to add mat1 and mat2.Calls printMatrix() to display the result.
		
		System.out.println("_______________________");
        System.out.println("\nMatrix Division :");
        printMatrix(div(mat1, mat2));////Calls the div() function to add mat1 and mat2.Calls printMatrix() to display the result.
		

        sc.close();
    }

    public static void fillMatrix(Scanner sc, int[][] matrix) {   //Takes a Scanner and a 3×3 matrix as input.
        for (int i = 0; i < matrix.length; i++)     //Uses nested for loops to store user input in the matrix.
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = sc.nextInt();
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a.length];// (res)- is created to store the sum of corresponding elements of matrices a and b.
		for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                res[i][j] = a[i][j] + b[i][j];//Each element of the result matrix (res) is calculated as:res[0][0] = a[0][0] + b[0][0]
        return res; //The final result matrix (res) is returned to the caller.
    }

    public static int[][] sub(int[][] a, int[][] b) {
        int[][] res = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[i].length; j++)
                res[i][j] = a[i][j] - b[i][j];
        return res;
    }

    public static int[][] mul(int[][] a, int[][] b) {
        int size = a.length;
        int[][] res = new int[size][size];
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                for (int k = 0; k < size; k++)
                    res[i][j] += a[i][k] * b[k][j];
        return res;
    }

    public static double[][] div(int[][] a, int[][] b) {
        int size = a.length;
        double[][] res = new double[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (b[i][j] != 0)  // Avoid division by zero
                    res[i][j] = (double) a[i][j] / b[i][j];
                else
                    res[i][j] = 0; // Setting to 0 if division by zero occurs
            }
        }
        return res;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row)
                System.out.print(num + "\t");
            System.out.println();
        }
    }

    public static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double num : row)
                System.out.print(String.format("%.2f", num) + "\t");
            System.out.println();
        }
    }
	
}
