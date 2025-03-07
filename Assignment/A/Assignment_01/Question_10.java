import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        
        if (x > 0 && x % 2 == 0) {
            System.out.println(x + " is even and positive.");
        } else {
            System.out.println("The number is zero.");
        }
        
        sc.close();
    }
}
