//   WAP to Print the Alternate Elements in an Array  //

public class AlternateElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Alternate elements in the array:");
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}