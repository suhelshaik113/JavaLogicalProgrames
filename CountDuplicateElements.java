//. Write a JAVAprogram to count total number of duplicate elements in an array //

public class CountDuplicateElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 4, 5, 4};

        // Find duplicate elements in the array
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }
        }
        
        System.out.println("Total number of duplicate elements: " + count);
    }
}

