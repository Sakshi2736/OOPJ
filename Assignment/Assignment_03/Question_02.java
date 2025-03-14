//

class Question_02 {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5}; // Example array
    
            int left = 0; // Start from the first element(pointing to the first element).
            int right = numbers.length - 1;// Start from the last element(pointing to the last element).

    
            while (left < right) {
                
                numbers[left] = numbers[left] + numbers[right];
                numbers[right] = numbers[left] - numbers[right];
                numbers[left] = numbers[left] - numbers[right];
    
                left++;// Move left index forward
                right--;// Move right index backward
            }
    
            // Print the reversed array
            System.out.print("Reversed Array: ");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
        }

    
}
