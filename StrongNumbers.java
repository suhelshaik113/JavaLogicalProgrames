// WAP to print all strong numbers between given interval using functions  //

public class StrongNumbers {
    public static void main(String[] args) {
        int start = 1, end = 1000;
        System.out.println("Strong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isStrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == n;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
