import java.util.*;
class Count_of_Element{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size");
    int n = sc.nextInt();
    int[] arr = new int[n];

    int[] a = new int[n];
    System.out.println("Enter array values :");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      a[i] = arr[i];
    }

    int j = 0;

    for (int i = 0; i < n; i++) {

      if (arr[i] != arr[j]) {

        arr[++j] = arr[i];

      }
    }
    for (int i = 0; i <= j; i++) {
     
      int c = 0;
      for (int m = 0; m < n; m++) {
        if (arr[i] == a[m]) {
          c++;
        }
      }
      if (c >= 1) {
        System.out.println(" count of " + arr[i] + " is " + c);
      }
    }
  }
}