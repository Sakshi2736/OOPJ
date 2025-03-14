/*Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class
students in a single Dimensional Array. Find and display the following:
○ Number of students securing 75% and above in aggregate.
○ Number of students securing 40% and below in aggregate. */


import java.util.Scanner;

public class Question_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = 2; // Total students
        int marks[] = new int[students]; // Array to store total marks
        int countAbove75 = 0; // Count for 75% and above
        int countBelow40 = 0; // Count for 40% and below

        // Input marks for each student
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths): ");
            int physics = sc.nextInt();
            int chemistry = sc.nextInt();
            int maths = sc.nextInt();

            marks[i] = physics + chemistry + maths; // Store total marks
            int percentage = marks[i] * 100 / 300; // Calculate percentage

            // Check conditions
            if (percentage >= 75) {
                countAbove75++;
            } else if (percentage <= 40) {
                countBelow40++;
            }
        }

        // Display results
        System.out.println("Number of students securing 75% and above: " + countAbove75);
        System.out.println("Number of students securing 40% and below: " + countBelow40);

        sc.close(); // Close Scanner
    }
}

