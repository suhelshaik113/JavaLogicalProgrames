//. Write a JAVAprogram to delete an element from an array at specified position //

public class DeleteElementFromArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Delete element at position 2
        int pos = 2;
        for (int i = pos; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;  // Set last element to 0

        // Print updated array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

