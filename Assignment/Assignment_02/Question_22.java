import java.util.Scanner;

 class Question_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        sc.close();

        switch (op) {
            case '+': System.out.println("Result: " + (a + b)); break;
            case '-': System.out.println("Result: " + (a - b)); break;
            case '*': System.out.println("Result: " + (a * b)); break;
            case '/': 
                System.out.println("Result: " + (b == 0 ? "Cannot divide by zero" : (a / b))); 
                break;
            default: System.out.println("Invalid operator");
        }
    }
}

