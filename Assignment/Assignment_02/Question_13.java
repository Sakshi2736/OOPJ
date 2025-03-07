import java.util.Scanner;
class Question_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int mask = num >> 31;      // All 1s if num is negative, all 0s if positive
        int abs = (num + mask) ^ mask; // Computes absolute value

        System.out.println("Absolute value: " + abs);
    }
}
