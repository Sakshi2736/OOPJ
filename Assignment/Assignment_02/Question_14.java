import java.util.Scanner;

 class Question_14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int count = 0;
        while (n > 0) {
            n = n & (n - 1); // n & (n - 1) removes the rightmost set bit (1) in each step.We keep doing this until n becomes 0 and count the steps
            count++;
        }

        System.out.println("Number of 1s (set bits): " + count);
    }
}
