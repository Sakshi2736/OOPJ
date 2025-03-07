import java.util.Scanner;
 class Question_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10; // Add last digit to reversed number
            num /= 10; // Remove last digit
        }

        System.out.println(rev);
    }
}

/*num % 10 - Gets the last digit of num.
rev * 10 -	Moves the existing digits left (to make space for the new digit).
num /= 10 - Removes the last digit from num.
while (num != 0) -	Loops until all digits are reversed. */