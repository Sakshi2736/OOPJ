import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        if (n > 0 && (n & (n - 1)) == 0) {//Checks if n is a power of 2
            System.out.println(n + " is a power of 2.");//If this condition is true, then n is a power of 2.
        } else {
            System.out.println(n + " is NOT a power of 2.");// it is not a power of 2.
        }
    }
}



/*A power of 2 means a number like 1, 2, 4, 8, 16, 32, ... where only one bit is set in binary.
The trick:
n & (n - 1) == 0 → This is true only for powers of 2.
Example=
8  ->  1000 (binary)
7  ->  0111 (binary)
8 & 7 -> 0000  (so 8 is a power of 2)
We also check n > 0 because negative numbers and 0 are not powers of 2.
*/