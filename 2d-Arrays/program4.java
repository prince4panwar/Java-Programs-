// Program to subtract the two matrices
class MatrixSubstraction
{  
public static void main(String args[])
{     
int arr1[][]={{15,3,4},{15,4,3},{3,4,5}};    
int arr2[][]={{1,8,4},{2,4,13},{1,12,4}};    
int arr3[][]=new int[3][3]; 

System.out.println("\nSubstraction of two matrix is :  ");  
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{    
arr3[i][j]=arr1[i][j]-arr2[i][j];     
}    
} 
for(int i=0;i<3;i++)
{    
for(int j=0;j<3;j++)
{  
System.out.print(arr3[i][j]+" ");     
}
System.out.print("\n");
}  
}
}