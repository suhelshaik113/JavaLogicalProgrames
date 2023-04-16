// Write a JAVAprogram to count total number of negative elements in an array //

public class NegativeCountInArray {
    public static void main(String[] args) {
        int[] arr = { 5, -8, 2, -10, 7, 3, -6 };

        int negativeCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println("The total number of negative elements in the array is: " + negativeCount);
    }
}
