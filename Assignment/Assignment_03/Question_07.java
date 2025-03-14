public class Question_07 {
    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 44, 55}; // Example array
        int k = 2; // Rotate by 2 positions

        rotateRight(numbers, k); // Call function to rotate

        // Print the rotated array
        System.out.print("Rotated Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void rotateRight(int[] numbers, int k) {
        int n = numbers.length;
        k = k % n; // Handle cases where k > n

        // Reverse entire array→ {11, 22, 33, 44, 55} → {55, 44, 33, 22, 11}
        reverse(numbers, 0, n - 1);
        // Reverse first k elements→ {55, 44, 33, 22, 11} → {44, 55, 33, 22, 11}
        reverse(numbers, 0, k - 1);
        // Reverse remaining elements→ {44, 55, 33, 22, 11} → {44, 55, 11, 22, 33}
        reverse(numbers, k, n - 1);
    }

    public static void reverse(int[] numbers, int start, int end) {
        while (start < end) {
            // Swap numbers[start] and numbers[end]
            numbers[start] = numbers[start] + numbers[end];
            numbers[end] = numbers[start] - numbers[end];
            numbers[start] = numbers[start] - numbers[end];

            start++;
            end--;
        }
    }
}

