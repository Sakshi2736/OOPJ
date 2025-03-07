public class Question_01 {
        static int i;         // Default: 0
        static float f;       // Default: 0.0
        static double d;      // Default: 0.0
        static char ch;       // Default: '\u0000' (null character)
        static boolean b;     // Default: false
        static byte by;       // Default: 0
        static short s;       // Default: 0
        static long l;        // Default: 0L
        static String S;      // Default: null (since String is an object)
        
        public static void main(String args[]) {
            // Printing default values of data types in Java
            System.out.println("Default int: " + i);
            System.out.println("Default byte: " + by);
            System.out.println("Default char: " +ch); 
            System.out.println("Default boolean: " + b);
            System.out.println("Default float: " + f);
            System.out.println("Default double: " + d);
            System.out.println("Default String: " + S);
            System.out.println("Default short: " + s);
            System.out.println("Default long: " + l);
        }}

