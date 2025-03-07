 class Question_03{
    public static void main(String[] args) {
        int number = 12345; //If you meant to sum the digits of 12345, you should store it as an integer like:
// If you want number to store a value, it should be a single integer, not a comma-separated list.like this(1,2,3,4,5)

        int sum = 0;
        
        while (number > 0) {
            sum += number % 10; 
            number /= 10; 
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}

