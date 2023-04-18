// . WAP to print reverse case of a given string  //

public class ReverseCase {
    public static void main(String[] args) {
        String str = "Hello World!";
        String reversedStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                reversedStr += (char) (ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                reversedStr += (char) (ch - 32);
            } else {
                reversedStr += ch;
            }
        }

        System.out.println("Reverse case of \"" + str + "\":");
        System.out.println(reversedStr);
    }
}