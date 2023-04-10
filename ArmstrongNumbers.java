// . WAP to print all Armstrong numbers between given interval using functions  //

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int start = 1, end = 1000;
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isArmstrong(int n) {
        int sum = 0, temp = n, digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }
}

