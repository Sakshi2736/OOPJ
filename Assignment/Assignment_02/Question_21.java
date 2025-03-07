
import java.util.Scanner;

 class Question_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int incremented = -(~num); // (- (~x) gives x + 1, effectively incrementing x.)
        System.out.println("Incremented number: " + incremented);
    }
}
