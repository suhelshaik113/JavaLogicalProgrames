import java.util.Scanner;
public class removeduplicate{
public static void main(String[] args) {
  Scanner sc =new  Scanner(System.in);
  int n;
  System.out.println("Enter Array Size :");
     n = sc.nextInt();
    int arr[]= new int[n];
    System.out.println("Enter Elements of Array :");
    for (int i = 0 ; i<n;i++){
      arr[i]=sc.nextInt();
    }
  
 //int[] arr = {1, 2, 2, 3, 4, 4, 5, 5, 6};
  n = arr.length;
 int j = 0;
for (int i = 0; i < n; i++) 
{
 if (arr[i] != arr[j]) 
 {
 arr[++j] = arr[i];
 }
}
System.out.print("Array With out Duplicate :"); 
for (int i = 0; i <= j; i++) 
{
 System.out.print(arr[i] + " ");
}
}
}