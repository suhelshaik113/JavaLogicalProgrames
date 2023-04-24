// Write a JAVAprogram to print all unique elements in the array //

public class UniqueElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 4, 5, 4};

        // Find unique elements in the array
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
