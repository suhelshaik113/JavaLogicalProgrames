// WAP to print all perfect numbers between given interval using functions  //

public class PerfectNumbers {
    public static void main(String[] args) {
        int start = 1, end = 1000;
        System.out.println("Perfect numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}
