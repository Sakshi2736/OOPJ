class Question_07{

    public static void main(String[] args) {
        int year = 2024; 
        
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        
        if (isLeap) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}



/*
Initialize the year
Check if it is a leap year or not using logical operators
A year is a leap year if:
-It is divisible by 4 AND not divisible by 100, OR
-It is divisible by 400.
-If isLeap is true, print that the year is a leap year.
-Otherwise, print that it is not a leap year-.
*/
