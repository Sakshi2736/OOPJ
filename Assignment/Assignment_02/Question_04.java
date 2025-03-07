class Question_04{
    public static void main(String[] args) {
        int number = 27; 
        int sum = 0;
        
        while (number > 0) {
            sum += number & 1; // Add last bit
            number -= 3; 
        }
        
        if (sum == 0 || sum == 3) {
            System.out.println("Divisible by 3");
        } else {
            System.out.println("Not divisible by 3");
        }
    }
}
