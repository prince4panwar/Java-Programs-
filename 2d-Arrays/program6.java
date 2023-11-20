//Program to display the lower triangular matrix

import java.util.Scanner;
class LowerTriangularMatrix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int j,i;
		System.out.print("\nEnter the rows : ");
		int r = sc.nextInt();
		System.out.print("Enter the column: ");
		int c = sc.nextInt();
		int arr[][]= new int[r][c];
		System.out.println("Enter the elements of the array: ");
		for(i = 0;i<r;i++) 
		{
			for(j = 0;j<c;j++) 
			{
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Displaying the Array :  ");
		for(i = 0;i<r;i++) 
		{
			for(j = 0;j<c;j++) 
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("Lower Triangular Matrix: "+"\n");
		for( i=0;i<r;i++)
        {
         for( j=0;j<c;j++)
          {
           if(i>=j)
            {
              System.out.print(arr[i][j] +" ");
            }
         else
         {
             System.out.print("0"+" ");
         } 
         }
         System.out.println();
       }  
	}
}