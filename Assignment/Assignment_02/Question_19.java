import java.util.Scanner;

class Question_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        String result = (ch >= 'A' && ch <= 'Z') ? "Uppercase"
                    : (ch >= 'a' && ch <= 'z') ? "Lowercase"
                    : "Not a Letter";

        System.out.println("Character type: " + result);
    }
}
