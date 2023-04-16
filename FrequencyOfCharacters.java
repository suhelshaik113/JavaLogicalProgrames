//  Write a JAVAprogram to count frequency of each character in a string  //

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "suhelshaik";
        int[] charCount = new int[256];

        for (int i = 0; i < str.length(); i++) {
            charCount[str.charAt(i)]++;
        }

        for (int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                System.out.println((char) i + " occurs " + charCount[i] + " times.");
            }
        }
    }
}
