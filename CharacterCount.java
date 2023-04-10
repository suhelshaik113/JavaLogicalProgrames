// Write a JAVAprogram to find total number of alphabets, digits or special character in a string  //

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello World 123!";
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                alphabetCount++;
            } else if (Character.isDigit(ch)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }
        
        System.out.println("Total number of alphabets: " + alphabetCount);
        System.out.println("Total number of digits: " + digitCount);
        System.out.println("Total number of special characters: " + specialCharCount);
    }
}

