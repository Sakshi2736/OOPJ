class Question_04{
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 3, 7, 2}; // Example array

        int evenCount = 0;  // Counter for even numbers
        int oddCount = 0;   // Counter for odd numbers

        for (int num : numbers) {  // Loop through each number
            if (num % 2 == 0) {    // Check if the number is even
                evenCount++;       // Increase even counter
            } else {   //Else, the number is odd            
                oddCount++;        // Increase odd counter
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}

