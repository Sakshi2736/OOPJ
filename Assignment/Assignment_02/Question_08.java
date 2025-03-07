class Question_08{
    public static void main(String[] args) {
        boolean a = true, b = false, c = true; 
        
        boolean result = (a && b) || (a && c) || (b && c); 
        
        System.out.println("At least two are true: " + result);
    }
}

/*
Initialize three boolean values
Check if at least two are true using logical operators
We check all possible pairs:
-(a && b): True if both a and b are true.
-(a && c): True if both a and c are true.
-(b && c): True if both b and c are true.
-If any one of these pairs is true, then at least two values are true
Displays whether at least two values are true.*/