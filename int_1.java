import java.io.*;
class int_1{
public static void main(String args[]) throws IOException
{
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(in);
int n;
System.out.println("Enter Any String:");
n=Integer.parseInt(br.readLine());
System.out.println("The Given Integer is:"+n); 
}
}