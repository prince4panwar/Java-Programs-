// Program to Transpose matrix
class MatrixTranspose
{  
public static void main(String args[])
{     
int arr1[][]={{1,3,4},{5,4,3},{3,14,5}};    
int brr[][]=new int[3][3]; 

System.out.println("\nTranspose of matrix is :  ");
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{    
brr[i][j]=arr1[j][i];   
}    
} 
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{  
System.out.print(arr1[i][j]+" ");     
}
System.out.print("\n");
}
System.out.print("\n");
System.out.print("\n");
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{  
System.out.print(brr[i][j]+" ");     
}
System.out.print("\n");
}  
  
}
}