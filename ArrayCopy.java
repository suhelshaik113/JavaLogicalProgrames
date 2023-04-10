// Write a JAVAprogram to copy all elements from an array to another array //

public class ArrayCopy {
    public static void main(String[] args) {
        int[] source = { 1, 2, 3, 4, 5 };
        int[] destination = new int[source.length];

        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }

        System.out.println("Elements of the source array:");
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + " ");
        }

        System.out.println("\nElements of the destination array:");
        for (int i = 0; i < destination.length; i++) {
            System.out.print(destination[i] + " ");
        }
    }
}
