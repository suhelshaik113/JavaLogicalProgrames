//  . Write a JAVAprogram to print all negative elements in an array.  //

public class NegativeElementsInArray {
    public static void main(String[] args) {
        int[] arr = { 5, -2, 7, -8, 0, -3, 10 };

        System.out.print("Negative elements in the array: ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}