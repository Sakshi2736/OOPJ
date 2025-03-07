import java.util.Scanner;

 class Question_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int abs = (num < 0) ? -num : num;
        System.out.println("Absolute value: " + abs);
    }
}

