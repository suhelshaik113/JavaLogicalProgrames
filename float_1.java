
import java.io.*;
class float_1{
public static void main(String args[]) throws IOException
{
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
float n;
System.out.println("Enter Any String:");
n=Float.parseFloat(br.readLine());
System.out.println("The Given Integer is:"+n); 
}
}