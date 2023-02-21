//Printing the second largest and second smallest element in an array:int numbers[] = {32, 43, 53, 54, 32, 65, 63, 98, 43, 23};//


class array_c20{
  public static void main(String args[]){
    int temp;
    int array[] = {32,43,53,54,32,65,63,98,43,23};

      for(int i = 0; i<array.length; i++ ){
         for(int j = i+1; j<array.length; j++){

            if(array[i]<array[j]){
                temp = array[i];
               array[i] = array[j];
               array[j] = temp;
            }
         }
      }
System.out.println("The second largest element : "+ array[1]);
System.out.println("The second smallest element : "+ array[array.length-2]);
  }
  }
  
     
  
   
  

