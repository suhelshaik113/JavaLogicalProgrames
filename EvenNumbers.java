// Write a JAVAprogram to print all even numbers between 1 to 100. - using while loop //

public class EvenNumbers {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Even numbers between 1 to 100:");
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
