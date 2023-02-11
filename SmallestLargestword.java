class SmallestLargestword{
  public static void main (String args[]){
    String str = "Hai hello welcome to bitlabs";
    String[] words = str.split(" ");
    String largestword = words[0];
    String smallestword = words[0];

    for (int i=0 ; i<words.length;i++){
      if (words[i].length()>largestword.length()){
        largestword = words[i];
      }
    }
    for (int i=0 ; i<words.length;i++){
      if (words[i].length()<smallestword.length()){
        smallestword = words[i];
      }
    }
    System.out.println("The largest string in given string is : "+ largestword );
  System.out.println("The largest string in given string is : "+ smallestword );
  } 
}