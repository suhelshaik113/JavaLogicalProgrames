//WAP to Print the Alternate Elements in an Array//
  
public class alternate_elements_of_array
{
	public static void main(String[] args) {
	    int[]array ={1,2,3,4,5,6,7,8,9};
	    for (int i = 0; i<array.length; i +=2){
		System.out.println(array[i]+" ");
	}
	}
}