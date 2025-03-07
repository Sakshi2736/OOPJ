import java.util.Scanner;

 class Question_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println((num & 1) == 0 ? "Even" : "Odd"); // No if-else
    }
}
/*Odd numbers have their last binary digit as 1.
Even numbers have their last binary digit as 0.
n & 1 → If 0, it's even; if 1, it's odd. */