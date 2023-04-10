// Write a JAVAprogram to delete an element from an array at specified position //

import java.util.Scanner;

public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int pos, i;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the position of the element to be deleted: ");
        pos = input.nextInt();

        if (pos < 1 || pos > arr.length) {
            System.out.println("Invalid position!");
        } else {
            for (i = pos - 1; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;

            System.out.println("Array after deleting the element:");
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
