import java.util.Scanner;

class Question_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student percentage: ");
        int percentage = sc.nextInt();
        sc.close();

        String result = (percentage >= 40) ? "Pass" : "Fail";
        System.out.println("Result: " + result);
    }
}

