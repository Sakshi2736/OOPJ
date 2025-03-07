 class Question_05{
    public static void main(String[] args) {
        int a = 5, b = 10; // Initialize values to a and b
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        a = a + b;     // Step 1: Add both numbers and store in 'a'
        b = a - b;     // Step 2: Subtract 'b' from new 'a' to get original 'a'
        a = a - b;     // Step 3: Subtract new 'b' from new 'a' to get original 'b'
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
