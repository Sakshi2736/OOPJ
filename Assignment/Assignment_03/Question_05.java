class Question_05 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // take an array

        int sum = 0;  // Variable to store the sum

        for (int num : numbers) {  // Loop through each number in the array
            sum += num;  // Add each number to sum
        }

        double average = (double) sum / numbers.length;  // Calculate average
     //Use (double) sum to ensure the division gives a decimal result.
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}

