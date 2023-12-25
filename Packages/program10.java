// Create a Java program to create a package with public class and public members to be accessed in another class.
package mayankpackage;
 class MyClass
{
    public int rollno = 7027;

    public void publicMethod()
    {
        System.out.println("if you are like follow me https://github.com/MayankDevil/");
    }
}
class Test
{
    public static void main(String[] args)
    {
        mayankpackage.MyClass my = new myPackage.MyClass();
    
        System.out.println("Mayank rollno is " + my.rollno);
    
        my.publicMethod();
    }
}
