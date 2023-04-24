//  Write a JAVAprogram to count total number of vowels and consonants in a string  //

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int vowelCount = 0;
        int consonantCount = 0;
        
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonantCount++;
            }
        }
        
        System.out.println("Total number of vowels: " + vowelCount);
        System.out.println("Total number of consonants: " + consonantCount);
    }
}
