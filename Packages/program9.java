//Create a Java program to create a nested package i.e. c4.sample with public class and protected members to be accessed in another class.class Test {

    public static void main(String args[])
    {
        c4.sample.Demo d = new c4.sample.Demo();
        
        System.out.println("rollno "+d.name);
        System.out.println("rollno "+d.rollno);

    }
    
}