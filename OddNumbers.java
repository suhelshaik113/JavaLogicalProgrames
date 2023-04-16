// Write a JAVAprogram to print all odd number between 1 to 100//

public class OddNumbers {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Even numbers between 1 to 100:");
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
