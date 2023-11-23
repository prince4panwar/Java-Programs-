/*Program to print the elements of an array in reverse order*/

class ReverseArray
{
public static void main(String args[])

{

int arr[]={1,2,3,4,5,6,7,8};

System.out.println("Orignal array");
for(int i=0;i<arr.length;i++)
{

System.out.println(i);
}

System.out.println("Reverse of array");
for(int i=arr.length;i>=0;i--)
{

System.out.println(i);

}



}


}