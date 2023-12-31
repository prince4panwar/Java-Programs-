//Program to perform Deep Copy for String?
class String2 {
    // instance variable of the class ABC
    int x = 30;
}

class DeepCopyExample {
    // main method
    public static void main(String argvs[]) {
        // creating an object of the class ABC

        String2 obj1 = new String2();

        // it will copy the reference, not value
        String2 obj2 = new String2();

        // updating the value to 6
        // using the reference variable obj2
        obj2.x = 6;

        // printing the value of x using reference variable obj1
        System.out.println("The value of x is: " + obj1.x);
    }

}