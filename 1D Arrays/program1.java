// Program to copy all elements of one array into another array
public class OnearrTOAnotherArray 
{
	public static void main(String[] args) 
	{
		int arr1[] = new int[] {1,2,3 ,4 ,5};
		int arr2[] = new int[arr1.length];
		System.out.println("Elements of First array: ");
	    for (int i = 0; i < arr1.length; i++) 
	    {
	      System.out.print(arr1[i] + " ");
	    }
	    //copying the first array to the second array
	    for (int i = 0; i < arr1.length; i++)
	    {
	        arr2[i] = arr1[i];
	    }
	    System.out.println();
	    System.out.println("Elements of Second array: ");
	    for (int i = 0; i < arr2.length; i++) 
	    {
	      System.out.print(arr2[i] + " ");
	    }
	}

}
