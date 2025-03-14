class Question_01{
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 2, 30, 25}; // Example array

        int smallest = numbers[0]; // Start with the first number as smallest
        int largest = numbers[0];  // Start with the first number as largest

        for (int i = 1; i < numbers.length; i++) { // Loop through the array
            if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update smallest if a smaller number is found
            }
            if (numbers[i] > largest) {
                largest = numbers[i]; // Update largest if a larger number is found
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
