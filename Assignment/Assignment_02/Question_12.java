import java.util.Scanner;
 class Question_12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int result = n << 3; // Multiply by 8 using left shift
        System.out.println("Result after multiplying by 8: " + result);
    }
}


/*The left shift operator (<<) shifts the binary representation of a number to the left by a specified number of positions. Every left shift by 1 position doubles the number. More generally:
𝑛<<k=n*2^k
This means that shifting a number left by k bits is the same as multiplying the number by 2^k. 
We know that:8=2^3
So, shifting left by 3 places (n << 3) is the same as:𝑛 * 2^3 = n * 8
Let's take 5 and apply left shift by 3 (5 << 3):
Each left shift doubles the number:
Shift left by 1 → 5 * 2 = 10
Shift left by 2 → 10 * 2 = 20
Shift left by 3 → 20 * 2 = 40
So, 5 << 3 = 40, which is the same as 5 * 8 */