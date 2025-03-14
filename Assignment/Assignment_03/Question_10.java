/*Find Intersection and Union of Two Arrays
   ○ Find the intersection and union of two unsorted arrays.*/


public class Question_10 {
    public static void main(String args[]) { 
        int arr1[] = {1, 3, 4, 5, 6, 7};
        int arr2[] = {2, 3, 4, 5, 8, 9};

        System.out.print("Intersection: ");
        for (int i = 0; i < arr1.length; i++) {  // Loop through arr1
            for (int j = 0; j < arr2.length; j++) {  // Loop through arr2
                if (arr1[i] == arr2[j]) {  // If a common element is found
                    System.out.print(arr1[i] + " "); 
                    break;  // Stop checking once a match is found
                }
            }
        }
    }
}



/*Excution flow

1.First Loop (i = 0 → arr1[0] = 1)
Compares 1 with every element in arr2: No match found

2️.Second Loop (i = 1 → arr1[1] = 3)
- Matches 3 in arr2 → Prints 3 → break

3️.Third Loop (i = 2 → arr1[2] = 4)
- Matches 4 in arr2 → Prints 4 → break

4️. Fourth Loop (i = 3 → arr1[3] = 5)
- Matches 5 in arr2 → Prints 5 → break

5️. Fifth & Sixth Loops (i = 4 & 5 → 6 & 7)
- No matches found, so nothing is printed. */