import java.util.Scanner;

class Question_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        // Find the minimum using step-by-step ternary operators
        int min1 = (a < b) ? a : b; // Minimum of a and b
        int min2 = (c < d) ? c : d; // Minimum of c and d
        int min = (min1 < min2) ? min1 : min2; // Final minimum

        System.out.println("Minimum number is: " + min);
    }
}
