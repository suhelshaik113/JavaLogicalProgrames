// Write a JAVAprogram to find length of a string and compare and concatenate two strings  //

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        // Find the length of the string
        int length = str1.length();
        System.out.println("The length of the string is " + length);
        
        // Compare two strings
        if (str1.equals(str2)) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are not equal");
        }
        
        // Concatenate two strings
        String str3 = str1.concat(str2);
        System.out.println("The concatenated string is " + str3);
    }
}