// . Write a JAVAprogram to count frequency of each element in an array //

public class FrequencyCount {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 3, 4, 5, 4};
        int[] freq = new int[arr.length];

        // Count frequency of each element in the array
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = -1;  // Mark the element as visited
                }
            }
            if (freq[i] != -1) {
                freq[i] = count;
            }
        }

        // Print frequency of each element
        System.out.println("Element\tFrequency");
        for (int i = 0; i < arr.length; i++) {
            if (freq[i] != -1) {
                System.out.println(arr[i] + "\t" + freq[i]);
            }
        }
    }
}
