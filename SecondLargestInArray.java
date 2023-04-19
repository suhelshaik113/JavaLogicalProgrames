//  . Write a JAVAprogram to find second largest element in an array.  //

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 10, 7, 3, 6 };

        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The second largest element in the array is: " + secondLargest);
    }
}