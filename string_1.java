import java.io.*;
class string_1{
public static void main(String args[]) throws IOException
{
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
String s;
System.out.println("Enter Any String:");
s=br.readLine();
System.out.println("The Given String is:"+s); 
}
}