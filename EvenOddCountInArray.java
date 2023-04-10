// . Write a JAVAprogram to count total number of even and odd elements in an array  //

public class EvenOddCountInArray {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 10, 7, 3, 6 };

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("The total number of even elements in the array is: " + evenCount);
        System.out.println("The total number of odd elements in the array is: " + oddCount);
    }
}