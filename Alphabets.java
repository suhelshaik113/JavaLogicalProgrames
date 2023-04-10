// Write a JAVAprogram to print all alphabets from a to z. - using while loop//

public class Alphabets{
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println("Alphabets from a to z:");
        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
        }
    }
}
