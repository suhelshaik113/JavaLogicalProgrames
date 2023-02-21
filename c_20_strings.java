//Java program that uses a loop to remove all the vowels from a given stringString str = "Hai Hello welcome to bitLabs";//
class c_20_strings{
  public static void main(String args[]){
    String s ="Hai Hello welcome to bitLabs";
    String s1="";
    //s1=s.replaceAll("[aeiou]","");
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
        if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'))
      {
          s1 = s1+ch;
      } 
    }
     System.out.println("String After Removing vowels: "+(s1));
                        
  }
}