// . Write a JAVAprogram to find maximum and minimum element in an array  //

public class MaxMinInArray {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 10, 7, 3, 6 };

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("The maximum element in the array is: " + max);
        System.out.println("The minimum element in the array is: " + min);
    }
}