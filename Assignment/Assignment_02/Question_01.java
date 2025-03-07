
class Question_01 {
    public static void main(String[] args) {
        int a =18;
		int b = 13;

        
        a = a ^ b;  
        b = a ^ b;  
        a = a ^ b;  

        
        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
