/*

16.  Given two sorted arrays A and B of size p and q, write a Java program to merge elements of 
A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B 
with remaining elements. 
Example: 
Input : 
int[] A = { 1, 5, 6, 7, 8, 10 } 
int[] B = { 2, 4, 9 } 
Output: 
Sorted Arrays: 
A: [1, 2, 4, 5, 6, 7] 
B: [8, 9, 10] 

*/


import java.util.Arrays;

class Question_16{
    public static void main(String[] args) {
        int[] A = {1, 5, 6, 7, 8, 10};
        int[] B = {2, 4, 9};

        mergeAndSort(A, B);

        System.out.println("Sorted Arrays:");
        System.out.println("A: " + Arrays.toString(A));
        System.out.println("B: " + Arrays.toString(B));
    }

    public static void mergeAndSort(int[] A, int[] B) {
        int p = A.length;
        int q = B.length;
        int[] merged = new int[p + q];

        // Merge arrays into a single array
        System.arraycopy(A, 0, merged, 0, p);
        System.arraycopy(B, 0, merged, p, q);

        // Sort the merged array
        Arrays.sort(merged);

        // Fill A with the first p smallest elements
        System.arraycopy(merged, 0, A, 0, p);

        // Fill B with the remaining elements
        System.arraycopy(merged, p, B, 0, q);
    }
}
