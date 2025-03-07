class Question_06{
    public static void main(String[] args) {
        int a = 11, b = 10, c = 17; 
        
        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c); 
        
        System.out.println("Largest number: " + largest);
    }
}



/*
Initialize three numbers
Find the largest using the ternary operator
First, check if a > b
-If true, compare a with c → The larger of the two is assigned.
-If false, compare b with c → The larger of the two is assigned
-Displays the largest number.Initialize three numbers
Find the largest using the ternary operator
*/