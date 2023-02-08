/* Write a JAVAprogram to delete an element from an array at specified position.*/

import java.util.Scanner;

class deleting_Element{
public static void main(String args[]){
        int n, position, i;
     Scanner sc=new Scanner(System.in);
                
    System.out.println("Enter the size of the array:");
       n=sc.nextInt();
     int a[]=new int[n];
     System.out.println("Enter the elements of the array:");
           for(i=0;i<n;i++){
             a[i]=sc.nextInt();
        }
 System.out.println("Enter the position of the element to be deleted:");
        position=sc.nextInt();
             if(position<=0 || position>n){
            System.out.println("Invalid Position!!");
              }
              else
             {
          for(i=position-1;i<n-1;i++){
                a[i]=a[i+1];
          }
        System.out.println("The Array after deletion of the element is:");
        for(i=0;i<n-1;i++) {
             System.out.print(a[i]+ " ");
        }
      }
    }
}