/*

15.  Write a Java program to print all sub-arrays with 0 sum present in a given array of integers. 
Example: 
Input : 
nums1 = { 1, 3, -7, 3, 2, 3, 1, -3, -2, -2 } 
nums2 = { 1, 2, -3, 4, 5, 6 } 
nums3= { 1, 2, -2, 3, 4, 5, 6 } 
Output: 
Sub-arrays with 0 sum : [1, 3, -7, 3] 
Sub-arrays with 0 sum : [3, -7, 3, 2, 3, 1, -3, -2] 
Sub-arrays with 0 sum : [1, 2, -3] 
Sub-arrays with 0 sum : [2, -2] 

*/




class Question_15 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2};
        int[] nums2 = {1, 2, -3, 4, 5, 6};
        int[] nums3 = {1, 2, -2, 3, 4, 5, 6};

        findZeroSumSubarrays(nums1);
        findZeroSumSubarrays(nums2);
        findZeroSumSubarrays(nums3);
    }

    public static void findZeroSumSubarrays(int[] nums) {
        System.out.println("Sub-arrays with 0 sum :");
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                if (currentSum == 0) {
                    System.out.print("[");
                    for (int k = i; k <= j; k++) {
                        System.out.print(nums[k]);
                        if (k < j) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println("]");
                }
            }
        }
    }
}
