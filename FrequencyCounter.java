//Write a JAVAprogram to count frequency of each element in an array //

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 3, 1, 2 };
        int[] frequency = new int[arr.length];
        
        // Initialize all frequencies to 0
        for (int i = 0; i < arr.length; i++) {
            frequency[i] = 0;
        }
        
        // Count the frequency of each element in the array
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    // To avoid counting same element again
                    frequency[j] = -1;
                }
            }
            if (frequency[i] != -1) {
                frequency[i] = count;
            }
        }
        
        // Print the frequency of each element
        for (int i = 0; i < arr.length; i++) {
            if (frequency[i] != -1) {
                System.out.println(arr[i] + " occurs " + frequency[i] + " times");
            }
        }
    }
}
