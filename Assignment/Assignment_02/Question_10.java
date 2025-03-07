class Question_10{
public static void main(String[] arge){

char ch = 'a'; // Example character
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                        ? "Vowel" : "Consonant";
        System.out.println("Character is: " + result);
    }}