import java.util.*;
class bubblesort{
  public static void main(String args[]){
    int n,i,j,t;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size :");
    n = sc.nextInt();
    int a[]= new int[n];
    System.out.println("Enter Elements of Array :");
    for (i = 0 ; i<n;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("The Elements before sorting :");
    for (i = 0 ; i<n;i++){
      System.out.print(" "+a[i]);
    }
    //Bubble Sorting Start
    for(i=0;i<n-1;i++)
    {
     for(j=0;j<n-1-i;j++){
       if (a[j]>a[j+1]){
         t=a[j];
         a[j]=a[j+1];
         a[j+1]=t;
       }
     } 
    }
    System.out.println("\nThe Elements after sorting :");
    for(i=0;i<n;i++){
      System.out.print(" "+a[i]);
    }
  }
}