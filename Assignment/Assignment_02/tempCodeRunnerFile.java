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
