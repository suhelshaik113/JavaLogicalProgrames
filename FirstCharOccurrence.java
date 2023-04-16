//  Write a JAVAprogram to find first occurrence of a character in a given string  //

public class FirstCharOccurrence {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'o';
        int index = -1;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("The first occurrence of '" + ch + "' is at index " + index);
        } else {
            System.out.println("'" + ch + "' does not occur in the string.");
        }
    }
}
