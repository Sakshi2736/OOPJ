/*. Find the Second Largest Element
○ Find the second-largest element in the given array */


class Question_03 {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 20, 8, 2, 30, 25}; // Example array

        int largest = Integer.MIN_VALUE; //Smallest possible value
        int secondLargest = Integer.MIN_VALUE;

        for (int num : numbers) {
            if (num > largest) {//If num is greater than largest
                secondLargest = largest;//Update secondLargest = largest
                largest = num;  //Update largest = num
            } else if (num > secondLargest && num != largest) {//Else if num is greater than secondLargest (but not equal to largest)
                secondLargest = num;//Update secondLargest = num
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}



/*Why is 25 the Second Largest Instead of 30?
The largest number is always updated first.
If a number is bigger than the current largest, it becomes the new largest, and the old largest moves to secondLargest.
When 30 is found, the previous largest (20) moves to secondLargest.
When 25 is found, it is bigger than secondLargest (20), so it replaces it. */
