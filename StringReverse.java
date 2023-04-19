//  Write a JAVAprogram to find reverse of a string  //

public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello World";
        String reverse = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        
        System.out.println("Original string: " + str);
        System.out.println("Reverse string: " + reverse);
    }
}